// Description: Java 11 JavaFX List of Obj Pane implementation for ServerMethod.

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
 *	CFBamJavaFXServerMethodListPane JavaFX List of Obj Pane implementation
 *	for ServerMethod.
 */
public class CFBamJavaFXServerMethodListPane
extends CFBorderPane
implements ICFBamJavaFXServerMethodPaneList
{
	public static String S_FormName = "List ServerMethod";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamServerMethodObj> javafxDataCollection = null;
	protected ObservableList<ICFBamServerMethodObj> observableListOfServerMethod = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddServerMethod = null;
	protected CFButton buttonAddServerObjFunc = null;
	protected CFButton buttonAddServerProc = null;
	protected CFButton buttonAddServerListFunc = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamServerMethodObj> dataTable = null;
	protected TableColumn<ICFBamServerMethodObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamServerMethodObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnName = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnSuffix = null;
	protected TableColumn<ICFBamServerMethodObj, Boolean> tableColumnIsInstanceMethod = null;
	protected TableColumn<ICFBamServerMethodObj, Boolean> tableColumnIsServerOnly = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnJMethodBody = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnCppMethodBody = null;
	protected TableColumn<ICFBamServerMethodObj, String> tableColumnCsMethodBody = null;
	protected TableColumn<ICFBamServerMethodObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXServerMethodListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamTableObj argContainer,
		ICFBamServerMethodObj argFocus,
		Collection<ICFBamServerMethodObj> argDataCollection,
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
		dataTable = new TableView<ICFBamServerMethodObj>();
		tableColumnObjKind = new TableColumn<ICFBamServerMethodObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamServerMethodObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamServerMethodObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,Long>,TableCell<ICFBamServerMethodObj,Long>>() {
			@Override public TableCell<ICFBamServerMethodObj,Long> call(
				TableColumn<ICFBamServerMethodObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamServerMethodObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamServerMethodObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamServerMethodObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamServerMethodObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamServerMethodObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnSuffix = new TableColumn<ICFBamServerMethodObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsInstanceMethod = new TableColumn<ICFBamServerMethodObj,Boolean>( "Is Instance Method" );
		tableColumnIsInstanceMethod.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamServerMethodObj, Boolean> p ) {
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
		tableColumnIsInstanceMethod.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,Boolean>,TableCell<ICFBamServerMethodObj,Boolean>>() {
			@Override public TableCell<ICFBamServerMethodObj,Boolean> call(
				TableColumn<ICFBamServerMethodObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsInstanceMethod );
		tableColumnIsServerOnly = new TableColumn<ICFBamServerMethodObj,Boolean>( "Is Server Only" );
		tableColumnIsServerOnly.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamServerMethodObj, Boolean> p ) {
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
		tableColumnIsServerOnly.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,Boolean>,TableCell<ICFBamServerMethodObj,Boolean>>() {
			@Override public TableCell<ICFBamServerMethodObj,Boolean> call(
				TableColumn<ICFBamServerMethodObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsServerOnly );
		tableColumnJMethodBody = new TableColumn<ICFBamServerMethodObj,String>( "Java Method Body" );
		tableColumnJMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnJMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnJMethodBody );
		tableColumnCppMethodBody = new TableColumn<ICFBamServerMethodObj,String>( "C++ Method Body" );
		tableColumnCppMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnCppMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCppMethodBody );
		tableColumnCsMethodBody = new TableColumn<ICFBamServerMethodObj,String>( "C-Sharp Method Body" );
		tableColumnCsMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerMethodObj, String> p ) {
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
		tableColumnCsMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,String>,TableCell<ICFBamServerMethodObj,String>>() {
			@Override public TableCell<ICFBamServerMethodObj,String> call(
				TableColumn<ICFBamServerMethodObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerMethodObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCsMethodBody );
		tableColumnLookupDefSchema = new TableColumn<ICFBamServerMethodObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerMethodObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamServerMethodObj, ICFBamSchemaDefObj> p ) {
				ICFBamServerMethodObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamServerMethodObj,ICFBamSchemaDefObj>,TableCell<ICFBamServerMethodObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamServerMethodObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamServerMethodObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamServerMethodObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamServerMethodObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamServerMethodObj> observable,
					ICFBamServerMethodObj oldValue,
					ICFBamServerMethodObj newValue )
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
		if( observableListOfServerMethod != null ) {
			dataTable.setItems( observableListOfServerMethod );
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
		if( ( value == null ) || ( value instanceof ICFBamServerMethodObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamServerMethodObj" );
		}
		adjustListButtons();
	}

	public ICFBamServerMethodObj getJavaFXFocusAsServerMethod() {
		return( (ICFBamServerMethodObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsServerMethod( ICFBamServerMethodObj value ) {
		setJavaFXFocus( value );
	}

	public class ServerMethodByQualNameComparator
	implements Comparator<ICFBamServerMethodObj>
	{
		public ServerMethodByQualNameComparator() {
		}

		public int compare( ICFBamServerMethodObj lhs, ICFBamServerMethodObj rhs ) {
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

	protected ServerMethodByQualNameComparator compareServerMethodByQualName = new ServerMethodByQualNameComparator();

	public Collection<ICFBamServerMethodObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamServerMethodObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfServerMethod = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamServerMethodObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfServerMethod.add( iter.next() );
				}
				observableListOfServerMethod.sort( compareServerMethodByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfServerMethod );
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
					buttonAddServerMethod = new CFButton();
					buttonAddServerMethod.setMinWidth( 200 );
					buttonAddServerMethod.setText( "Add ServerMethod" );
					buttonAddServerMethod.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerMethodObj obj = (ICFBamServerMethodObj)schemaObj.getServerMethodTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerMethodEditObj edit = (ICFBamServerMethodEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXServerMethodPaneCommon jpanelCommon = (ICFBamJavaFXServerMethodPaneCommon)frame;
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
						list.add( buttonAddServerMethod );
					}
					buttonAddServerObjFunc = new CFButton();
					buttonAddServerObjFunc.setMinWidth( 200 );
					buttonAddServerObjFunc.setText( "Add ServerObjFunc" );
					buttonAddServerObjFunc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)schemaObj.getServerObjFuncTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerObjFuncEditObj edit = (ICFBamServerObjFuncEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXServerObjFuncPaneCommon jpanelCommon = (ICFBamJavaFXServerObjFuncPaneCommon)frame;
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
						list.add( buttonAddServerObjFunc );
					}
					buttonAddServerProc = new CFButton();
					buttonAddServerProc.setMinWidth( 200 );
					buttonAddServerProc.setText( "Add ServerProc" );
					buttonAddServerProc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerProcObj obj = (ICFBamServerProcObj)schemaObj.getServerProcTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamServerProcEditObj edit = (ICFBamServerProcEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXServerProcPaneCommon jpanelCommon = (ICFBamJavaFXServerProcPaneCommon)frame;
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
						list.add( buttonAddServerProc );
					}
					buttonAddServerListFunc = new CFButton();
					buttonAddServerListFunc.setMinWidth( 200 );
					buttonAddServerListFunc.setText( "Add ServerListFunc" );
					buttonAddServerListFunc.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)schemaObj.getServerListFuncTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
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
								ICFBamJavaFXServerListFuncPaneCommon jpanelCommon = (ICFBamJavaFXServerListFuncPaneCommon)frame;
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
						list.add( buttonAddServerListFunc );
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
						ICFBamServerMethodObj selectedInstance = getJavaFXFocusAsServerMethod();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a805".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a806".equals( classCode ) ) {
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a807".equals( classCode ) ) {
								ICFBamServerProcObj obj = (ICFBamServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a837".equals( classCode ) ) {
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamServerMethodObj, ICFBamServerObjFuncObj, ICFBamServerProcObj, ICFBamServerListFuncObj" );
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
						ICFBamServerMethodObj selectedInstance = getJavaFXFocusAsServerMethod();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a805".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a806".equals( classCode ) ) {
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a807".equals( classCode ) ) {
								ICFBamServerProcObj obj = (ICFBamServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a837".equals( classCode ) ) {
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamServerMethodObj, ICFBamServerObjFuncObj, ICFBamServerProcObj, ICFBamServerListFuncObj" );
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
						ICFBamServerMethodObj selectedInstance = getJavaFXFocusAsServerMethod();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a805".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getServerMethodFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXServerMethodPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a806".equals( classCode ) ) {
								ICFBamServerObjFuncObj obj = (ICFBamServerObjFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerObjFuncFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerObjFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a807".equals( classCode ) ) {
								ICFBamServerProcObj obj = (ICFBamServerProcObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerProcFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerProcPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a837".equals( classCode ) ) {
								ICFBamServerListFuncObj obj = (ICFBamServerListFuncObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getServerListFuncFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXServerListFuncPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamServerMethodObj, ICFBamServerObjFuncObj, ICFBamServerProcObj, ICFBamServerListFuncObj" );
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
		ICFBamServerMethodObj selectedObj = getJavaFXFocusAsServerMethod();
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
		if( buttonAddServerMethod != null ) {
			buttonAddServerMethod.setDisable( ! allowAdds );
		}

		if( buttonAdd != null ) {
			buttonAdd.setDisable( ! allowAdds );
		}
	}
}
