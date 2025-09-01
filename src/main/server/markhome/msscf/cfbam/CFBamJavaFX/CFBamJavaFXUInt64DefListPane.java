// Description: Java 11 JavaFX List of Obj Pane implementation for UInt64Def.

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
 *	CFBamJavaFXUInt64DefListPane JavaFX List of Obj Pane implementation
 *	for UInt64Def.
 */
public class CFBamJavaFXUInt64DefListPane
extends CFBorderPane
implements ICFBamJavaFXUInt64DefPaneList
{
	public static String S_FormName = "List UInt64Def";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamUInt64DefObj> javafxDataCollection = null;
	protected ObservableList<ICFBamUInt64DefObj> observableListOfUInt64Def = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddUInt64Type = null;
	protected CFButton buttonAddUInt64Col = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamUInt64DefObj> dataTable = null;
	protected TableColumn<ICFBamUInt64DefObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamUInt64DefObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnName = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamUInt64DefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamUInt64DefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamUInt64DefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamUInt64DefObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamUInt64DefObj, BigDecimal> tableColumnInitValue = null;
	protected TableColumn<ICFBamUInt64DefObj, BigDecimal> tableColumnMinValue = null;
	protected TableColumn<ICFBamUInt64DefObj, BigDecimal> tableColumnMaxValue = null;
	protected TableColumn<ICFBamUInt64DefObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXUInt64DefListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamScopeObj argContainer,
		ICFBamUInt64DefObj argFocus,
		Collection<ICFBamUInt64DefObj> argDataCollection,
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
		dataTable = new TableView<ICFBamUInt64DefObj>();
		tableColumnObjKind = new TableColumn<ICFBamUInt64DefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
				ICFBamUInt64DefObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamUInt64DefObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamUInt64DefObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,Long>,TableCell<ICFBamUInt64DefObj,Long>>() {
			@Override public TableCell<ICFBamUInt64DefObj,Long> call(
				TableColumn<ICFBamUInt64DefObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamUInt64DefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamUInt64DefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamUInt64DefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamUInt64DefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamUInt64DefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamUInt64DefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamUInt64DefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamUInt64DefObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,Boolean>,TableCell<ICFBamUInt64DefObj,Boolean>>() {
			@Override public TableCell<ICFBamUInt64DefObj,Boolean> call(
				TableColumn<ICFBamUInt64DefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamUInt64DefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamUInt64DefObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,Boolean>,TableCell<ICFBamUInt64DefObj,Boolean>>() {
			@Override public TableCell<ICFBamUInt64DefObj,Boolean> call(
				TableColumn<ICFBamUInt64DefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamUInt64DefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamUInt64DefObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,Boolean>,TableCell<ICFBamUInt64DefObj,Boolean>>() {
			@Override public TableCell<ICFBamUInt64DefObj,Boolean> call(
				TableColumn<ICFBamUInt64DefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamUInt64DefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUInt64DefObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,String>,TableCell<ICFBamUInt64DefObj,String>>() {
			@Override public TableCell<ICFBamUInt64DefObj,String> call(
				TableColumn<ICFBamUInt64DefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamUInt64DefObj,BigDecimal>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,BigDecimal>,ObservableValue<BigDecimal> >() {
			public ObservableValue<BigDecimal> call( CellDataFeatures<ICFBamUInt64DefObj, BigDecimal> p ) {
				ICFBamUInt64DefObj obj = p.getValue();
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
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,BigDecimal>,TableCell<ICFBamUInt64DefObj,BigDecimal>>() {
			@Override public TableCell<ICFBamUInt64DefObj,BigDecimal> call(
				TableColumn<ICFBamUInt64DefObj,BigDecimal> arg)
			{
				return new CFUInt64TableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamUInt64DefObj,BigDecimal>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,BigDecimal>,ObservableValue<BigDecimal> >() {
			public ObservableValue<BigDecimal> call( CellDataFeatures<ICFBamUInt64DefObj, BigDecimal> p ) {
				ICFBamUInt64DefObj obj = p.getValue();
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
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,BigDecimal>,TableCell<ICFBamUInt64DefObj,BigDecimal>>() {
			@Override public TableCell<ICFBamUInt64DefObj,BigDecimal> call(
				TableColumn<ICFBamUInt64DefObj,BigDecimal> arg)
			{
				return new CFUInt64TableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamUInt64DefObj,BigDecimal>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,BigDecimal>,ObservableValue<BigDecimal> >() {
			public ObservableValue<BigDecimal> call( CellDataFeatures<ICFBamUInt64DefObj, BigDecimal> p ) {
				ICFBamUInt64DefObj obj = p.getValue();
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
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,BigDecimal>,TableCell<ICFBamUInt64DefObj,BigDecimal>>() {
			@Override public TableCell<ICFBamUInt64DefObj,BigDecimal> call(
				TableColumn<ICFBamUInt64DefObj,BigDecimal> arg)
			{
				return new CFUInt64TableCell<ICFBamUInt64DefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamUInt64DefObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUInt64DefObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamUInt64DefObj, ICFBamSchemaDefObj> p ) {
				ICFBamUInt64DefObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamUInt64DefObj,ICFBamSchemaDefObj>,TableCell<ICFBamUInt64DefObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamUInt64DefObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamUInt64DefObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamUInt64DefObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamUInt64DefObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamUInt64DefObj> observable,
					ICFBamUInt64DefObj oldValue,
					ICFBamUInt64DefObj newValue )
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
		if( observableListOfUInt64Def != null ) {
			dataTable.setItems( observableListOfUInt64Def );
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
		if( ( value == null ) || ( value instanceof ICFBamUInt64DefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamUInt64DefObj" );
		}
		adjustListButtons();
	}

	public ICFBamUInt64DefObj getJavaFXFocusAsUInt64Def() {
		return( (ICFBamUInt64DefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsUInt64Def( ICFBamUInt64DefObj value ) {
		setJavaFXFocus( value );
	}

	public class UInt64DefByQualNameComparator
	implements Comparator<ICFBamUInt64DefObj>
	{
		public UInt64DefByQualNameComparator() {
		}

		public int compare( ICFBamUInt64DefObj lhs, ICFBamUInt64DefObj rhs ) {
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

	protected UInt64DefByQualNameComparator compareUInt64DefByQualName = new UInt64DefByQualNameComparator();

	public Collection<ICFBamUInt64DefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamUInt64DefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfUInt64Def = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamUInt64DefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfUInt64Def.add( iter.next() );
				}
				observableListOfUInt64Def.sort( compareUInt64DefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfUInt64Def );
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
					buttonAddUInt64Type = new CFButton();
					buttonAddUInt64Type.setMinWidth( 200 );
					buttonAddUInt64Type.setText( "Add UInt64Type" );
					buttonAddUInt64Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamUInt64TypeObj obj = (ICFBamUInt64TypeObj)schemaObj.getUInt64TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamUInt64TypeEditObj edit = (ICFBamUInt64TypeEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXUInt64TypePaneCommon jpanelCommon = (ICFBamJavaFXUInt64TypePaneCommon)frame;
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
						list.add( buttonAddUInt64Type );
					}
					buttonAddUInt64Col = new CFButton();
					buttonAddUInt64Col.setMinWidth( 200 );
					buttonAddUInt64Col.setText( "Add UInt64Col" );
					buttonAddUInt64Col.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamUInt64ColObj obj = (ICFBamUInt64ColObj)schemaObj.getUInt64ColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamUInt64ColEditObj edit = (ICFBamUInt64ColEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXUInt64ColPaneCommon jpanelCommon = (ICFBamJavaFXUInt64ColPaneCommon)frame;
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
						list.add( buttonAddUInt64Col );
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
						ICFBamUInt64DefObj selectedInstance = getJavaFXFocusAsUInt64Def();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a84e".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getUInt64DefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXUInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a84f".equals( classCode ) ) {
								ICFBamUInt64TypeObj obj = (ICFBamUInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXUInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a86c".equals( classCode ) ) {
								ICFBamUInt64ColObj obj = (ICFBamUInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXUInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamUInt64DefObj, ICFBamUInt64TypeObj, ICFBamUInt64ColObj" );
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
						ICFBamUInt64DefObj selectedInstance = getJavaFXFocusAsUInt64Def();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a84e".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getUInt64DefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXUInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a84f".equals( classCode ) ) {
								ICFBamUInt64TypeObj obj = (ICFBamUInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXUInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a86c".equals( classCode ) ) {
								ICFBamUInt64ColObj obj = (ICFBamUInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXUInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamUInt64DefObj, ICFBamUInt64TypeObj, ICFBamUInt64ColObj" );
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
						ICFBamUInt64DefObj selectedInstance = getJavaFXFocusAsUInt64Def();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a84e".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getUInt64DefFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXUInt64DefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a84f".equals( classCode ) ) {
								ICFBamUInt64TypeObj obj = (ICFBamUInt64TypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64TypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXUInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a86c".equals( classCode ) ) {
								ICFBamUInt64ColObj obj = (ICFBamUInt64ColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getUInt64ColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXUInt64ColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamUInt64DefObj, ICFBamUInt64TypeObj, ICFBamUInt64ColObj" );
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
		ICFBamUInt64DefObj selectedObj = getJavaFXFocusAsUInt64Def();
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
