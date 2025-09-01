// Description: Java 11 JavaFX List of Obj Pane implementation for Id32Gen.

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
 *	CFBamJavaFXId32GenListPane JavaFX List of Obj Pane implementation
 *	for Id32Gen.
 */
public class CFBamJavaFXId32GenListPane
extends CFBorderPane
implements ICFBamJavaFXId32GenPaneList
{
	public static String S_FormName = "List Id32Gen";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamId32GenObj> javafxDataCollection = null;
	protected ObservableList<ICFBamId32GenObj> observableListOfId32Gen = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddId32Gen = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamId32GenObj> dataTable = null;
	protected TableColumn<ICFBamId32GenObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnName = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamId32GenObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamId32GenObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamId32GenObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamId32GenObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamId32GenObj, Integer> tableColumnInitValue = null;
	protected TableColumn<ICFBamId32GenObj, Integer> tableColumnMinValue = null;
	protected TableColumn<ICFBamId32GenObj, Integer> tableColumnMaxValue = null;
	protected TableColumn<ICFBamId32GenObj, Short> tableColumnSlice = null;
	protected TableColumn<ICFBamId32GenObj, Integer> tableColumnBlockSize = null;
	protected TableColumn<ICFBamId32GenObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<ICFBamId32GenObj, ICFBamTableObj> tableColumnLookupDispenser = null;

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected ICFBamSchemaDefObj javafxContainer = null;
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


	public CFBamJavaFXId32GenListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamSchemaDefObj argContainer,
		ICFBamId32GenObj argFocus,
		Collection<ICFBamId32GenObj> argDataCollection,
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
		dataTable = new TableView<ICFBamId32GenObj>();
		tableColumnId = new TableColumn<ICFBamId32GenObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamId32GenObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Long>,TableCell<ICFBamId32GenObj,Long>>() {
			@Override public TableCell<ICFBamId32GenObj,Long> call(
				TableColumn<ICFBamId32GenObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamId32GenObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamId32GenObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamId32GenObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamId32GenObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamId32GenObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamId32GenObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamId32GenObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamId32GenObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Boolean>,TableCell<ICFBamId32GenObj,Boolean>>() {
			@Override public TableCell<ICFBamId32GenObj,Boolean> call(
				TableColumn<ICFBamId32GenObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamId32GenObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamId32GenObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Boolean>,TableCell<ICFBamId32GenObj,Boolean>>() {
			@Override public TableCell<ICFBamId32GenObj,Boolean> call(
				TableColumn<ICFBamId32GenObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamId32GenObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamId32GenObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Boolean>,TableCell<ICFBamId32GenObj,Boolean>>() {
			@Override public TableCell<ICFBamId32GenObj,Boolean> call(
				TableColumn<ICFBamId32GenObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamId32GenObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamId32GenObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,String>,TableCell<ICFBamId32GenObj,String>>() {
			@Override public TableCell<ICFBamId32GenObj,String> call(
				TableColumn<ICFBamId32GenObj,String> arg)
			{
				return new CFStringTableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamId32GenObj,Integer>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<ICFBamId32GenObj, Integer> p ) {
				ICFBamInt32DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Integer value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Integer>,TableCell<ICFBamId32GenObj,Integer>>() {
			@Override public TableCell<ICFBamId32GenObj,Integer> call(
				TableColumn<ICFBamId32GenObj,Integer> arg)
			{
				return new CFInt32TableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamId32GenObj,Integer>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<ICFBamId32GenObj, Integer> p ) {
				ICFBamInt32DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Integer value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Integer>,TableCell<ICFBamId32GenObj,Integer>>() {
			@Override public TableCell<ICFBamId32GenObj,Integer> call(
				TableColumn<ICFBamId32GenObj,Integer> arg)
			{
				return new CFInt32TableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamId32GenObj,Integer>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<ICFBamId32GenObj, Integer> p ) {
				ICFBamInt32DefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Integer value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Integer>,TableCell<ICFBamId32GenObj,Integer>>() {
			@Override public TableCell<ICFBamId32GenObj,Integer> call(
				TableColumn<ICFBamId32GenObj,Integer> arg)
			{
				return new CFInt32TableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnSlice = new TableColumn<ICFBamId32GenObj,Short>( "Slice" );
		tableColumnSlice.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Short>,ObservableValue<Short> >() {
			public ObservableValue<Short> call( CellDataFeatures<ICFBamId32GenObj, Short> p ) {
				ICFBamId32GenObj obj = p.getValue();
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
		tableColumnSlice.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Short>,TableCell<ICFBamId32GenObj,Short>>() {
			@Override public TableCell<ICFBamId32GenObj,Short> call(
				TableColumn<ICFBamId32GenObj,Short> arg)
			{
				return new CFInt16TableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSlice );
		tableColumnBlockSize = new TableColumn<ICFBamId32GenObj,Integer>( "BlockSize" );
		tableColumnBlockSize.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<ICFBamId32GenObj, Integer> p ) {
				ICFBamId32GenObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					int value = obj.getRequiredBlockSize();
					Integer wrapped = Integer.valueOf( value );
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnBlockSize.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,Integer>,TableCell<ICFBamId32GenObj,Integer>>() {
			@Override public TableCell<ICFBamId32GenObj,Integer> call(
				TableColumn<ICFBamId32GenObj,Integer> arg)
			{
				return new CFInt32TableCell<ICFBamId32GenObj>();
			}
		});
		dataTable.getColumns().add( tableColumnBlockSize );
		tableColumnLookupDefSchema = new TableColumn<ICFBamId32GenObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamId32GenObj, ICFBamSchemaDefObj> p ) {
				ICFBamId32GenObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,ICFBamSchemaDefObj>,TableCell<ICFBamId32GenObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamId32GenObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamId32GenObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamId32GenObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupDispenser = new TableColumn<ICFBamId32GenObj, ICFBamTableObj>( "Dispensing Table" );
		tableColumnLookupDispenser.setCellValueFactory( new Callback<CellDataFeatures<ICFBamId32GenObj,ICFBamTableObj>,ObservableValue<ICFBamTableObj> >() {
			public ObservableValue<ICFBamTableObj> call( CellDataFeatures<ICFBamId32GenObj, ICFBamTableObj> p ) {
				ICFBamId32GenObj obj = p.getValue();
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
		tableColumnLookupDispenser.setCellFactory( new Callback<TableColumn<ICFBamId32GenObj,ICFBamTableObj>,TableCell<ICFBamId32GenObj,ICFBamTableObj>>() {
			@Override public TableCell<ICFBamId32GenObj,ICFBamTableObj> call(
				TableColumn<ICFBamId32GenObj,ICFBamTableObj> arg)
			{
				return new CFReferenceTableCell<ICFBamId32GenObj,ICFBamTableObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDispenser );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamId32GenObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamId32GenObj> observable,
					ICFBamId32GenObj oldValue,
					ICFBamId32GenObj newValue )
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
		if( observableListOfId32Gen != null ) {
			dataTable.setItems( observableListOfId32Gen );
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
		if( ( value == null ) || ( value instanceof ICFBamId32GenObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamId32GenObj" );
		}
		adjustListButtons();
	}

	public ICFBamId32GenObj getJavaFXFocusAsId32Gen() {
		return( (ICFBamId32GenObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsId32Gen( ICFBamId32GenObj value ) {
		setJavaFXFocus( value );
	}

	public class Id32GenByQualNameComparator
	implements Comparator<ICFBamId32GenObj>
	{
		public Id32GenByQualNameComparator() {
		}

		public int compare( ICFBamId32GenObj lhs, ICFBamId32GenObj rhs ) {
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

	protected Id32GenByQualNameComparator compareId32GenByQualName = new Id32GenByQualNameComparator();

	public Collection<ICFBamId32GenObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamId32GenObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfId32Gen = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamId32GenObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfId32Gen.add( iter.next() );
				}
				observableListOfId32Gen.sort( compareId32GenByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfId32Gen );
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
			buttonAddId32Gen = new CFButton();
			buttonAddId32Gen.setMinWidth( 200 );
			buttonAddId32Gen.setText( "Add Id32Gen" );
			buttonAddId32Gen.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						ICFBamId32GenObj obj = (ICFBamId32GenObj)schemaObj.getId32GenTableObj().newInstance();
						ICFBamId32GenEditObj edit = (ICFBamId32GenEditObj)( obj.beginEdit() );
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
						CFBorderPane frame = javafxSchema.getId32GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ICFBamJavaFXId32GenPaneCommon jpanelCommon = (ICFBamJavaFXId32GenPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddId32Gen );
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
						ICFBamId32GenObj selectedInstance = getJavaFXFocusAsId32Gen();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a85a".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getId32GenFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXId32GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamId32GenObj" );
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
						ICFBamId32GenObj selectedInstance = getJavaFXFocusAsId32Gen();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a85a".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getId32GenFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXId32GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamId32GenObj" );
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
						ICFBamId32GenObj selectedInstance = getJavaFXFocusAsId32Gen();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a85a".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getId32GenFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXId32GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamId32GenObj" );
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

	public ICFBamSchemaDefObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamSchemaDefObj value ) {
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
		ICFBamId32GenObj selectedObj = getJavaFXFocusAsId32Gen();
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
		if( buttonAddId32Gen != null ) {
			buttonAddId32Gen.setDisable( ! allowAdds );
		}

	}
}
