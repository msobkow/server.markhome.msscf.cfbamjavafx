// Description: Java 11 JavaFX Element TabPane implementation for UInt64Col.

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
 *	CFBamJavaFXUInt64ColEltTabPane JavaFX Element TabPane implementation
 *	for UInt64Col.
 */
public class CFBamJavaFXUInt64ColEltTabPane
extends CFTabPane
implements ICFBamJavaFXUInt64ColPaneCommon
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

	public CFBamJavaFXUInt64ColEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamUInt64ColObj argFocus ) {
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
		setJavaFXFocusAsUInt64Col( argFocus );
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
		if( ( value == null ) || ( value instanceof ICFBamUInt64ColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamUInt64ColObj" );
		}
	}

	public void setJavaFXFocusAsUInt64Col( ICFBamUInt64ColObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamUInt64ColObj getJavaFXFocusAsUInt64Col() {
		return( (ICFBamUInt64ColObj)getJavaFXFocus() );
	}

	protected class RefreshChildrenRefTableColList
	implements ICFRefreshCallback
	{
		public RefreshChildrenRefTableColList() {
		}

		public void refreshMe() {
			Collection<ICFBamTableColObj> dataCollection;
			ICFBamUInt64ColObj focus = (ICFBamUInt64ColObj)getJavaFXFocusAsUInt64Col();
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
			ICFBamUInt64ColObj focus = (ICFBamUInt64ColObj)getJavaFXFocusAsUInt64Col();
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
			ICFBamUInt64ColObj focus = (ICFBamUInt64ColObj)getJavaFXFocusAsUInt64Col();
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
			ICFBamUInt64ColObj focus = (ICFBamUInt64ColObj)getJavaFXFocusAsUInt64Col();
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
