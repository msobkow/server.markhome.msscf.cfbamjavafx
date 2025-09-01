// Description: Java 11 JavaFX Picker Form implementation for PopSubDep3.

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
 *	CFBamJavaFXPopSubDep3PickerForm JavaFX Picker Form implementation
 *	for PopSubDep3.
 */
public class CFBamJavaFXPopSubDep3PickerForm
extends CFBorderPane
implements ICFBamJavaFXPopSubDep3PaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamPopSubDep3Obj> javafxDataCollection = null;

	public CFBamJavaFXPopSubDep3PickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamPopSubDep3Obj argFocus,
		ICFBamPopSubDep2Obj argContainer,
		Collection<ICFBamPopSubDep3Obj> argDataCollection,
		ICFBamJavaFXPopSubDep3Chosen whenChosen )
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
		javafxPickerPane = argSchema.getPopSubDep3Factory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsPopSubDep3( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamPopSubDep3Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopSubDep3Obj" );
		}
		((ICFBamJavaFXPopSubDep3PaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamPopSubDep3Obj)value );
	}

	public ICFBamPopSubDep3Obj getJavaFXFocusAsPopSubDep3() {
		return( (ICFBamPopSubDep3Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopSubDep3( ICFBamPopSubDep3Obj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamPopSubDep3Obj> getJavaFXDataCollection() {
		ICFBamJavaFXPopSubDep3PaneList jplPicker = (ICFBamJavaFXPopSubDep3PaneList)javafxPickerPane;
		Collection<ICFBamPopSubDep3Obj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamPopSubDep3Obj> value ) {
		ICFBamJavaFXPopSubDep3PaneList jplPicker = (ICFBamJavaFXPopSubDep3PaneList)javafxPickerPane;
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
			ICFBamJavaFXPopSubDep3PaneCommon jpanelCommon = (ICFBamJavaFXPopSubDep3PaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamPopSubDep2Obj getJavaFXContainer() {
		ICFBamJavaFXPopSubDep3PaneList jplPicker = (ICFBamJavaFXPopSubDep3PaneList)javafxPickerPane;
		ICFBamPopSubDep2Obj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamPopSubDep2Obj value ) {
		ICFBamJavaFXPopSubDep3PaneList jplPicker = (ICFBamJavaFXPopSubDep3PaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
