// Description: Java 11 JavaFX Picker Form implementation for ClearSubDep1.

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
 *	CFBamJavaFXClearSubDep1PickerForm JavaFX Picker Form implementation
 *	for ClearSubDep1.
 */
public class CFBamJavaFXClearSubDep1PickerForm
extends CFBorderPane
implements ICFBamJavaFXClearSubDep1PaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamClearSubDep1Obj> javafxDataCollection = null;

	public CFBamJavaFXClearSubDep1PickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamClearSubDep1Obj argFocus,
		ICFBamClearTopDepObj argContainer,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFBamJavaFXClearSubDep1Chosen whenChosen )
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
		javafxPickerPane = argSchema.getClearSubDep1Factory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsClearSubDep1( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamClearSubDep1Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamClearSubDep1Obj" );
		}
		((ICFBamJavaFXClearSubDep1PaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamClearSubDep1Obj)value );
	}

	public ICFBamClearSubDep1Obj getJavaFXFocusAsClearSubDep1() {
		return( (ICFBamClearSubDep1Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsClearSubDep1( ICFBamClearSubDep1Obj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamClearSubDep1Obj> getJavaFXDataCollection() {
		ICFBamJavaFXClearSubDep1PaneList jplPicker = (ICFBamJavaFXClearSubDep1PaneList)javafxPickerPane;
		Collection<ICFBamClearSubDep1Obj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamClearSubDep1Obj> value ) {
		ICFBamJavaFXClearSubDep1PaneList jplPicker = (ICFBamJavaFXClearSubDep1PaneList)javafxPickerPane;
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
			ICFBamJavaFXClearSubDep1PaneCommon jpanelCommon = (ICFBamJavaFXClearSubDep1PaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamClearTopDepObj getJavaFXContainer() {
		ICFBamJavaFXClearSubDep1PaneList jplPicker = (ICFBamJavaFXClearSubDep1PaneList)javafxPickerPane;
		ICFBamClearTopDepObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamClearTopDepObj value ) {
		ICFBamJavaFXClearSubDep1PaneList jplPicker = (ICFBamJavaFXClearSubDep1PaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
