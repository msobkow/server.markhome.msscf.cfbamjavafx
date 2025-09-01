// Description: Java 11 JavaFX Element TabPane implementation for SchemaDef.

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
 *	CFBamJavaFXSchemaDefEltTabPane JavaFX Element TabPane implementation
 *	for SchemaDef.
 */
public class CFBamJavaFXSchemaDefEltTabPane
extends CFTabPane
implements ICFBamJavaFXSchemaDefPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsTablesList = "Optional Components Table Definitions";
	protected CFTab tabComponentsTables = null;
	public final String LABEL_TabComponentsTypesList = "Optional Components Type Definitions";
	protected CFTab tabComponentsTypes = null;
	public final String LABEL_TabComponentsSchemaRefsList = "Optional Components Schema References";
	protected CFTab tabComponentsSchemaRefs = null;
	protected CFBorderPane tabViewComponentsTablesListPane = null;
	protected CFBorderPane tabViewComponentsTypesListPane = null;
	protected CFBorderPane tabViewComponentsSchemaRefsListPane = null;

	public CFBamJavaFXSchemaDefEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamSchemaDefObj argFocus ) {
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
		setJavaFXFocusAsSchemaDef( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsTables = new CFTab();
		tabComponentsTables.setText( LABEL_TabComponentsTablesList );
		tabComponentsTables.setContent( getTabViewComponentsTablesListPane() );
		getTabs().add( tabComponentsTables );
		tabComponentsTypes = new CFTab();
		tabComponentsTypes.setText( LABEL_TabComponentsTypesList );
		tabComponentsTypes.setContent( getTabViewComponentsTypesListPane() );
		getTabs().add( tabComponentsTypes );
		tabComponentsSchemaRefs = new CFTab();
		tabComponentsSchemaRefs.setText( LABEL_TabComponentsSchemaRefsList );
		tabComponentsSchemaRefs.setContent( getTabViewComponentsSchemaRefsListPane() );
		getTabs().add( tabComponentsSchemaRefs );
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
		if( ( value == null ) || ( value instanceof ICFBamSchemaDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamSchemaDefObj" );
		}
	}

	public void setJavaFXFocusAsSchemaDef( ICFBamSchemaDefObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamSchemaDefObj getJavaFXFocusAsSchemaDef() {
		return( (ICFBamSchemaDefObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsTablesList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTablesList() {
		}

		public void refreshMe() {
			Collection<ICFBamTableObj> dataCollection;
			ICFBamSchemaDefObj focus = (ICFBamSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTables( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsTablesListPane();
			ICFBamJavaFXTablePaneList jpList = (ICFBamJavaFXTablePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsTablesListPane() {
		if( tabViewComponentsTablesListPane == null ) {
			ICFBamSchemaDefObj focus = (ICFBamSchemaDefObj)getJavaFXFocusAsSchemaDef();
			Collection<ICFBamTableObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTables( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamSchemaDefObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamSchemaDefObj ) ) {
				javafxContainer = (ICFBamSchemaDefObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsTablesListPane = javafxSchema.getTableFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsTablesList(), false );
		}
		return( tabViewComponentsTablesListPane );
	}

	protected class RefreshComponentsTypesList
	implements ICFRefreshCallback
	{
		public RefreshComponentsTypesList() {
		}

		public void refreshMe() {
			Collection<ICFBamValueObj> dataCollection;
			ICFBamSchemaDefObj focus = (ICFBamSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTypes( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsTypesListPane();
			ICFBamJavaFXValuePaneList jpList = (ICFBamJavaFXValuePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsTypesListPane() {
		if( tabViewComponentsTypesListPane == null ) {
			ICFBamSchemaDefObj focus = (ICFBamSchemaDefObj)getJavaFXFocusAsSchemaDef();
			Collection<ICFBamValueObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsTypes( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamScopeObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamScopeObj ) ) {
				javafxContainer = (ICFBamScopeObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsTypesListPane = javafxSchema.getValueFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsTypesList(), true );
		}
		return( tabViewComponentsTypesListPane );
	}

	protected class RefreshComponentsSchemaRefsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsSchemaRefsList() {
		}

		public void refreshMe() {
			Collection<ICFBamSchemaRefObj> dataCollection;
			ICFBamSchemaDefObj focus = (ICFBamSchemaDefObj)getJavaFXFocusAsSchemaDef();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSchemaRefs( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsSchemaRefsListPane();
			ICFBamJavaFXSchemaRefPaneList jpList = (ICFBamJavaFXSchemaRefPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsSchemaRefsListPane() {
		if( tabViewComponentsSchemaRefsListPane == null ) {
			ICFBamSchemaDefObj focus = (ICFBamSchemaDefObj)getJavaFXFocusAsSchemaDef();
			Collection<ICFBamSchemaRefObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsSchemaRefs( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			ICFBamSchemaDefObj javafxContainer;
			if( ( focus != null ) && ( focus instanceof ICFBamSchemaDefObj ) ) {
				javafxContainer = (ICFBamSchemaDefObj)focus;
			}
			else {
				javafxContainer = null;
			}
			tabViewComponentsSchemaRefsListPane = javafxSchema.getSchemaRefFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsSchemaRefsList(), true );
		}
		return( tabViewComponentsSchemaRefsListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsTablesListPane != null ) {
			((ICFBamJavaFXTablePaneCommon)tabViewComponentsTablesListPane).setPaneMode( value );
		}
		if( tabViewComponentsTypesListPane != null ) {
			((ICFBamJavaFXValuePaneCommon)tabViewComponentsTypesListPane).setPaneMode( value );
		}
		if( tabViewComponentsSchemaRefsListPane != null ) {
			((ICFBamJavaFXSchemaRefPaneCommon)tabViewComponentsSchemaRefsListPane).setPaneMode( value );
		}
	}
}
