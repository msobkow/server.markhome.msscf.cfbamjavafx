// Description: Java 11 JavaFX Picker of Obj Pane implementation for Int16Type.

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
 *	CFBamJavaFXInt16TypePickerPane JavaFX Pick Obj Pane implementation
 *	for Int16Type.
 */
public class CFBamJavaFXInt16TypePickerPane
extends CFBorderPane
implements ICFBamJavaFXInt16TypePaneList
{
	public static String S_FormName = "Choose Int16Type";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamInt16TypeObj> javafxDataCollection = null;
	protected ObservableList<ICFBamInt16TypeObj> observableListOfInt16Type = null;
	protected TableColumn<ICFBamInt16TypeObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamInt16TypeObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnName = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamInt16TypeObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamInt16TypeObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamInt16TypeObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamInt16TypeObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamInt16TypeObj, Short> tableColumnInitValue = null;
	protected TableColumn<ICFBamInt16TypeObj, Short> tableColumnMinValue = null;
	protected TableColumn<ICFBamInt16TypeObj, Short> tableColumnMaxValue = null;
	protected TableColumn<ICFBamInt16TypeObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<ICFBamInt16TypeObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXInt16TypeChosen invokeWhenChosen = null;
	protected ICFBamSchemaDefObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXInt16TypePickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamInt16TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamInt16TypeObj> argDataCollection,
		ICFBamJavaFXInt16TypeChosen whenChosen )
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
		dataTable = new TableView<ICFBamInt16TypeObj>();
		tableColumnObjKind = new TableColumn<ICFBamInt16TypeObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
				ICFBamInt16TypeObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamInt16TypeObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamInt16TypeObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Long>,TableCell<ICFBamInt16TypeObj,Long>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Long> call(
				TableColumn<ICFBamInt16TypeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamInt16TypeObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamInt16TypeObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamInt16TypeObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamInt16TypeObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamInt16TypeObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamInt16TypeObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamInt16TypeObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamInt16TypeObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Boolean>,TableCell<ICFBamInt16TypeObj,Boolean>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Boolean> call(
				TableColumn<ICFBamInt16TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamInt16TypeObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamInt16TypeObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Boolean>,TableCell<ICFBamInt16TypeObj,Boolean>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Boolean> call(
				TableColumn<ICFBamInt16TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamInt16TypeObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamInt16TypeObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Boolean>,TableCell<ICFBamInt16TypeObj,Boolean>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Boolean> call(
				TableColumn<ICFBamInt16TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamInt16TypeObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt16TypeObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,String>,TableCell<ICFBamInt16TypeObj,String>>() {
			@Override public TableCell<ICFBamInt16TypeObj,String> call(
				TableColumn<ICFBamInt16TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamInt16TypeObj,Short>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamInt16TypeObj, Short> p ) {
				ICFBamInt16DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Short value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Short> observable = new ReadOnlyObjectWrapper<Short>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Short>,TableCell<ICFBamInt16TypeObj,Short>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Short> call(
				TableColumn<ICFBamInt16TypeObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamInt16TypeObj,Short>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamInt16TypeObj, Short> p ) {
				ICFBamInt16DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Short value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Short> observable = new ReadOnlyObjectWrapper<Short>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Short>,TableCell<ICFBamInt16TypeObj,Short>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Short> call(
				TableColumn<ICFBamInt16TypeObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamInt16TypeObj,Short>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamInt16TypeObj, Short> p ) {
				ICFBamInt16DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Short value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Short> observable = new ReadOnlyObjectWrapper<Short>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,Short>,TableCell<ICFBamInt16TypeObj,Short>>() {
			@Override public TableCell<ICFBamInt16TypeObj,Short> call(
				TableColumn<ICFBamInt16TypeObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamInt16TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamInt16TypeObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt16TypeObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamInt16TypeObj, ICFBamSchemaDefObj> p ) {
				ICFBamInt16TypeObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamInt16TypeObj,ICFBamSchemaDefObj>,TableCell<ICFBamInt16TypeObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamInt16TypeObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamInt16TypeObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamInt16TypeObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamInt16TypeObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamInt16TypeObj> observable,
					ICFBamInt16TypeObj oldValue,
					ICFBamInt16TypeObj newValue )
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
					invokeWhenChosen.choseInt16Type( null );
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
					ICFBamInt16TypeObj selectedInstance = getJavaFXFocusAsInt16Type();
					invokeWhenChosen.choseInt16Type( selectedInstance );
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
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamInt16TypeObj getJavaFXFocusAsInt16Type() {
		return( (ICFBamInt16TypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsInt16Type( ICFBamInt16TypeObj value ) {
		setJavaFXFocus( value );
	}

	public class Int16TypeByQualNameComparator
	implements Comparator<ICFBamInt16TypeObj>
	{
		public Int16TypeByQualNameComparator() {
		}

		public int compare( ICFBamInt16TypeObj lhs, ICFBamInt16TypeObj rhs ) {
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

	protected Int16TypeByQualNameComparator compareInt16TypeByQualName = new Int16TypeByQualNameComparator();

	public Collection<ICFBamInt16TypeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamInt16TypeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfInt16Type = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamInt16TypeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfInt16Type.add( iter.next() );
				}
				observableListOfInt16Type.sort( compareInt16TypeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfInt16Type );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamSchemaDefObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamSchemaDefObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamInt16TypeObj selectedObj = getJavaFXFocusAsInt16Type();
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

