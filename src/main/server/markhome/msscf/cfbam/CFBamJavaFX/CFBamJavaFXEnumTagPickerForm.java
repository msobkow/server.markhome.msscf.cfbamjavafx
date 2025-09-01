// Description: Java 11 JavaFX Picker Form implementation for EnumTag.

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
 *	CFBamJavaFXEnumTagPickerForm JavaFX Picker Form implementation
 *	for EnumTag.
 */
public class CFBamJavaFXEnumTagPickerForm
extends CFBorderPane
implements ICFBamJavaFXEnumTagPaneList,
	ICFForm
{
	protected ICFFormManager cfFormManager = null;
	protected CFBorderPane javafxPickerPane = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamEnumTagObj> javafxDataCollection = null;

	public CFBamJavaFXEnumTagPickerForm( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamEnumTagObj argFocus,
		ICFBamEnumDefObj argContainer,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFBamJavaFXEnumTagChosen whenChosen )
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
		javafxPickerPane = argSchema.getEnumTagFactory().newPickerPane( cfFormManager, argFocus, argContainer, argDataCollection, whenChosen );
		setJavaFXFocusAsEnumTag( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamEnumTagObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamEnumTagObj" );
		}
		((ICFBamJavaFXEnumTagPaneCommon)javafxPickerPane).setJavaFXFocus( (ICFBamEnumTagObj)value );
	}

	public ICFBamEnumTagObj getJavaFXFocusAsEnumTag() {
		return( (ICFBamEnumTagObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsEnumTag( ICFBamEnumTagObj value ) {
		setJavaFXFocus( value );
	}

	public Collection<ICFBamEnumTagObj> getJavaFXDataCollection() {
		ICFBamJavaFXEnumTagPaneList jplPicker = (ICFBamJavaFXEnumTagPaneList)javafxPickerPane;
		Collection<ICFBamEnumTagObj> cltn = jplPicker.getJavaFXDataCollection();
		return( cltn );
	}

	public void setJavaFXDataCollection( Collection<ICFBamEnumTagObj> value ) {
		ICFBamJavaFXEnumTagPaneList jplPicker = (ICFBamJavaFXEnumTagPaneList)javafxPickerPane;
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
			ICFBamJavaFXEnumTagPaneCommon jpanelCommon = (ICFBamJavaFXEnumTagPaneCommon)javafxPickerPane;
			jpanelCommon.setPaneMode( value );
		}
	}

	public ICFBamEnumDefObj getJavaFXContainer() {
		ICFBamJavaFXEnumTagPaneList jplPicker = (ICFBamJavaFXEnumTagPaneList)javafxPickerPane;
		ICFBamEnumDefObj cnt = jplPicker.getJavaFXContainer();
		return( cnt );
	}

	public void setJavaFXContainer( ICFBamEnumDefObj value ) {
		ICFBamJavaFXEnumTagPaneList jplPicker = (ICFBamJavaFXEnumTagPaneList)javafxPickerPane;
		jplPicker.setJavaFXContainer( value );
	}
}
