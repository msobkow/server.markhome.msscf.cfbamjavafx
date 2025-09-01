// Description: Java 11 JavaFX List of Obj Pane implementation for ServerListFunc.

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
 *	CFBamJavaFXServerListFuncListPane JavaFX List of Obj Pane implementation
 *	for ServerListFunc.
 */
public class CFBamJavaFXServerListFuncListPane
extends CFBorderPane
implements ICFBamJavaFXServerListFuncPaneList
{
	public static String S_FormName = "List ServerListFunc";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamServerListFuncObj> javafxDataCollection = null;
	protected ObservableList<ICFBamServerListFuncObj> observableListOfServerListFunc = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddServerListFunc = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamServerListFuncObj> dataTable = null;
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

	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected boolean javafxIsInitializing = true;
	protected boolean javafxSortByChain = false;
	protected ICFBamTableObj javafxContainer = null;
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


	public CFBamJavaFXServerListFuncListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamTableObj argContainer,
		ICFBamServerListFuncObj argFocus,
		Collection<ICFBamServerListFuncObj> argDataCollection,
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
		if( observableListOfServerListFunc != null ) {
			dataTable.setItems( observableListOfServerListFunc );
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
		adjustListButtons();
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
			buttonAddServerListFunc = new CFButton();
			buttonAddServerListFunc.setMinWidth( 200 );
			buttonAddServerListFunc.setText( "Add ServerListFunc" );
			buttonAddServerListFunc.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)schemaObj.getServerListFuncTableObj().newInstance();
						ICFBamServerListFuncEditObj edit = (ICFBamServerListFuncEditObj)( obj.beginEdit() );
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
								edit.setRequiredContainerForTable( container );
						CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ICFBamJavaFXServerListFuncPaneCommon jpanelCommon = (ICFBamJavaFXServerListFuncPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddServerListFunc );
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
						ICFBamServerListFuncObj selectedInstance = getJavaFXFocusAsServerListFunc();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a837".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamServerListFuncObj" );
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
						ICFBamServerListFuncObj selectedInstance = getJavaFXFocusAsServerListFunc();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a837".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamServerListFuncObj" );
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
						ICFBamServerListFuncObj selectedInstance = getJavaFXFocusAsServerListFunc();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a837".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamServerListFuncObj" );
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

	public ICFBamTableObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamTableObj value ) {
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
		ICFBamServerListFuncObj selectedObj = getJavaFXFocusAsServerListFunc();
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
		if( buttonAddServerListFunc != null ) {
			buttonAddServerListFunc.setDisable( ! allowAdds );
		}

	}
}
