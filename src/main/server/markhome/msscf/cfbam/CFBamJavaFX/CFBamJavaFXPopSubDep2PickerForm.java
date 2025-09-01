// Description: Java 11 JavaFX Picker Form implementation for PopSubDep2.

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
 *	CFBamJavaFXPopSubDep2PickerForm JavaFX Picker Form implementation
 *	for PopSubDep2.
 */
public class CFBamJavaFXPopSubDep2PickerForm
extends CFBorderPane
implements ICFBamJavaFXPopSubDep2PaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamPopSubDep2Obj> javafxDataCollection = null;

	public CFBamJavaFXPopSubDep2PickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamPopSubDep2Obj argFocus,
		ICFBamPopSubDep1Obj argContainer,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFBamJavaFXPopSubDep2Chosen whenChosen )
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
		javafxPickerPane = argSchema.getPopSubDep2Factory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsPopSubDep2( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamPopSubDep2Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopSubDep2Obj" );
		}
		((ICFBamJavaFXPopSubDep2PaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamPopSubDep2Obj)value );
	}

	public ICFBamPopSubDep2Obj getJavaFXFocusAsPopSubDep2() {
		return( (ICFBamPopSubDep2Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopSubDep2( ICFBamPopSubDep2Obj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamPopSubDep2Obj> getJavaFXDataCollection() {
		ICFBamJavaFXPopSubDep2PaneList jplPicker = (ICFBamJavaFXPopSubDep2PaneList)javafxPickerPane;
		Collection<ICFBamPopSubDep2Obj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamPopSubDep2Obj> value ) {
		ICFBamJavaFXPopSubDep2PaneList jplPicker = (ICFBamJavaFXPopSubDep2PaneList)javafxPickerPane;
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
			ICFBamJavaFXPopSubDep2PaneCommon jpanelCommon = (ICFBamJavaFXPopSubDep2PaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamPopSubDep1Obj getJavaFXContainer() {
		ICFBamJavaFXPopSubDep2PaneList jplPicker = (ICFBamJavaFXPopSubDep2PaneList)javafxPickerPane;
		ICFBamPopSubDep1Obj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamPopSubDep1Obj value ) {
		ICFBamJavaFXPopSubDep2PaneList jplPicker = (ICFBamJavaFXPopSubDep2PaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
