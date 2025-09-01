// Description: Java 11 JavaFX Picker of Obj Pane implementation for Id64Gen.

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
 *	CFBamJavaFXId64GenPickerPane JavaFX Pick Obj Pane implementation
 *	for Id64Gen.
 */
public class CFBamJavaFXId64GenPickerPane
extends CFBorderPane
implements ICFBamJavaFXId64GenPaneList
{
	public static String S_FormName = "Choose Id64Gen";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamId64GenObj> javafxDataCollection = null;
	protected ObservableList<ICFBamId64GenObj> observableListOfId64Gen = null;
	protected TableColumn<ICFBamId64GenObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnName = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamId64GenObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamId64GenObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamId64GenObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamId64GenObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamId64GenObj, Long> tableColumnInitValue = null;
	protected TableColumn<ICFBamId64GenObj, Long> tableColumnMinValue = null;
	protected TableColumn<ICFBamId64GenObj, Long> tableColumnMaxValue = null;
	protected TableColumn<ICFBamId64GenObj, Short> tableColumnSlice = null;
	protected TableColumn<ICFBamId64GenObj, Long> tableColumnBlockSize = null;
	protected TableColumn<ICFBamId64GenObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<ICFBamId64GenObj, ICFBamTableObj> tableColumnLookupDispenser = null;
	protected TableView<ICFBamId64GenObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXId64GenChosen invokeWhenChosen = null;
	protected ICFBamSchemaDefObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXId64GenPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamId64GenObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamId64GenObj> argDataCollection,
		ICFBamJavaFXId64GenChosen whenChosen )
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
		dataTable = new TableView<ICFBamId64GenObj>();
		tableColumnId = new TableColumn<ICFBamId64GenObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamId64GenObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Long>,TableCell<ICFBamId64GenObj,Long>>() {
			@Override public TableCell<ICFBamId64GenObj,Long> call(
				TableColumn<ICFBamId64GenObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamId64GenObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamId64GenObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamId64GenObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamId64GenObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamId64GenObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamId64GenObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamId64GenObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamId64GenObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Boolean>,TableCell<ICFBamId64GenObj,Boolean>>() {
			@Override public TableCell<ICFBamId64GenObj,Boolean> call(
				TableColumn<ICFBamId64GenObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamId64GenObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamId64GenObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Boolean>,TableCell<ICFBamId64GenObj,Boolean>>() {
			@Override public TableCell<ICFBamId64GenObj,Boolean> call(
				TableColumn<ICFBamId64GenObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamId64GenObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamId64GenObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Boolean>,TableCell<ICFBamId64GenObj,Boolean>>() {
			@Override public TableCell<ICFBamId64GenObj,Boolean> call(
				TableColumn<ICFBamId64GenObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamId64GenObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId64GenObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,String>,TableCell<ICFBamId64GenObj,String>>() {
			@Override public TableCell<ICFBamId64GenObj,String> call(
				TableColumn<ICFBamId64GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamId64GenObj,Long>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamId64GenObj, Long> p ) {
				ICFBamInt64DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Long value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Long> observable = new ReadOnlyObjectWrapper<Long>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Long>,TableCell<ICFBamId64GenObj,Long>>() {
			@Override public TableCell<ICFBamId64GenObj,Long> call(
				TableColumn<ICFBamId64GenObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamId64GenObj,Long>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamId64GenObj, Long> p ) {
				ICFBamInt64DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Long value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Long> observable = new ReadOnlyObjectWrapper<Long>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Long>,TableCell<ICFBamId64GenObj,Long>>() {
			@Override public TableCell<ICFBamId64GenObj,Long> call(
				TableColumn<ICFBamId64GenObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamId64GenObj,Long>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamId64GenObj, Long> p ) {
				ICFBamInt64DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Long value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Long> observable = new ReadOnlyObjectWrapper<Long>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Long>,TableCell<ICFBamId64GenObj,Long>>() {
			@Override public TableCell<ICFBamId64GenObj,Long> call(
				TableColumn<ICFBamId64GenObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnSlice = new TableColumn<ICFBamId64GenObj,Short>( "Slice" );
		tableColumnSlice.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamId64GenObj, Short> p ) {
				ICFBamId64GenObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					short value = obj.getRequiredSlice();
					Short wrapped = Short.valueOf( value );
					ReadOnlyObjectWrapper<Short> observable = new ReadOnlyObjectWrapper<Short>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnSlice.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Short>,TableCell<ICFBamId64GenObj,Short>>() {
			@Override public TableCell<ICFBamId64GenObj,Short> call(
				TableColumn<ICFBamId64GenObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSlice );
		tableColumnBlockSize = new TableColumn<ICFBamId64GenObj,Long>( "BlockSize" );
		tableColumnBlockSize.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamId64GenObj, Long> p ) {
				ICFBamId64GenObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					long value = obj.getRequiredBlockSize();
					Long wrapped = Long.valueOf( value );
					ReadOnlyObjectWrapper<Long> observable = new ReadOnlyObjectWrapper<Long>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnBlockSize.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,Long>,TableCell<ICFBamId64GenObj,Long>>() {
			@Override public TableCell<ICFBamId64GenObj,Long> call(
				TableColumn<ICFBamId64GenObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamId64GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnBlockSize );
		tableColumnLookupDefSchema = new TableColumn<ICFBamId64GenObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamId64GenObj, ICFBamSchemaDefObj> p ) {
				ICFBamId64GenObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,ICFBamSchemaDefObj>,TableCell<ICFBamId64GenObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamId64GenObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamId64GenObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamId64GenObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupDispenser = new TableColumn<ICFBamId64GenObj, ICFBamTableObj>( "Dispensing Table" );
		tableColumnLookupDispenser.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId64GenObj,ICFBamTableObj>,ObservableValue<ICFBamTableObj> >() {
			public ObservableValue<ICFBamTableObj> call( CellDataFeatures<ICFBamId64GenObj, ICFBamTableObj> p ) {
				ICFBamId64GenObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamTableObj ref = obj.getOptionalLookupDispenser();
					ReadOnlyObjectWrapper<ICFBamTableObj> observable = new ReadOnlyObjectWrapper<ICFBamTableObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupDispenser.setCellFactory( new Callback<TableColumn<ICFBamId64GenObj,ICFBamTableObj>,TableCell<ICFBamId64GenObj,ICFBamTableObj>>() {
			@Override public TableCell<ICFBamId64GenObj,ICFBamTableObj> call(
				TableColumn<ICFBamId64GenObj,ICFBamTableObj> arg)
			{
				return new CFReferenceTableCell<ICFBamId64GenObj,ICFBamTableObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDispenser );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamId64GenObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamId64GenObj> observable,
					ICFBamId64GenObj oldValue,
					ICFBamId64GenObj newValue )
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
					invokeWhenChosen.choseId64Gen( null );
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
					ICFBamId64GenObj selectedInstance = getJavaFXFocusAsId64Gen();
					invokeWhenChosen.choseId64Gen( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamId64GenObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamId64GenObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamId64GenObj getJavaFXFocusAsId64Gen() {
		return( (ICFBamId64GenObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsId64Gen( ICFBamId64GenObj value ) {
		setJavaFXFocus( value );
	}

	public class Id64GenByQualNameComparator
	implements Comparator<ICFBamId64GenObj>
	{
		public Id64GenByQualNameComparator() {
		}

		public int compare( ICFBamId64GenObj lhs, ICFBamId64GenObj rhs ) {
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

	protected Id64GenByQualNameComparator compareId64GenByQualName = new Id64GenByQualNameComparator();

	public Collection<ICFBamId64GenObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamId64GenObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfId64Gen = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamId64GenObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfId64Gen.add( iter.next() );
				}
				observableListOfId64Gen.sort( compareId64GenByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfId64Gen );
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
		ICFBamId64GenObj selectedObj = getJavaFXFocusAsId64Gen();
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

