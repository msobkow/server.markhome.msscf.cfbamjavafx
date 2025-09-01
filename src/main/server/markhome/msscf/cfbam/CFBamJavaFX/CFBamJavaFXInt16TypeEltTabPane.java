// Description: Java 11 JavaFX Element TabPane implementation for Int16Type.

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
import java.util.List;
import javafx.scene.Parent;
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
 *	CFBamJavaFXInt16TypeEltTabPane JavaFX Element TabPane implementation
 *	for Int16Type.
 */
public class CFBamJavaFXInt16TypeEltTabPane
extends CFTabPane
implements ICFBamJavaFXInt16TypePaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabChildrenRefTableColList = "Optional Children Referencing Table Columns";
	protected CFTab tabChildrenRefTableCol = null;
	public final String LABEL_TabChildrenRefIndexColList = "Optional Children Referencing Index Columns";
	protected CFTab tabChildrenRefIndexCol = null;
	protected CFBorderPane tabViewChildrenRefTableColListPane = null;
	protected CFBorderPane tabViewChildrenRefIndexColListPane = null;

	public CFBamJavaFXInt16TypeEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamInt16TypeObj argFocus ) {
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
		setJavaFXFocusAsInt16Type( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabChildrenRefTableCol = new CFTab();
		tabChildrenRefTableCol.setText( LABEL_TabChildrenRefTableColList );
		tabChildrenRefTableCol.setContent( getTabViewChildrenRefTableColListPane() );
		getTabs().add( tabChildrenRefTableCol );
		tabChildrenRefIndexCol = new CFTab();
		tabChildrenRefIndexCol.setText( LABEL_TabChildrenRefIndexColList );
		tabChildrenRefIndexCol.setContent( getTabViewChildrenRefIndexColListPane() );
		getTabs().add( tabChildrenRefIndexCol );
		javafxIsInitializing = false;
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

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamInt16TypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamInt16TypeObj" );
		}
	}

	public void setJavaFXFocusAsInt16Type( ICFBamInt16TypeObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamInt16TypeObj getJavaFXFocusAsInt16Type() {
		return( (ICFBamInt16TypeObj)getJavaFXFocus() );
	}

	protected class RefreshChildrenRefTableColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefTableColList() {
		}

		public void refreshMe() {
			Collection<ICFBamTableColObj> dataCollection;
			ICFBamInt16TypeObj focus = (ICFBamInt16TypeObj)getJavaFXFocusAsInt16Type();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefTableCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenRefTableColListPane();
			ICFBamJavaFXTableColPaneList jpList = (ICFBamJavaFXTableColPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenRefTableColListPane() {
		if( tabViewChildrenRefTableColListPane == null ) {
			ICFBamInt16TypeObj focus = (ICFBamInt16TypeObj)getJavaFXFocusAsInt16Type();
			Collection<ICFBamTableColObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefTableCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamTableObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamTableObj ) ) {
				javafxContainer = (ICFBamTableObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenRefTableColListPane = javafxSchema.getTableColFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenRefTableColList(), false );
		}
		return( tabViewChildrenRefTableColListPane );
	}

	protected class RefreshChildrenRefIndexColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefIndexColList() {
		}

		public void refreshMe() {
			Collection<ICFBamIndexColObj> dataCollection;
			ICFBamInt16TypeObj focus = (ICFBamInt16TypeObj)getJavaFXFocusAsInt16Type();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefIndexCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenRefIndexColListPane();
			ICFBamJavaFXIndexColPaneList jpList = (ICFBamJavaFXIndexColPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenRefIndexColListPane() {
		if( tabViewChildrenRefIndexColListPane == null ) {
			ICFBamInt16TypeObj focus = (ICFBamInt16TypeObj)getJavaFXFocusAsInt16Type();
			Collection<ICFBamIndexColObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenRefIndexCol( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamIndexObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamIndexObj ) ) {
				javafxContainer = (ICFBamIndexObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewChildrenRefIndexColListPane = javafxSchema.getIndexColFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenRefIndexColList(), false );
		}
		return( tabViewChildrenRefIndexColListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewChildrenRefTableColListPane != null ) {
			((ICFBamJavaFXTableColPaneCommon)tabViewChildrenRefTableColListPane).setPaneMode( value );
		}
		if( tabViewChildrenRefIndexColListPane != null ) {
			((ICFBamJavaFXIndexColPaneCommon)tabViewChildrenRefIndexColListPane).setPaneMode( value );
		}
	}
}
