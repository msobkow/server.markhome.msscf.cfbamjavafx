// Description: Java 11 JavaFX Element TabPane implementation for Table.

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
 *	CFBamJavaFXTableEltTabPane JavaFX Element TabPane implementation
 *	for Table.
 */
public class CFBamJavaFXTableEltTabPane
extends CFTabPane
implements ICFBamJavaFXTablePaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected boolean javafxIsInitializing = true;
	public final String LABEL_TabComponentsRelationList = "Optional Components Relation Definitions";
	protected CFTab tabComponentsRelation = null;
	public final String LABEL_TabComponentsIndexList = "Optional Components Index Definitions";
	protected CFTab tabComponentsIndex = null;
	public final String LABEL_TabComponentsColumnsList = "Optional Components Columns";
	protected CFTab tabComponentsColumns = null;
	public final String LABEL_TabChildrenReverseRelationsList = "Optional Children Reverse Relations";
	protected CFTab tabChildrenReverseRelations = null;
	public final String LABEL_TabComponentsChainsList = "Optional Components Chains";
	protected CFTab tabComponentsChains = null;
	public final String LABEL_TabComponentsDelDepList = "Optional Components Deletion Dependency";
	protected CFTab tabComponentsDelDep = null;
	public final String LABEL_TabComponentsClearDepList = "Optional Components Clear Relationships Dependency";
	protected CFTab tabComponentsClearDep = null;
	public final String LABEL_TabChildrenDispId16GenList = "Optional Children Dispensed Id16 Generators";
	protected CFTab tabChildrenDispId16Gen = null;
	public final String LABEL_TabChildrenDispId32GenList = "Optional Children Dispensed Id32 Generators";
	protected CFTab tabChildrenDispId32Gen = null;
	public final String LABEL_TabChildrenDispId64GenList = "Optional Children Dispensed Id64 Generators";
	protected CFTab tabChildrenDispId64Gen = null;
	public final String LABEL_TabComponentsServerMethodsList = "Optional Components Server Methods";
	protected CFTab tabComponentsServerMethods = null;
	protected CFBorderPane tabViewComponentsRelationListPane = null;
	protected CFBorderPane tabViewComponentsIndexListPane = null;
	protected CFBorderPane tabViewComponentsColumnsListPane = null;
	protected CFBorderPane tabViewChildrenReverseRelationsListPane = null;
	protected CFBorderPane tabViewComponentsChainsListPane = null;
	protected CFBorderPane tabViewComponentsDelDepListPane = null;
	protected CFBorderPane tabViewComponentsClearDepListPane = null;
	protected CFBorderPane tabViewChildrenDispId16GenListPane = null;
	protected CFBorderPane tabViewChildrenDispId32GenListPane = null;
	protected CFBorderPane tabViewChildrenDispId64GenListPane = null;
	protected CFBorderPane tabViewComponentsServerMethodsListPane = null;

	public CFBamJavaFXTableEltTabPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamTableObj argFocus ) {
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
		setJavaFXFocusAsTable( argFocus );
		// Wire the newly constructed Panes/Tabs to this TabPane
		tabComponentsRelation = new CFTab();
		tabComponentsRelation.setText( LABEL_TabComponentsRelationList );
		tabComponentsRelation.setContent( getTabViewComponentsRelationListPane() );
		getTabs().add( tabComponentsRelation );
		tabComponentsIndex = new CFTab();
		tabComponentsIndex.setText( LABEL_TabComponentsIndexList );
		tabComponentsIndex.setContent( getTabViewComponentsIndexListPane() );
		getTabs().add( tabComponentsIndex );
		tabComponentsColumns = new CFTab();
		tabComponentsColumns.setText( LABEL_TabComponentsColumnsList );
		tabComponentsColumns.setContent( getTabViewComponentsColumnsListPane() );
		getTabs().add( tabComponentsColumns );
		tabChildrenReverseRelations = new CFTab();
		tabChildrenReverseRelations.setText( LABEL_TabChildrenReverseRelationsList );
		tabChildrenReverseRelations.setContent( getTabViewChildrenReverseRelationsListPane() );
		getTabs().add( tabChildrenReverseRelations );
		tabComponentsChains = new CFTab();
		tabComponentsChains.setText( LABEL_TabComponentsChainsList );
		tabComponentsChains.setContent( getTabViewComponentsChainsListPane() );
		getTabs().add( tabComponentsChains );
		tabComponentsDelDep = new CFTab();
		tabComponentsDelDep.setText( LABEL_TabComponentsDelDepList );
		tabComponentsDelDep.setContent( getTabViewComponentsDelDepListPane() );
		getTabs().add( tabComponentsDelDep );
		tabComponentsClearDep = new CFTab();
		tabComponentsClearDep.setText( LABEL_TabComponentsClearDepList );
		tabComponentsClearDep.setContent( getTabViewComponentsClearDepListPane() );
		getTabs().add( tabComponentsClearDep );
		tabChildrenDispId16Gen = new CFTab();
		tabChildrenDispId16Gen.setText( LABEL_TabChildrenDispId16GenList );
		tabChildrenDispId16Gen.setContent( getTabViewChildrenDispId16GenListPane() );
		getTabs().add( tabChildrenDispId16Gen );
		tabChildrenDispId32Gen = new CFTab();
		tabChildrenDispId32Gen.setText( LABEL_TabChildrenDispId32GenList );
		tabChildrenDispId32Gen.setContent( getTabViewChildrenDispId32GenListPane() );
		getTabs().add( tabChildrenDispId32Gen );
		tabChildrenDispId64Gen = new CFTab();
		tabChildrenDispId64Gen.setText( LABEL_TabChildrenDispId64GenList );
		tabChildrenDispId64Gen.setContent( getTabViewChildrenDispId64GenListPane() );
		getTabs().add( tabChildrenDispId64Gen );
		tabComponentsServerMethods = new CFTab();
		tabComponentsServerMethods.setText( LABEL_TabComponentsServerMethodsList );
		tabComponentsServerMethods.setContent( getTabViewComponentsServerMethodsListPane() );
		getTabs().add( tabComponentsServerMethods );
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
		if( ( value == null ) || ( value instanceof ICFBamTableObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamTableObj" );
		}
	}

	public void setJavaFXFocusAsTable( ICFBamTableObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamTableObj getJavaFXFocusAsTable() {
		return( (ICFBamTableObj)getJavaFXFocus() );
	}

	protected class RefreshComponentsRelationList
	implements ICFRefreshCallback
	{
		public RefreshComponentsRelationList() {
		}

		public void refreshMe() {
			Collection<ICFBamRelationObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsRelation( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsRelationListPane();
			ICFBamJavaFXRelationPaneList jpList = (ICFBamJavaFXRelationPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsRelationListPane() {
		if( tabViewComponentsRelationListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamRelationObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsRelation( javafxIsInitializing );
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
			tabViewComponentsRelationListPane = javafxSchema.getRelationFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsRelationList(), false );
		}
		return( tabViewComponentsRelationListPane );
	}

	protected class RefreshComponentsIndexList
	implements ICFRefreshCallback
	{
		public RefreshComponentsIndexList() {
		}

		public void refreshMe() {
			Collection<ICFBamIndexObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsIndex( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsIndexListPane();
			ICFBamJavaFXIndexPaneList jpList = (ICFBamJavaFXIndexPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsIndexListPane() {
		if( tabViewComponentsIndexListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamIndexObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsIndex( javafxIsInitializing );
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
			tabViewComponentsIndexListPane = javafxSchema.getIndexFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsIndexList(), false );
		}
		return( tabViewComponentsIndexListPane );
	}

	protected class RefreshComponentsColumnsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsColumnsList() {
		}

		public void refreshMe() {
			Collection<ICFBamValueObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsColumns( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsColumnsListPane();
			ICFBamJavaFXValuePaneList jpList = (ICFBamJavaFXValuePaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsColumnsListPane() {
		if( tabViewComponentsColumnsListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamValueObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsColumns( javafxIsInitializing );
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
			tabViewComponentsColumnsListPane = javafxSchema.getValueFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsColumnsList(), true );
		}
		return( tabViewComponentsColumnsListPane );
	}

	protected class RefreshChildrenReverseRelationsList
	implements ICFRefreshCallback
	{
		public RefreshChildrenReverseRelationsList() {
		}

		public void refreshMe() {
			Collection<ICFBamRelationObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenReverseRelations( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenReverseRelationsListPane();
			ICFBamJavaFXRelationPaneList jpList = (ICFBamJavaFXRelationPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenReverseRelationsListPane() {
		if( tabViewChildrenReverseRelationsListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamRelationObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenReverseRelations( javafxIsInitializing );
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
			tabViewChildrenReverseRelationsListPane = javafxSchema.getRelationFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenReverseRelationsList(), false );
		}
		return( tabViewChildrenReverseRelationsListPane );
	}

	protected class RefreshComponentsChainsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsChainsList() {
		}

		public void refreshMe() {
			Collection<ICFBamChainObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsChains( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsChainsListPane();
			ICFBamJavaFXChainPaneList jpList = (ICFBamJavaFXChainPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsChainsListPane() {
		if( tabViewComponentsChainsListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamChainObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsChains( javafxIsInitializing );
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
			tabViewComponentsChainsListPane = javafxSchema.getChainFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsChainsList(), false );
		}
		return( tabViewComponentsChainsListPane );
	}

	protected class RefreshComponentsDelDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsDelDepList() {
		}

		public void refreshMe() {
			Collection<ICFBamDelTopDepObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsDelDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsDelDepListPane();
			ICFBamJavaFXDelTopDepPaneList jpList = (ICFBamJavaFXDelTopDepPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsDelDepListPane() {
		if( tabViewComponentsDelDepListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamDelTopDepObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsDelDep( javafxIsInitializing );
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
			tabViewComponentsDelDepListPane = javafxSchema.getDelTopDepFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsDelDepList(), true );
		}
		return( tabViewComponentsDelDepListPane );
	}

	protected class RefreshComponentsClearDepList
	implements ICFRefreshCallback
	{
		public RefreshComponentsClearDepList() {
		}

		public void refreshMe() {
			Collection<ICFBamClearTopDepObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsClearDep( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsClearDepListPane();
			ICFBamJavaFXClearTopDepPaneList jpList = (ICFBamJavaFXClearTopDepPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsClearDepListPane() {
		if( tabViewComponentsClearDepListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamClearTopDepObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsClearDep( javafxIsInitializing );
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
			tabViewComponentsClearDepListPane = javafxSchema.getClearTopDepFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsClearDepList(), true );
		}
		return( tabViewComponentsClearDepListPane );
	}

	protected class RefreshChildrenDispId16GenList
	implements ICFRefreshCallback
	{
		public RefreshChildrenDispId16GenList() {
		}

		public void refreshMe() {
			Collection<ICFBamId16GenObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenDispId16Gen( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenDispId16GenListPane();
			ICFBamJavaFXId16GenPaneList jpList = (ICFBamJavaFXId16GenPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenDispId16GenListPane() {
		if( tabViewChildrenDispId16GenListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamId16GenObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenDispId16Gen( javafxIsInitializing );
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
			tabViewChildrenDispId16GenListPane = javafxSchema.getId16GenFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenDispId16GenList(), false );
		}
		return( tabViewChildrenDispId16GenListPane );
	}

	protected class RefreshChildrenDispId32GenList
	implements ICFRefreshCallback
	{
		public RefreshChildrenDispId32GenList() {
		}

		public void refreshMe() {
			Collection<ICFBamId32GenObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenDispId32Gen( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenDispId32GenListPane();
			ICFBamJavaFXId32GenPaneList jpList = (ICFBamJavaFXId32GenPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenDispId32GenListPane() {
		if( tabViewChildrenDispId32GenListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamId32GenObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenDispId32Gen( javafxIsInitializing );
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
			tabViewChildrenDispId32GenListPane = javafxSchema.getId32GenFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenDispId32GenList(), false );
		}
		return( tabViewChildrenDispId32GenListPane );
	}

	protected class RefreshChildrenDispId64GenList
	implements ICFRefreshCallback
	{
		public RefreshChildrenDispId64GenList() {
		}

		public void refreshMe() {
			Collection<ICFBamId64GenObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenDispId64Gen( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewChildrenDispId64GenListPane();
			ICFBamJavaFXId64GenPaneList jpList = (ICFBamJavaFXId64GenPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewChildrenDispId64GenListPane() {
		if( tabViewChildrenDispId64GenListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamId64GenObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalChildrenDispId64Gen( javafxIsInitializing );
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
			tabViewChildrenDispId64GenListPane = javafxSchema.getId64GenFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshChildrenDispId64GenList(), false );
		}
		return( tabViewChildrenDispId64GenListPane );
	}

	protected class RefreshComponentsServerMethodsList
	implements ICFRefreshCallback
	{
		public RefreshComponentsServerMethodsList() {
		}

		public void refreshMe() {
			Collection<ICFBamServerMethodObj> dataCollection;
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsServerMethods( javafxIsInitializing );
			}
			else {
				dataCollection = null;
			}
			CFBorderPane pane = getTabViewComponentsServerMethodsListPane();
			ICFBamJavaFXServerMethodPaneList jpList = (ICFBamJavaFXServerMethodPaneList)pane;
			jpList.setJavaFXDataCollection( dataCollection );
		}
	}

	public CFBorderPane getTabViewComponentsServerMethodsListPane() {
		if( tabViewComponentsServerMethodsListPane == null ) {
			ICFBamTableObj focus = (ICFBamTableObj)getJavaFXFocusAsTable();
			Collection<ICFBamServerMethodObj> dataCollection;
			if( focus != null ) {
				dataCollection = focus.getOptionalComponentsServerMethods( javafxIsInitializing );
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
			tabViewComponentsServerMethodsListPane = javafxSchema.getServerMethodFactory().newListPane( cfFormManager, javafxContainer, null, dataCollection, new RefreshComponentsServerMethodsList(), false );
		}
		return( tabViewComponentsServerMethodsListPane );
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		CFPane.PaneMode oldMode = getPaneMode();
		super.setPaneMode( value );
		if( tabViewComponentsRelationListPane != null ) {
			((ICFBamJavaFXRelationPaneCommon)tabViewComponentsRelationListPane).setPaneMode( value );
		}
		if( tabViewComponentsIndexListPane != null ) {
			((ICFBamJavaFXIndexPaneCommon)tabViewComponentsIndexListPane).setPaneMode( value );
		}
		if( tabViewComponentsColumnsListPane != null ) {
			((ICFBamJavaFXValuePaneCommon)tabViewComponentsColumnsListPane).setPaneMode( value );
		}
		if( tabViewChildrenReverseRelationsListPane != null ) {
			((ICFBamJavaFXRelationPaneCommon)tabViewChildrenReverseRelationsListPane).setPaneMode( value );
		}
		if( tabViewComponentsChainsListPane != null ) {
			((ICFBamJavaFXChainPaneCommon)tabViewComponentsChainsListPane).setPaneMode( value );
		}
		if( tabViewComponentsDelDepListPane != null ) {
			((ICFBamJavaFXDelTopDepPaneCommon)tabViewComponentsDelDepListPane).setPaneMode( value );
		}
		if( tabViewComponentsClearDepListPane != null ) {
			((ICFBamJavaFXClearTopDepPaneCommon)tabViewComponentsClearDepListPane).setPaneMode( value );
		}
		if( tabViewChildrenDispId16GenListPane != null ) {
			((ICFBamJavaFXId16GenPaneCommon)tabViewChildrenDispId16GenListPane).setPaneMode( value );
		}
		if( tabViewChildrenDispId32GenListPane != null ) {
			((ICFBamJavaFXId32GenPaneCommon)tabViewChildrenDispId32GenListPane).setPaneMode( value );
		}
		if( tabViewChildrenDispId64GenListPane != null ) {
			((ICFBamJavaFXId64GenPaneCommon)tabViewChildrenDispId64GenListPane).setPaneMode( value );
		}
		if( tabViewComponentsServerMethodsListPane != null ) {
			((ICFBamJavaFXServerMethodPaneCommon)tabViewComponentsServerMethodsListPane).setPaneMode( value );
		}
	}
}
