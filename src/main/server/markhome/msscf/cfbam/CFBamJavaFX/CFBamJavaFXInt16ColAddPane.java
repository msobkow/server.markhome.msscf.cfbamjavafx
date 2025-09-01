// Description: Java 11 JavaFX Add Pane implementation for Int16Col.

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
import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
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
 *	CFBamJavaFXInt16ColAddPane JavaFX Add Pane implementation
 *	for Int16Col.
 */
public class CFBamJavaFXInt16ColAddPane
extends CFSplitPane
implements ICFBamJavaFXInt16ColPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected ScrollPane attrScrollPane = null;
	protected CFGridPane attrPane = null;

	public CFBamJavaFXInt16ColAddPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamInt16ColObj argFocus ) {
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
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		setJavaFXFocus( argFocus );
		attrPane = argSchema.getInt16ColFactory().newAttrPane( cfFormManager, argFocus );
		attrScrollPane = new ScrollPane( attrPane );
		attrScrollPane.setFitToWidth( true );
		attrScrollPane.setHbarPolicy( ScrollBarPolicy.NEVER );
		attrScrollPane.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
		attrScrollPane.setContent( attrPane );
		setOrientation( Orientation.VERTICAL );
		getItems().add( attrScrollPane );
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

	public ICFBamJavaFXSchema getJavaFXSchema() {
		return( javafxSchema );
	}

	public ICFLibAnyObj getJavaFXFocus() {
		ICFLibAnyObj obj;
		if( attrPane != null ) {
			obj = attrPane.getJavaFXFocus();
		}
		else {
			obj = null;
		}
		return( obj );
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamInt16ColObj ) ) {
			super.setJavaFXFocus( value );
			if( ( attrPane != null ) && ( attrPane.getJavaFXFocus() != value ) ) {
				attrPane.setJavaFXFocus( value );
			}
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamInt16ColObj" );
		}
	}

	public void setJavaFXFocusAsInt16Col( ICFBamInt16ColObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamInt16ColObj getJavaFXFocusAsInt16Col() {
		return( (ICFBamInt16ColObj)getJavaFXFocus() );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldValue = getPaneMode();
		if( value == oldValue ) {
			return;
		}
		try {
			super.setPaneMode( value );
			((ICFBamJavaFXInt16ColPaneCommon)attrPane).setPaneMode( value );
		}
		catch( Throwable t ) {
			super.setPaneMode( oldValue );
			((ICFBamJavaFXInt16ColPaneCommon)attrPane).setPaneMode( oldValue );
			throw t;
		}
	}
}
