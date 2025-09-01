// Description: Java 11 JavaFX List of Obj Pane implementation for Int64Type.

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
 *	CFBamJavaFXInt64TypeListPane JavaFX List of Obj Pane implementation
 *	for Int64Type.
 */
public class CFBamJavaFXInt64TypeListPane
extends CFBorderPane
implements ICFBamJavaFXInt64TypePaneList
{
	public static String S_FormName = "List Int64Type";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamInt64TypeObj> javafxDataCollection = null;
	protected ObservableList<ICFBamInt64TypeObj> observableListOfInt64Type = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddInt64Type = null;
	protected CFButton buttonAddId64Gen = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamInt64TypeObj> dataTable = null;
	protected TableColumn<ICFBamInt64TypeObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamInt64TypeObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnName = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamInt64TypeObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamInt64TypeObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamInt64TypeObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamInt64TypeObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamInt64TypeObj, Long> tableColumnInitValue = null;
	protected TableColumn<ICFBamInt64TypeObj, Long> tableColumnMinValue = null;
	protected TableColumn<ICFBamInt64TypeObj, Long> tableColumnMaxValue = null;
	protected TableColumn<ICFBamInt64TypeObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXInt64TypeListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamSchemaDefObj argContainer,
		ICFBamInt64TypeObj argFocus,
		Collection<ICFBamInt64TypeObj> argDataCollection,
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
		dataTable = new TableView<ICFBamInt64TypeObj>();
		tableColumnObjKind = new TableColumn<ICFBamInt64TypeObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
				ICFBamInt64TypeObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamInt64TypeObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamInt64TypeObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Long>,TableCell<ICFBamInt64TypeObj,Long>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Long> call(
				TableColumn<ICFBamInt64TypeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamInt64TypeObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamInt64TypeObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamInt64TypeObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamInt64TypeObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamInt64TypeObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamInt64TypeObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamInt64TypeObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamInt64TypeObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Boolean>,TableCell<ICFBamInt64TypeObj,Boolean>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Boolean> call(
				TableColumn<ICFBamInt64TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamInt64TypeObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamInt64TypeObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Boolean>,TableCell<ICFBamInt64TypeObj,Boolean>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Boolean> call(
				TableColumn<ICFBamInt64TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamInt64TypeObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamInt64TypeObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Boolean>,TableCell<ICFBamInt64TypeObj,Boolean>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Boolean> call(
				TableColumn<ICFBamInt64TypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamInt64TypeObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamInt64TypeObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,String>,TableCell<ICFBamInt64TypeObj,String>>() {
			@Override public TableCell<ICFBamInt64TypeObj,String> call(
				TableColumn<ICFBamInt64TypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamInt64TypeObj,Long>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamInt64TypeObj, Long> p ) {
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
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Long>,TableCell<ICFBamInt64TypeObj,Long>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Long> call(
				TableColumn<ICFBamInt64TypeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamInt64TypeObj,Long>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamInt64TypeObj, Long> p ) {
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
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Long>,TableCell<ICFBamInt64TypeObj,Long>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Long> call(
				TableColumn<ICFBamInt64TypeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamInt64TypeObj,Long>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamInt64TypeObj, Long> p ) {
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
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,Long>,TableCell<ICFBamInt64TypeObj,Long>>() {
			@Override public TableCell<ICFBamInt64TypeObj,Long> call(
				TableColumn<ICFBamInt64TypeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamInt64TypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamInt64TypeObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamInt64TypeObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamInt64TypeObj, ICFBamSchemaDefObj> p ) {
				ICFBamInt64TypeObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamInt64TypeObj,ICFBamSchemaDefObj>,TableCell<ICFBamInt64TypeObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamInt64TypeObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamInt64TypeObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamInt64TypeObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamInt64TypeObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamInt64TypeObj> observable,
					ICFBamInt64TypeObj oldValue,
					ICFBamInt64TypeObj newValue )
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
		if( observableListOfInt64Type != null ) {
			dataTable.setItems( observableListOfInt64Type );
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
		if( ( value == null ) || ( value instanceof ICFBamInt64TypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamInt64TypeObj" );
		}
		adjustListButtons();
	}

	public ICFBamInt64TypeObj getJavaFXFocusAsInt64Type() {
		return( (ICFBamInt64TypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsInt64Type( ICFBamInt64TypeObj value ) {
		setJavaFXFocus( value );
	}

	public class Int64TypeByQualNameComparator
	implements Comparator<ICFBamInt64TypeObj>
	{
		public Int64TypeByQualNameComparator() {
		}

		public int compare( ICFBamInt64TypeObj lhs, ICFBamInt64TypeObj rhs ) {
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

	protected Int64TypeByQualNameComparator compareInt64TypeByQualName = new Int64TypeByQualNameComparator();

	public Collection<ICFBamInt64TypeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamInt64TypeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfInt64Type = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamInt64TypeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfInt64Type.add( iter.next() );
				}
				observableListOfInt64Type.sort( compareInt64TypeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfInt64Type );
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
					buttonAddInt64Type = new CFButton();
					buttonAddInt64Type.setMinWidth( 200 );
					buttonAddInt64Type.setText( "Add Int64Type" );
					buttonAddInt64Type.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamInt64TypeObj obj = (ICFBamInt64TypeObj)schemaObj.getInt64TypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamInt64TypeEditObj edit = (ICFBamInt64TypeEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXInt64TypePaneCommon jpanelCommon = (ICFBamJavaFXInt64TypePaneCommon)frame;
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
						list.add( buttonAddInt64Type );
					}
					buttonAddId64Gen = new CFButton();
					buttonAddId64Gen.setMinWidth( 200 );
					buttonAddId64Gen.setText( "Add Id64Gen" );
					buttonAddId64Gen.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamId64GenObj obj = (ICFBamId64GenObj)schemaObj.getId64GenTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getId64GenFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamId64GenEditObj edit = (ICFBamId64GenEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXId64GenPaneCommon jpanelCommon = (ICFBamJavaFXId64GenPaneCommon)frame;
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
						list.add( buttonAddId64Gen );
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
						ICFBamInt64TypeObj selectedInstance = getJavaFXFocusAsInt64Type();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a828".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a85b".equals( classCode ) ) {
								ICFBamId64GenObj obj = (ICFBamId64GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId64GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXId64GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamInt64TypeObj, ICFBamId64GenObj" );
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
						ICFBamInt64TypeObj selectedInstance = getJavaFXFocusAsInt64Type();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a828".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a85b".equals( classCode ) ) {
								ICFBamId64GenObj obj = (ICFBamId64GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId64GenFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXId64GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamInt64TypeObj, ICFBamId64GenObj" );
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
						ICFBamInt64TypeObj selectedInstance = getJavaFXFocusAsInt64Type();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a828".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getInt64TypeFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXInt64TypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a85b".equals( classCode ) ) {
								ICFBamId64GenObj obj = (ICFBamId64GenObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getId64GenFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXId64GenPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamInt64TypeObj, ICFBamId64GenObj" );
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
		ICFBamInt64TypeObj selectedObj = getJavaFXFocusAsInt64Type();
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
		if( buttonAddInt64Type != null ) {
			buttonAddInt64Type.setDisable( ! allowAdds );
		}

		if( buttonAdd != null ) {
			buttonAdd.setDisable( ! allowAdds );
		}
	}
}
