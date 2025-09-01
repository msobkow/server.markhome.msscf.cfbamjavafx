// Description: Java 11 JavaFX Picker of Obj Pane implementation for ServerListFunc.

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
 *	CFBamJavaFXServerListFuncPickerPane JavaFX Pick Obj Pane implementation
 *	for ServerListFunc.
 */
public class CFBamJavaFXServerListFuncPickerPane
extends CFBorderPane
implements ICFBamJavaFXServerListFuncPaneList
{
	public static String S_FormName = "Choose ServerListFunc";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamServerListFuncObj> javafxDataCollection = null;
	protected ObservableList<ICFBamServerListFuncObj> observableListOfServerListFunc = null;
	protected TableColumn<ICFBamServerListFuncObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnName = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnSuffix = null;
	protected TableColumn<ICFBamServerListFuncObj, Boolean> tableColumnIsInstanceMethod = null;
	protected TableColumn<ICFBamServerListFuncObj, Boolean> tableColumnIsServerOnly = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnJMethodBody = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnCppMethodBody = null;
	protected TableColumn<ICFBamServerListFuncObj, String> tableColumnCsMethodBody = null;
	protected TableColumn<ICFBamServerListFuncObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<ICFBamServerListFuncObj, ICFBamTableObj> tableColumnLookupRetTable = null;
	protected TableView<ICFBamServerListFuncObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXServerListFuncChosen invokeWhenChosen = null;
	protected ICFBamTableObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXServerListFuncPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamServerListFuncObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerListFuncObj> argDataCollection,
		ICFBamJavaFXServerListFuncChosen whenChosen )
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
		invokeWhenChosen = whenChosen;
		// argFocus is optional; focus may be set later during execution as
		// conditions of the runtime change.
		javafxSchema = argSchema;
		javaFXFocus = argFocus;
		javafxContainer = argContainer;
		setJavaFXDataCollection( argDataCollection );
		dataTable = new TableView<ICFBamServerListFuncObj>();
		tableColumnId = new TableColumn<ICFBamServerListFuncObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamServerListFuncObj, Long> p ) {
				ICFBamScopeObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,Long>,TableCell<ICFBamServerListFuncObj,Long>>() {
			@Override public TableCell<ICFBamServerListFuncObj,Long> call(
				TableColumn<ICFBamServerListFuncObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamServerListFuncObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamServerListFuncObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamServerListFuncObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamServerListFuncObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamServerListFuncObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnSuffix = new TableColumn<ICFBamServerListFuncObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalSuffix();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsInstanceMethod = new TableColumn<ICFBamServerListFuncObj,Boolean>( "Is Instance Method" );
		tableColumnIsInstanceMethod.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamServerListFuncObj, Boolean> p ) {
				ICFBamServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsInstanceMethod();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsInstanceMethod.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,Boolean>,TableCell<ICFBamServerListFuncObj,Boolean>>() {
			@Override public TableCell<ICFBamServerListFuncObj,Boolean> call(
				TableColumn<ICFBamServerListFuncObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsInstanceMethod );
		tableColumnIsServerOnly = new TableColumn<ICFBamServerListFuncObj,Boolean>( "Is Server Only" );
		tableColumnIsServerOnly.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamServerListFuncObj, Boolean> p ) {
				ICFBamServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsServerOnly();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsServerOnly.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,Boolean>,TableCell<ICFBamServerListFuncObj,Boolean>>() {
			@Override public TableCell<ICFBamServerListFuncObj,Boolean> call(
				TableColumn<ICFBamServerListFuncObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsServerOnly );
		tableColumnJMethodBody = new TableColumn<ICFBamServerListFuncObj,String>( "Java Method Body" );
		tableColumnJMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredJMethodBody();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnJMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnJMethodBody );
		tableColumnCppMethodBody = new TableColumn<ICFBamServerListFuncObj,String>( "C++ Method Body" );
		tableColumnCppMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredCppMethodBody();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCppMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCppMethodBody );
		tableColumnCsMethodBody = new TableColumn<ICFBamServerListFuncObj,String>( "C-Sharp Method Body" );
		tableColumnCsMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerListFuncObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredCsMethodBody();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnCsMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,String>,TableCell<ICFBamServerListFuncObj,String>>() {
			@Override public TableCell<ICFBamServerListFuncObj,String> call(
				TableColumn<ICFBamServerListFuncObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerListFuncObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCsMethodBody );
		tableColumnLookupDefSchema = new TableColumn<ICFBamServerListFuncObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamServerListFuncObj, ICFBamSchemaDefObj> p ) {
				ICFBamServerListFuncObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,ICFBamSchemaDefObj>,TableCell<ICFBamServerListFuncObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamServerListFuncObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamServerListFuncObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamServerListFuncObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupRetTable = new TableColumn<ICFBamServerListFuncObj, ICFBamTableObj>( "Ret Table" );
		tableColumnLookupRetTable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerListFuncObj,ICFBamTableObj>,ObservableValue<ICFBamTableObj> >() {
			public ObservableValue<ICFBamTableObj> call( CellDataFeatures<ICFBamServerListFuncObj, ICFBamTableObj> p ) {
				ICFBamServerListFuncObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamTableObj ref = obj.getOptionalLookupRetTable();
					ReadOnlyObjectWrapper<ICFBamTableObj> observable = new ReadOnlyObjectWrapper<ICFBamTableObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRetTable.setCellFactory( new Callback<TableColumn<ICFBamServerListFuncObj,ICFBamTableObj>,TableCell<ICFBamServerListFuncObj,ICFBamTableObj>>() {
			@Override public TableCell<ICFBamServerListFuncObj,ICFBamTableObj> call(
				TableColumn<ICFBamServerListFuncObj,ICFBamTableObj> arg)
			{
				return new CFReferenceTableCell<ICFBamServerListFuncObj,ICFBamTableObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRetTable );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamServerListFuncObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamServerListFuncObj> observable,
					ICFBamServerListFuncObj oldValue,
					ICFBamServerListFuncObj newValue )
				{
					setJavaFXFocus( newValue );
					if( buttonChooseSelected != null ) {
						if( newValue != null ) {
							buttonChooseSelected.setDisable( false );
						}
						else {
							buttonChooseSelected.setDisable( true );
						}
					}
				}
			});
		hboxMenu = new CFHBox( 10 );
		buttonCancel = new CFButton();
		buttonCancel.setMinWidth( 200 );
		buttonCancel.setText( "Cancel" );
		buttonCancel.setOnAction( new EventHandler<ActionEvent>() {
			@Override public void handle( ActionEvent e ) {
				final String S_ProcName = "handle";
				try {
					cfFormManager.closeCurrentForm();
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxMenu.getChildren().add( buttonCancel );
		buttonChooseNone = new CFButton();
		buttonChooseNone.setMinWidth( 200 );
		buttonChooseNone.setText( "ChooseNone" );
		buttonChooseNone.setOnAction( new EventHandler<ActionEvent>() {
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
					invokeWhenChosen.choseServerListFunc( null );
					cfFormManager.closeCurrentForm();
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxMenu.getChildren().add( buttonChooseNone );
		buttonChooseSelected = new CFButton();
		buttonChooseSelected.setMinWidth( 200 );
		buttonChooseSelected.setText( "ChooseSelected" );
		buttonChooseSelected.setOnAction( new EventHandler<ActionEvent>() {
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
					ICFBamServerListFuncObj selectedInstance = getJavaFXFocusAsServerListFunc();
					invokeWhenChosen.choseServerListFunc( selectedInstance );
					cfFormManager.closeCurrentForm();
				}
				catch( Throwable t ) {
					CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
				}
			}
		});
		hboxMenu.getChildren().add( buttonChooseSelected );
		if( argFocus != null ) {
			dataTable.getSelectionModel().select( argFocus );
		}

		scrollMenu = new ScrollPane();
		scrollMenu.setVbarPolicy( ScrollBarPolicy.NEVER );
		scrollMenu.setHbarPolicy( ScrollBarPolicy.AS_NEEDED );
		scrollMenu.setFitToHeight( true );
		scrollMenu.setContent( hboxMenu );

		setTop( scrollMenu );
		setCenter( dataTable );
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

	public void setJavaFXFocus( ICFLibAnyObj value ) {
		final String S_ProcName = "setJavaFXFocus";
		if( ( value == null ) || ( value instanceof ICFBamServerListFuncObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamServerListFuncObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamServerListFuncObj getJavaFXFocusAsServerListFunc() {
		return( (ICFBamServerListFuncObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsServerListFunc( ICFBamServerListFuncObj value ) {
		setJavaFXFocus( value );
	}

	public class ServerListFuncByQualNameComparator
	implements Comparator<ICFBamServerListFuncObj>
	{
		public ServerListFuncByQualNameComparator() {
		}

		public int compare( ICFBamServerListFuncObj lhs, ICFBamServerListFuncObj rhs ) {
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

	protected ServerListFuncByQualNameComparator compareServerListFuncByQualName = new ServerListFuncByQualNameComparator();

	public Collection<ICFBamServerListFuncObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamServerListFuncObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfServerListFunc = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamServerListFuncObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfServerListFunc.add( iter.next() );
				}
				observableListOfServerListFunc.sort( compareServerListFuncByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfServerListFunc );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamTableObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamTableObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamServerListFuncObj selectedObj = getJavaFXFocusAsServerListFunc();
		if( selectedObj == null ) {
			enableState = false;
		}
		else {
			enableState = true;
		}

		if( buttonChooseSelected != null ) {
			buttonChooseSelected.setDisable( ! enableState );
		}
		if( buttonChooseNone != null ) {
			buttonChooseNone.setDisable( false );
		}
		if( buttonCancel != null ) {
			buttonCancel.setDisable( false );
		}

	}
}

