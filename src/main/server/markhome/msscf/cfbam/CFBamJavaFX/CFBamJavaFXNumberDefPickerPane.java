// Description: Java 11 JavaFX Picker of Obj Pane implementation for NumberDef.

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
 *	CFBamJavaFXNumberDefPickerPane JavaFX Pick Obj Pane implementation
 *	for NumberDef.
 */
public class CFBamJavaFXNumberDefPickerPane
extends CFBorderPane
implements ICFBamJavaFXNumberDefPaneList
{
	public static String S_FormName = "Choose NumberDef";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamNumberDefObj> javafxDataCollection = null;
	protected ObservableList<ICFBamNumberDefObj> observableListOfNumberDef = null;
	protected TableColumn<ICFBamNumberDefObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamNumberDefObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnName = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamNumberDefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamNumberDefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamNumberDefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamNumberDefObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamNumberDefObj, Short> tableColumnDigits = null;
	protected TableColumn<ICFBamNumberDefObj, Short> tableColumnPrecis = null;
	protected TableColumn<ICFBamNumberDefObj, BigDecimal> tableColumnInitValue = null;
	protected TableColumn<ICFBamNumberDefObj, BigDecimal> tableColumnMinValue = null;
	protected TableColumn<ICFBamNumberDefObj, BigDecimal> tableColumnMaxValue = null;
	protected TableColumn<ICFBamNumberDefObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<ICFBamNumberDefObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXNumberDefChosen invokeWhenChosen = null;
	protected ICFBamScopeObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXNumberDefPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamNumberDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamNumberDefObj> argDataCollection,
		ICFBamJavaFXNumberDefChosen whenChosen )
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
		dataTable = new TableView<ICFBamNumberDefObj>();
		tableColumnObjKind = new TableColumn<ICFBamNumberDefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
				ICFBamNumberDefObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamNumberDefObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamNumberDefObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,Long>,TableCell<ICFBamNumberDefObj,Long>>() {
			@Override public TableCell<ICFBamNumberDefObj,Long> call(
				TableColumn<ICFBamNumberDefObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamNumberDefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamNumberDefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamNumberDefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamNumberDefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamNumberDefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamNumberDefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamNumberDefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamNumberDefObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,Boolean>,TableCell<ICFBamNumberDefObj,Boolean>>() {
			@Override public TableCell<ICFBamNumberDefObj,Boolean> call(
				TableColumn<ICFBamNumberDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamNumberDefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamNumberDefObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,Boolean>,TableCell<ICFBamNumberDefObj,Boolean>>() {
			@Override public TableCell<ICFBamNumberDefObj,Boolean> call(
				TableColumn<ICFBamNumberDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamNumberDefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamNumberDefObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,Boolean>,TableCell<ICFBamNumberDefObj,Boolean>>() {
			@Override public TableCell<ICFBamNumberDefObj,Boolean> call(
				TableColumn<ICFBamNumberDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamNumberDefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamNumberDefObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,String>,TableCell<ICFBamNumberDefObj,String>>() {
			@Override public TableCell<ICFBamNumberDefObj,String> call(
				TableColumn<ICFBamNumberDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnDigits = new TableColumn<ICFBamNumberDefObj,Short>( "Digits" );
		tableColumnDigits.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamNumberDefObj, Short> p ) {
				ICFBamNumberDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					short value = obj.getRequiredDigits();
					Short wrapped = Short.valueOf( value );
					ReadOnlyObjectWrapper<Short> observable = new ReadOnlyObjectWrapper<Short>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnDigits.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,Short>,TableCell<ICFBamNumberDefObj,Short>>() {
			@Override public TableCell<ICFBamNumberDefObj,Short> call(
				TableColumn<ICFBamNumberDefObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDigits );
		tableColumnPrecis = new TableColumn<ICFBamNumberDefObj,Short>( "Precision" );
		tableColumnPrecis.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamNumberDefObj, Short> p ) {
				ICFBamNumberDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					short value = obj.getRequiredPrecis();
					Short wrapped = Short.valueOf( value );
					ReadOnlyObjectWrapper<Short> observable = new ReadOnlyObjectWrapper<Short>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnPrecis.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,Short>,TableCell<ICFBamNumberDefObj,Short>>() {
			@Override public TableCell<ICFBamNumberDefObj,Short> call(
				TableColumn<ICFBamNumberDefObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamNumberDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnPrecis );
		tableColumnInitValue = new TableColumn<ICFBamNumberDefObj,BigDecimal>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,BigDecimal>,ObservableValue<BigDecimal> >() {
			public ObservableValue<BigDecimal> call( CellDataFeatures<ICFBamNumberDefObj, BigDecimal> p ) {
				ICFBamNumberDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					BigDecimal value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<BigDecimal> observable = new ReadOnlyObjectWrapper<BigDecimal>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,BigDecimal>,TableCell<ICFBamNumberDefObj,BigDecimal>>() {
			@Override public TableCell<ICFBamNumberDefObj,BigDecimal> call(
				TableColumn<ICFBamNumberDefObj,BigDecimal> arg)
			{
				return new CFNumberTableCell<ICFBamNumberDefObj>( 31, 5 );
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamNumberDefObj,BigDecimal>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,BigDecimal>,ObservableValue<BigDecimal> >() {
			public ObservableValue<BigDecimal> call( CellDataFeatures<ICFBamNumberDefObj, BigDecimal> p ) {
				ICFBamNumberDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					BigDecimal value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<BigDecimal> observable = new ReadOnlyObjectWrapper<BigDecimal>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,BigDecimal>,TableCell<ICFBamNumberDefObj,BigDecimal>>() {
			@Override public TableCell<ICFBamNumberDefObj,BigDecimal> call(
				TableColumn<ICFBamNumberDefObj,BigDecimal> arg)
			{
				return new CFNumberTableCell<ICFBamNumberDefObj>( 31, 5 );
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamNumberDefObj,BigDecimal>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,BigDecimal>,ObservableValue<BigDecimal> >() {
			public ObservableValue<BigDecimal> call( CellDataFeatures<ICFBamNumberDefObj, BigDecimal> p ) {
				ICFBamNumberDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					BigDecimal value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<BigDecimal> observable = new ReadOnlyObjectWrapper<BigDecimal>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,BigDecimal>,TableCell<ICFBamNumberDefObj,BigDecimal>>() {
			@Override public TableCell<ICFBamNumberDefObj,BigDecimal> call(
				TableColumn<ICFBamNumberDefObj,BigDecimal> arg)
			{
				return new CFNumberTableCell<ICFBamNumberDefObj>( 31, 5 );
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamNumberDefObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamNumberDefObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamNumberDefObj, ICFBamSchemaDefObj> p ) {
				ICFBamNumberDefObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamNumberDefObj,ICFBamSchemaDefObj>,TableCell<ICFBamNumberDefObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamNumberDefObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamNumberDefObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamNumberDefObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamNumberDefObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamNumberDefObj> observable,
					ICFBamNumberDefObj oldValue,
					ICFBamNumberDefObj newValue )
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
					invokeWhenChosen.choseNumberDef( null );
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
					ICFBamNumberDefObj selectedInstance = getJavaFXFocusAsNumberDef();
					invokeWhenChosen.choseNumberDef( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamNumberDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamNumberDefObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamNumberDefObj getJavaFXFocusAsNumberDef() {
		return( (ICFBamNumberDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsNumberDef( ICFBamNumberDefObj value ) {
		setJavaFXFocus( value );
	}

	public class NumberDefByQualNameComparator
	implements Comparator<ICFBamNumberDefObj>
	{
		public NumberDefByQualNameComparator() {
		}

		public int compare( ICFBamNumberDefObj lhs, ICFBamNumberDefObj rhs ) {
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

	protected NumberDefByQualNameComparator compareNumberDefByQualName = new NumberDefByQualNameComparator();

	public Collection<ICFBamNumberDefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamNumberDefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfNumberDef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamNumberDefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfNumberDef.add( iter.next() );
				}
				observableListOfNumberDef.sort( compareNumberDefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfNumberDef );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamScopeObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamScopeObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamNumberDefObj selectedObj = getJavaFXFocusAsNumberDef();
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

