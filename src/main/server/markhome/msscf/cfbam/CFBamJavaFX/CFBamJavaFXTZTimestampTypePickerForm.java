// Description: Java 11 JavaFX Picker Form implementation for TZTimestampType.

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
 *	CFBamJavaFXTZTimestampTypePickerForm JavaFX Picker Form implementation
 *	for TZTimestampType.
 */
public class CFBamJavaFXTZTimestampTypePickerForm
extends CFBorderPane
implements ICFBamJavaFXTZTimestampTypePaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamTZTimestampTypeObj> javafxDataCollection = null;

	public CFBamJavaFXTZTimestampTypePickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamTZTimestampTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTZTimestampTypeObj> argDataCollection,
		ICFBamJavaFXTZTimestampTypeChosen whenChosen )
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
		javafxPickerPane = argSchema.getTZTimestampTypeFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsTZTimestampType( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamTZTimestampTypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamTZTimestampTypeObj" );
		}
		((ICFBamJavaFXTZTimestampTypePaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamTZTimestampTypeObj)value );
	}

	public ICFBamTZTimestampTypeObj getJavaFXFocusAsTZTimestampType() {
		return( (ICFBamTZTimestampTypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsTZTimestampType( ICFBamTZTimestampTypeObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamTZTimestampTypeObj> getJavaFXDataCollection() {
		ICFBamJavaFXTZTimestampTypePaneList jplPicker = (ICFBamJavaFXTZTimestampTypePaneList)javafxPickerPane;
		Collection<ICFBamTZTimestampTypeObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamTZTimestampTypeObj> value ) {
		ICFBamJavaFXTZTimestampTypePaneList jplPicker = (ICFBamJavaFXTZTimestampTypePaneList)javafxPickerPane;
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
			ICFBamJavaFXTZTimestampTypePaneCommon jpanelCommon = (ICFBamJavaFXTZTimestampTypePaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamSchemaDefObj getJavaFXContainer() {
		ICFBamJavaFXTZTimestampTypePaneList jplPicker = (ICFBamJavaFXTZTimestampTypePaneList)javafxPickerPane;
		ICFBamSchemaDefObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamSchemaDefObj value ) {
		ICFBamJavaFXTZTimestampTypePaneList jplPicker = (ICFBamJavaFXTZTimestampTypePaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
