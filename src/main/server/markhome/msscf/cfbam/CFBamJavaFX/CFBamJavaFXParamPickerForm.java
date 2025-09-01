// Description: Java 11 JavaFX Picker Form implementation for Param.

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
 *	CFBamJavaFXParamPickerForm JavaFX Picker Form implementation
 *	for Param.
 */
public class CFBamJavaFXParamPickerForm
extends CFBorderPane
implements ICFBamJavaFXParamPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamParamObj> javafxDataCollection = null;

	public CFBamJavaFXParamPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamParamObj argFocus,
		ICFBamServerMethodObj argContainer,
		Collection<ICFBamParamObj> argDataCollection,
		ICFBamJavaFXParamChosen whenChosen )
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
		javafxPickerPane = argSchema.getParamFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsParam( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamParamObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamParamObj" );
		}
		((ICFBamJavaFXParamPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamParamObj)value );
	}

	public ICFBamParamObj getJavaFXFocusAsParam() {
		return( (ICFBamParamObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsParam( ICFBamParamObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamParamObj> getJavaFXDataCollection() {
		ICFBamJavaFXParamPaneList jplPicker = (ICFBamJavaFXParamPaneList)javafxPickerPane;
		Collection<ICFBamParamObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamParamObj> value ) {
		ICFBamJavaFXParamPaneList jplPicker = (ICFBamJavaFXParamPaneList)javafxPickerPane;
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
			ICFBamJavaFXParamPaneCommon jpanelCommon = (ICFBamJavaFXParamPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamServerMethodObj getJavaFXContainer() {
		ICFBamJavaFXParamPaneList jplPicker = (ICFBamJavaFXParamPaneList)javafxPickerPane;
		ICFBamServerMethodObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamServerMethodObj value ) {
		ICFBamJavaFXParamPaneList jplPicker = (ICFBamJavaFXParamPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
