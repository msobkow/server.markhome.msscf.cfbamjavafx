// Description: Java 11 JavaFX Picker Form implementation for Id32Gen.

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
 *	CFBamJavaFXId32GenPickerForm JavaFX Picker Form implementation
 *	for Id32Gen.
 */
public class CFBamJavaFXId32GenPickerForm
extends CFBorderPane
implements ICFBamJavaFXId32GenPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamId32GenObj> javafxDataCollection = null;

	public CFBamJavaFXId32GenPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamId32GenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamId32GenObj> argDataCollection,
		ICFBamJavaFXId32GenChosen whenChosen )
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
		javafxPickerPane = argSchema.getId32GenFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsId32Gen( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamId32GenObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamId32GenObj" );
		}
		((ICFBamJavaFXId32GenPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamId32GenObj)value );
	}

	public ICFBamId32GenObj getJavaFXFocusAsId32Gen() {
		return( (ICFBamId32GenObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsId32Gen( ICFBamId32GenObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamId32GenObj> getJavaFXDataCollection() {
		ICFBamJavaFXId32GenPaneList jplPicker = (ICFBamJavaFXId32GenPaneList)javafxPickerPane;
		Collection<ICFBamId32GenObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamId32GenObj> value ) {
		ICFBamJavaFXId32GenPaneList jplPicker = (ICFBamJavaFXId32GenPaneList)javafxPickerPane;
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
			ICFBamJavaFXId32GenPaneCommon jpanelCommon = (ICFBamJavaFXId32GenPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamSchemaDefObj getJavaFXContainer() {
		ICFBamJavaFXId32GenPaneList jplPicker = (ICFBamJavaFXId32GenPaneList)javafxPickerPane;
		ICFBamSchemaDefObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamSchemaDefObj value ) {
		ICFBamJavaFXId32GenPaneList jplPicker = (ICFBamJavaFXId32GenPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
