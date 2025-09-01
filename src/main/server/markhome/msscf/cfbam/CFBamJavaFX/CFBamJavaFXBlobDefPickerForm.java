// Description: Java 11 JavaFX Picker Form implementation for BlobDef.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXBlobDefPickerForm JavaFX Picker Form implementation
 *	for BlobDef.
 */
public class CFBamJavaFXBlobDefPickerForm
extends CFBorderPane
implements ICFBamJavaFXBlobDefPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamBlobDefObj> javafxDataCollection = null;

	public CFBamJavaFXBlobDefPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamBlobDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamBlobDefObj> argDataCollection,
		ICFBamJavaFXBlobDefChosen whenChosen )
	{
		super();
		final String S_ProcName = "construct-schema-focus";
		if( formManager == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"formManager" );
		}
		cfFormManager = formManager;
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				2,
				"argSchema" );
		}
		if( whenChosen == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				6,
				"whenChosen" );
		}
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javafxPickerPane = argSchema.getBlobDefFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsBlobDef( argFocus );
		setJavaFXDataCollection( argDataCollection );
		setJavaFXContainer( argContainer );
		setCenter( javafxPickerPane );
		setPaneMode( CFPane.PaneMode.View );
	}

	public ICFFormManager getCFFormManager() {
		return( cfFormManager );
	}

	public void setCFFormManager( ICFFormManager value ) {
		final String S_ProcName = "setCFFormManager";
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				S_ProcName,
				1,
				"value" );
		}
		cfFormManager = value;
	}

	public void forceCancelAndClose() {
		if( cfFormManager != null ) {
			if( cfFormManager.getCurrentForm() == this ) {
				cfFormManager.closeCurrentForm();
			}
		}
	}

	public ICFBamJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamBlobDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamBlobDefObj" );
		}
		((ICFBamJavaFXBlobDefPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamBlobDefObj)value );
	}

	public ICFBamBlobDefObj getJavaFXFocusAsBlobDef() {
		return( (ICFBamBlobDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsBlobDef( ICFBamBlobDefObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamBlobDefObj> getJavaFXDataCollection() {
		ICFBamJavaFXBlobDefPaneList jplPicker = (ICFBamJavaFXBlobDefPaneList)javafxPickerPane;
		Collection<ICFBamBlobDefObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamBlobDefObj> value ) {
		ICFBamJavaFXBlobDefPaneList jplPicker = (ICFBamJavaFXBlobDefPaneList)javafxPickerPane;
		jplPicker.setJavaFXDataCollection( value );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		if( value != CFPane.PaneMode.View ) {
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				"PickerForms only support PaneMode View" );
		}
		super.setPaneMode( value );
		if( javafxPickerPane != null ) {
			ICFBamJavaFXBlobDefPaneCommon jpanelCommon = (ICFBamJavaFXBlobDefPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamScopeObj getJavaFXContainer() {
		ICFBamJavaFXBlobDefPaneList jplPicker = (ICFBamJavaFXBlobDefPaneList)javafxPickerPane;
		ICFBamScopeObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamScopeObj value ) {
		ICFBamJavaFXBlobDefPaneList jplPicker = (ICFBamJavaFXBlobDefPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
