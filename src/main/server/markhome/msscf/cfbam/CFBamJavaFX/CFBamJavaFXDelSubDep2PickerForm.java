// Description: Java 11 JavaFX Picker Form implementation for DelSubDep2.

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
 *	CFBamJavaFXDelSubDep2PickerForm JavaFX Picker Form implementation
 *	for DelSubDep2.
 */
public class CFBamJavaFXDelSubDep2PickerForm
extends CFBorderPane
implements ICFBamJavaFXDelSubDep2PaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamDelSubDep2Obj> javafxDataCollection = null;

	public CFBamJavaFXDelSubDep2PickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamDelSubDep2Obj argFocus,
		ICFBamDelSubDep1Obj argContainer,
		Collection<ICFBamDelSubDep2Obj> argDataCollection,
		ICFBamJavaFXDelSubDep2Chosen whenChosen )
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
		javafxPickerPane = argSchema.getDelSubDep2Factory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsDelSubDep2( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamDelSubDep2Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamDelSubDep2Obj" );
		}
		((ICFBamJavaFXDelSubDep2PaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamDelSubDep2Obj)value );
	}

	public ICFBamDelSubDep2Obj getJavaFXFocusAsDelSubDep2() {
		return( (ICFBamDelSubDep2Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDelSubDep2( ICFBamDelSubDep2Obj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamDelSubDep2Obj> getJavaFXDataCollection() {
		ICFBamJavaFXDelSubDep2PaneList jplPicker = (ICFBamJavaFXDelSubDep2PaneList)javafxPickerPane;
		Collection<ICFBamDelSubDep2Obj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamDelSubDep2Obj> value ) {
		ICFBamJavaFXDelSubDep2PaneList jplPicker = (ICFBamJavaFXDelSubDep2PaneList)javafxPickerPane;
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
			ICFBamJavaFXDelSubDep2PaneCommon jpanelCommon = (ICFBamJavaFXDelSubDep2PaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamDelSubDep1Obj getJavaFXContainer() {
		ICFBamJavaFXDelSubDep2PaneList jplPicker = (ICFBamJavaFXDelSubDep2PaneList)javafxPickerPane;
		ICFBamDelSubDep1Obj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamDelSubDep1Obj value ) {
		ICFBamJavaFXDelSubDep2PaneList jplPicker = (ICFBamJavaFXDelSubDep2PaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
