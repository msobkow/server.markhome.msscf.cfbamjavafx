// Description: Java 11 JavaFX Picker Form implementation for PopSubDep1.

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
 *	CFBamJavaFXPopSubDep1PickerForm JavaFX Picker Form implementation
 *	for PopSubDep1.
 */
public class CFBamJavaFXPopSubDep1PickerForm
extends CFBorderPane
implements ICFBamJavaFXPopSubDep1PaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamPopSubDep1Obj> javafxDataCollection = null;

	public CFBamJavaFXPopSubDep1PickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamPopSubDep1Obj argFocus,
		ICFBamPopTopDepObj argContainer,
		Collection<ICFBamPopSubDep1Obj> argDataCollection,
		ICFBamJavaFXPopSubDep1Chosen whenChosen )
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
		javafxPickerPane = argSchema.getPopSubDep1Factory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsPopSubDep1( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamPopSubDep1Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopSubDep1Obj" );
		}
		((ICFBamJavaFXPopSubDep1PaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamPopSubDep1Obj)value );
	}

	public ICFBamPopSubDep1Obj getJavaFXFocusAsPopSubDep1() {
		return( (ICFBamPopSubDep1Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopSubDep1( ICFBamPopSubDep1Obj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamPopSubDep1Obj> getJavaFXDataCollection() {
		ICFBamJavaFXPopSubDep1PaneList jplPicker = (ICFBamJavaFXPopSubDep1PaneList)javafxPickerPane;
		Collection<ICFBamPopSubDep1Obj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamPopSubDep1Obj> value ) {
		ICFBamJavaFXPopSubDep1PaneList jplPicker = (ICFBamJavaFXPopSubDep1PaneList)javafxPickerPane;
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
			ICFBamJavaFXPopSubDep1PaneCommon jpanelCommon = (ICFBamJavaFXPopSubDep1PaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamPopTopDepObj getJavaFXContainer() {
		ICFBamJavaFXPopSubDep1PaneList jplPicker = (ICFBamJavaFXPopSubDep1PaneList)javafxPickerPane;
		ICFBamPopTopDepObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamPopTopDepObj value ) {
		ICFBamJavaFXPopSubDep1PaneList jplPicker = (ICFBamJavaFXPopSubDep1PaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
