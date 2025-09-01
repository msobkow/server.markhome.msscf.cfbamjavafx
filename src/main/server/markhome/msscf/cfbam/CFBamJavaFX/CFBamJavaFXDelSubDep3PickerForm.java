// Description: Java 11 JavaFX Picker Form implementation for DelSubDep3.

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
 *	CFBamJavaFXDelSubDep3PickerForm JavaFX Picker Form implementation
 *	for DelSubDep3.
 */
public class CFBamJavaFXDelSubDep3PickerForm
extends CFBorderPane
implements ICFBamJavaFXDelSubDep3PaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamDelSubDep3Obj> javafxDataCollection = null;

	public CFBamJavaFXDelSubDep3PickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamDelSubDep3Obj argFocus,
		ICFBamDelSubDep2Obj argContainer,
		Collection<ICFBamDelSubDep3Obj> argDataCollection,
		ICFBamJavaFXDelSubDep3Chosen whenChosen )
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
		javafxPickerPane = argSchema.getDelSubDep3Factory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsDelSubDep3( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamDelSubDep3Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamDelSubDep3Obj" );
		}
		((ICFBamJavaFXDelSubDep3PaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamDelSubDep3Obj)value );
	}

	public ICFBamDelSubDep3Obj getJavaFXFocusAsDelSubDep3() {
		return( (ICFBamDelSubDep3Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDelSubDep3( ICFBamDelSubDep3Obj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamDelSubDep3Obj> getJavaFXDataCollection() {
		ICFBamJavaFXDelSubDep3PaneList jplPicker = (ICFBamJavaFXDelSubDep3PaneList)javafxPickerPane;
		Collection<ICFBamDelSubDep3Obj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamDelSubDep3Obj> value ) {
		ICFBamJavaFXDelSubDep3PaneList jplPicker = (ICFBamJavaFXDelSubDep3PaneList)javafxPickerPane;
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
			ICFBamJavaFXDelSubDep3PaneCommon jpanelCommon = (ICFBamJavaFXDelSubDep3PaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamDelSubDep2Obj getJavaFXContainer() {
		ICFBamJavaFXDelSubDep3PaneList jplPicker = (ICFBamJavaFXDelSubDep3PaneList)javafxPickerPane;
		ICFBamDelSubDep2Obj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamDelSubDep2Obj value ) {
		ICFBamJavaFXDelSubDep3PaneList jplPicker = (ICFBamJavaFXDelSubDep3PaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
