// Description: Java 11 JavaFX Picker Form implementation for ClearTopDep.

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
 *	CFBamJavaFXClearTopDepPickerForm JavaFX Picker Form implementation
 *	for ClearTopDep.
 */
public class CFBamJavaFXClearTopDepPickerForm
extends CFBorderPane
implements ICFBamJavaFXClearTopDepPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamClearTopDepObj> javafxDataCollection = null;

	public CFBamJavaFXClearTopDepPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamClearTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFBamJavaFXClearTopDepChosen whenChosen )
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
		javafxPickerPane = argSchema.getClearTopDepFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsClearTopDep( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamClearTopDepObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamClearTopDepObj" );
		}
		((ICFBamJavaFXClearTopDepPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamClearTopDepObj)value );
	}

	public ICFBamClearTopDepObj getJavaFXFocusAsClearTopDep() {
		return( (ICFBamClearTopDepObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsClearTopDep( ICFBamClearTopDepObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamClearTopDepObj> getJavaFXDataCollection() {
		ICFBamJavaFXClearTopDepPaneList jplPicker = (ICFBamJavaFXClearTopDepPaneList)javafxPickerPane;
		Collection<ICFBamClearTopDepObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamClearTopDepObj> value ) {
		ICFBamJavaFXClearTopDepPaneList jplPicker = (ICFBamJavaFXClearTopDepPaneList)javafxPickerPane;
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
			ICFBamJavaFXClearTopDepPaneCommon jpanelCommon = (ICFBamJavaFXClearTopDepPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamTableObj getJavaFXContainer() {
		ICFBamJavaFXClearTopDepPaneList jplPicker = (ICFBamJavaFXClearTopDepPaneList)javafxPickerPane;
		ICFBamTableObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamTableObj value ) {
		ICFBamJavaFXClearTopDepPaneList jplPicker = (ICFBamJavaFXClearTopDepPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
