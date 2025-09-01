// Description: Java 11 JavaFX List of Obj Pane implementation for BoolDef.

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
import java.util.*;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;
import server.markhome.msscf.cfsec.CFSecJavaFX.*;
import server.markhome.msscf.cfint.CFIntJavaFX.*;

/**
 *	CFBamJavaFXBoolDefListPane JavaFX List of Obj Pane implementation
 *	for BoolDef.
 */
public class CFBamJavaFXBoolDefListPane
extends CFBorderPane
implements ICFBamJavaFXBoolDefPaneList
{
	public static String S_FormName = "List BoolDef";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamBoolDefObj> javafxDataCollection = null;
	protected ObservableList<ICFBamBoolDefObj> observableListOfBoolDef = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddBoolType = null;
	protected CFButton buttonAddBoolCol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamBoolDefObj> dataTable = null;
	protected TableColumn<ICFBamBoolDefObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamBoolDefObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnName = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamBoolDefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamBoolDefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamBoolDefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamBoolDefObj, Boolean> tableColumnInitValue = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnFalseString = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnTrueString = null;
	protected TableColumn<ICFBamBoolDefObj, String> tableColumnNullString = null;
	protected TableColumn<ICFBamBoolDefObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected ICFBamScopeObj javafxContainer = null;
	protected ICFRefreshCallback javafxRefreshCallback = null;
	class ViewEditClosedCallback implements ICFFormClosedCallback {
		public ViewEditClosedCallback() {
		}

		@Override
		public void formClosed( ICFLibAnyObj affectedObject ) {
			if( affectedObject != null ) {
				refreshMe();
			}
		}
	}

	protected ViewEditClosedCallback viewEditClosedCallback = null;

	public ICFFormClosedCallback getViewEditClosedCallback() {
		if( viewEditClosedCallback == null ) {
			viewEditClosedCallback = new ViewEditClosedCallback();
		}
		return( viewEditClosedCallback );
	}

	class DeleteCallback implements ICFDeleteCallback {
		public DeleteCallback() {
		}
		@Override
		public void deleted( ICFLibAnyObj deletedObject ) {
			if( deletedObject != null ) {
				refreshMe();
			}
		}

		@Override
		public void formClosed( ICFLibAnyObj affectedObject ) {
			if( affectedObject != null ) {
				refreshMe();
			}
		}
	}

	protected DeleteCallback deleteCallback = null;

	public ICFDeleteCallback getDeleteCallback() {
		if( deleteCallback == null ) {
			deleteCallback = new DeleteCallback();
		}
		return( deleteCallback );
	}


	public CFBamJavaFXBoolDefListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamScopeObj argContainer,
		ICFBamBoolDefObj argFocus,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
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
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		javafxContainer = argContainer;
		javafxRefreshCallback = refreshCallback;
		javafxSortByChain = sortByChain;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<ICFBamBoolDefObj>();
		tableColumnObjKind = new TableColumn<ICFBamBoolDefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamBoolDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String classCode = obj.getClassCode();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( classCode );
					return( observable );
				}
			}
		});
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamBoolDefObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamBoolDefObj, Long> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					long value = obj.getRequiredId();
					Long wrapped = Long.valueOf( value );
					ReadOnlyObjectWrapper<Long> observable = new ReadOnlyObjectWrapper<Long>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,Long>,TableCell<ICFBamBoolDefObj,Long>>() {
			@Override public TableCell<ICFBamBoolDefObj,Long> call(
				TableColumn<ICFBamBoolDefObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamBoolDefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamBoolDefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalShortName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamBoolDefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalLabel();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamBoolDefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalShortDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamBoolDefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDescription();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamBoolDefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDefaultXmlValue();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamBoolDefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBoolDefObj, Boolean> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsNullable();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,Boolean>,TableCell<ICFBamBoolDefObj,Boolean>>() {
			@Override public TableCell<ICFBamBoolDefObj,Boolean> call(
				TableColumn<ICFBamBoolDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamBoolDefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBoolDefObj, Boolean> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Boolean value = obj.getOptionalGenerateId();
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,Boolean>,TableCell<ICFBamBoolDefObj,Boolean>>() {
			@Override public TableCell<ICFBamBoolDefObj,Boolean> call(
				TableColumn<ICFBamBoolDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamBoolDefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBoolDefObj, Boolean> p ) {
				ICFBamValueObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredImplementsPolymorph();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,Boolean>,TableCell<ICFBamBoolDefObj,Boolean>>() {
			@Override public TableCell<ICFBamBoolDefObj,Boolean> call(
				TableColumn<ICFBamBoolDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamBoolDefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamAtomObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDbName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamBoolDefObj,Boolean>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBoolDefObj, Boolean> p ) {
				ICFBamBoolDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Boolean value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,Boolean>,TableCell<ICFBamBoolDefObj,Boolean>>() {
			@Override public TableCell<ICFBamBoolDefObj,Boolean> call(
				TableColumn<ICFBamBoolDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnFalseString = new TableColumn<ICFBamBoolDefObj,String>( "FalseString" );
		tableColumnFalseString.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamBoolDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalFalseString();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnFalseString.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnFalseString );
		tableColumnTrueString = new TableColumn<ICFBamBoolDefObj,String>( "TrueString" );
		tableColumnTrueString.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamBoolDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalTrueString();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnTrueString.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnTrueString );
		tableColumnNullString = new TableColumn<ICFBamBoolDefObj,String>( "NullString" );
		tableColumnNullString.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBoolDefObj, String> p ) {
				ICFBamBoolDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalNullString();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnNullString.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,String>,TableCell<ICFBamBoolDefObj,String>>() {
			@Override public TableCell<ICFBamBoolDefObj,String> call(
				TableColumn<ICFBamBoolDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBoolDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnNullString );
		tableColumnLookupDefSchema = new TableColumn<ICFBamBoolDefObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBoolDefObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamBoolDefObj, ICFBamSchemaDefObj> p ) {
				ICFBamBoolDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamSchemaDefObj ref = obj.getOptionalLookupDefSchema();
					ReadOnlyObjectWrapper<ICFBamSchemaDefObj> observable = new ReadOnlyObjectWrapper<ICFBamSchemaDefObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamBoolDefObj,ICFBamSchemaDefObj>,TableCell<ICFBamBoolDefObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamBoolDefObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamBoolDefObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamBoolDefObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamBoolDefObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamBoolDefObj> observable,
					ICFBamBoolDefObj oldValue,
					ICFBamBoolDefObj newValue )
				{
					setJavaFXFocus( newValue );
				}
			});

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( getPanelHBoxMenu() );

		setTop( scrollMenu );
		setCenter( dataTable );
		javafxIsInitializing = false;
		if( observableListOfBoolDef != null ) {
			dataTable.setItems( observableListOfBoolDef );
		}
		adjustListButtons();
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

	public void setPaneMode( CFPane.PaneMode value ) {
		super.setPaneMode( value );
		adjustListButtons();
	}

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamBoolDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamBoolDefObj" );
		}
		adjustListButtons();
	}

	public ICFBamBoolDefObj getJavaFXFocusAsBoolDef() {
		return( (ICFBamBoolDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsBoolDef( ICFBamBoolDefObj value ) {
		setJavaFXFocus( value );
	}

	public class BoolDefByQualNameComparator
	implements Comparator<ICFBamBoolDefObj>
	{
		public BoolDefByQualNameComparator() {
		}

		public int compare( ICFBamBoolDefObj lhs, ICFBamBoolDefObj rhs ) {
			if( lhs == null ) {
				if( rhs == null ) {
					return( 0 );
				}
				else {
					return( -1 );
				}
			}
			else if( rhs == null ) {
				return( 1 );
			}
			else {
				String lhsValue = lhs.getObjQualifiedName();
				String rhsValue = rhs.getObjQualifiedName();
				if( lhsValue == null ) {
					if( rhsValue == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhsValue == null ) {
					return( 1 );
				}
				else {
					return( lhsValue.compareTo( rhsValue ) );
				}
			}
		}
	}

	protected BoolDefByQualNameComparator compareBoolDefByQualName = new BoolDefByQualNameComparator();

	public Collection<ICFBamBoolDefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamBoolDefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfBoolDef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamBoolDefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfBoolDef.add( iter.next() );
				}
				observableListOfBoolDef.sort( compareBoolDefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfBoolDef );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	protected class CompareCFButtonByText
	implements Comparator<CFButton>
	{
		public CompareCFButtonByText() {
		}

		@Override public int compare( CFButton lhs, CFButton rhs ) {
			if( lhs == null ) {
				if( rhs == null ) {
					return( 0 );
				}
				else {
					return( -1 );
				}
			}
			else if( rhs == null ) {
				return( 1 );
			}
			else {
				int retval = lhs.getText().compareTo( rhs.getText() );
				return( retval );
			}
		}
	}

	public CFHBox getPanelHBoxMenu() {
		if( hboxMenu == null ) {
			hboxMenu = new CFHBox( 10 );
				LinkedList<CFButton> list = new LinkedList<CFButton>();

				vboxMenuAdd = new CFVBox( 10 );
					buttonAddBoolType = new CFButton();
					buttonAddBoolType.setMinWidth( 200 );
					buttonAddBoolType.setText( "Add BoolType" );
					buttonAddBoolType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamBoolTypeObj obj = (ICFBamBoolTypeObj)schemaObj.getBoolTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamBoolTypeEditObj edit = (ICFBamBoolTypeEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamSchemaDefObj container = (ICFBamSchemaDefObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerSchemaDef( container );
								ICFBamJavaFXBoolTypePaneCommon jpanelCommon = (ICFBamJavaFXBoolTypePaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamSchemaDefObj ) {
						list.add( buttonAddBoolType );
					}
					buttonAddBoolCol = new CFButton();
					buttonAddBoolCol.setMinWidth( 200 );
					buttonAddBoolCol.setText( "Add BoolCol" );
					buttonAddBoolCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamBoolColObj obj = (ICFBamBoolColObj)schemaObj.getBoolColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getBoolColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamBoolColEditObj edit = (ICFBamBoolColEditObj)( obj.beginEdit() );
								if( edit == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"edit" );
								}
								ICFSecTenantObj secTenant = schemaObj.getSecTenant();
								edit.setRequiredOwnerTenant( secTenant );
								ICFBamTableObj container = (ICFBamTableObj)( getJavaFXContainer() );
								if( container == null ) {
									throw new CFLibNullArgumentException( getClass(),
										S_ProcName,
										0,
										"JavaFXContainer" );
								}
								edit.setRequiredContainerTable( container );
								ICFBamJavaFXBoolColPaneCommon jpanelCommon = (ICFBamJavaFXBoolColPaneCommon)frame;
								jpanelCommon.setJavaFXFocus( obj );
								jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
								cfFormManager.pushForm( frame );
								setLeft( null );
								adjustListButtons();
							}
							catch( Throwable t ) {
								CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
							}
						}
					});
					if( javafxContainer instanceof ICFBamTableObj ) {
						list.add( buttonAddBoolCol );
					}

				int len = list.size();
				CFButton arr[] = new CFButton[len];
				Iterator<CFButton> iter = list.iterator();
				int idx = 0;
				while( iter.hasNext() ) {
					arr[idx++] = iter.next();
				}
				Arrays.sort( arr, new CompareCFButtonByText() );
				for( idx = 0; idx < len; idx ++ ) {
					vboxMenuAdd.getChildren().add( arr[idx] );
				}

				buttonCancelAdd = new CFButton();
				buttonCancelAdd.setMinWidth( 200 );
				buttonCancelAdd.setText( "Cancel Add..." );
				buttonCancelAdd.setOnAction( new EventHandler<ActionEvent>() {
					@Override public void handle( ActionEvent e ) {
						final String S_ProcName = "handle";
						try {
							setLeft( null );
							adjustListButtons();
						}
						catch( Throwable t ) {
							CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
						}
					}
				});
				vboxMenuAdd.getChildren().add( buttonCancelAdd );

				scrollMenuAdd = new ScrollPane();
				scrollMenuAdd.setMinWidth( 240 );
				scrollMenuAdd.setMaxWidth( 240 );
				scrollMenuAdd.setFitToWidth( true );
				scrollMenuAdd.setHbarPolicy( ScrollBarPolicy.NEVER );
				scrollMenuAdd.setVbarPolicy( ScrollBarPolicy.AS_NEEDED );
				scrollMenuAdd.setContent( vboxMenuAdd );

			buttonAdd = new CFButton();
			buttonAdd.setMinWidth( 200 );
			buttonAdd.setText( "Add..." );
			buttonAdd.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						setLeft( scrollMenuAdd );
						adjustListButtons();
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAdd );

			buttonViewSelected = new CFButton();
			buttonViewSelected.setMinWidth( 200 );
			buttonViewSelected.setText( "View Selected" );
			buttonViewSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ICFBamBoolDefObj selectedInstance = getJavaFXFocusAsBoolDef();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a80d".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getBoolDefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBoolDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a80e".equals( classCode ) ) {
								ICFBamBoolTypeObj obj = (ICFBamBoolTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBoolTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a853".equals( classCode ) ) {
								ICFBamBoolColObj obj = (ICFBamBoolColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBoolColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamBoolDefObj, ICFBamBoolTypeObj, ICFBamBoolColObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonViewSelected );

			buttonEditSelected = new CFButton();
			buttonEditSelected.setMinWidth( 200 );
			buttonEditSelected.setText( "Edit Selected" );
			buttonEditSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ICFBamBoolDefObj selectedInstance = getJavaFXFocusAsBoolDef();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a80d".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getBoolDefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBoolDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a80e".equals( classCode ) ) {
								ICFBamBoolTypeObj obj = (ICFBamBoolTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBoolTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a853".equals( classCode ) ) {
								ICFBamBoolColObj obj = (ICFBamBoolColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBoolColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamBoolDefObj, ICFBamBoolTypeObj, ICFBamBoolColObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonEditSelected );

			buttonDeleteSelected = new CFButton();
			buttonDeleteSelected.setMinWidth( 200 );
			buttonDeleteSelected.setText( "Delete Selected" );
			buttonDeleteSelected.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						if( schemaObj == null ) {
							throw new CFLibNullArgumentException( getClass(),
								S_ProcName,
								0,
								"schemaObj" );
						}
						ICFBamBoolDefObj selectedInstance = getJavaFXFocusAsBoolDef();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a80d".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getBoolDefFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXBoolDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a80e".equals( classCode ) ) {
								ICFBamBoolTypeObj obj = (ICFBamBoolTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXBoolTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a853".equals( classCode ) ) {
								ICFBamBoolColObj obj = (ICFBamBoolColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getBoolColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXBoolColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamBoolDefObj, ICFBamBoolTypeObj, ICFBamBoolColObj" );
							}
						}
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonDeleteSelected );

		}
		return( hboxMenu );
	}

	public ICFBamScopeObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamScopeObj value ) {
		javafxContainer = value;
	}

	public void refreshMe() {
		if( javafxRefreshCallback != null ) {
			javafxRefreshCallback.refreshMe();
		}
	}

	public void adjustListButtons() {
		boolean enableState;
		boolean inEditState;
		boolean allowAdds;
		boolean inAddMode = false;
		ICFBamBoolDefObj selectedObj = getJavaFXFocusAsBoolDef();
		CFPane.PaneMode mode = getPaneMode();
		if( mode == CFPane.PaneMode.Edit ) {
			inEditState = true;
			allowAdds = false;
		}
		else {
			inEditState = false;
			if( getJavaFXContainer() != null ) {
				if( getLeft() != null ) {
					allowAdds = false;
					inAddMode = true;
				}
				else {
					allowAdds = true;
				}
			}
			else {
				allowAdds = false;
			}
		}
		if( selectedObj == null ) {
			enableState = false;
		}
		else {
			if( ( ! inAddMode ) && ( ! inEditState ) ) {
				enableState = true;
			}
			else {
				enableState = false;
			}
		}

		if( buttonViewSelected != null ) {
			buttonViewSelected.setDisable( ! enableState );
		}
		if( buttonEditSelected != null ) {
			if( inEditState ) {
				buttonEditSelected.setDisable( true );
			}
			else {
				buttonEditSelected.setDisable( ! enableState );
			}
		}
		if( buttonDeleteSelected != null ) {
			buttonDeleteSelected.setDisable( ! enableState );
		}

		if( buttonAdd != null ) {
			buttonAdd.setDisable( ! allowAdds );
		}
	}
}
