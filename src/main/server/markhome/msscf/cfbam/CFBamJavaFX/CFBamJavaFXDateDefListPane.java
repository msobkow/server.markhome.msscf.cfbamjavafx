// Description: Java 11 JavaFX List of Obj Pane implementation for DateDef.

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
 *	CFBamJavaFXDateDefListPane JavaFX List of Obj Pane implementation
 *	for DateDef.
 */
public class CFBamJavaFXDateDefListPane
extends CFBorderPane
implements ICFBamJavaFXDateDefPaneList
{
	public static String S_FormName = "List DateDef";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamDateDefObj> javafxDataCollection = null;
	protected ObservableList<ICFBamDateDefObj> observableListOfDateDef = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected ScrollPane scrollMenuAdd = null;
	protected CFVBox vboxMenuAdd = null;
	protected CFButton buttonAdd = null;
	protected CFButton buttonCancelAdd = null;
	protected CFButton buttonAddDateType = null;
	protected CFButton buttonAddDateCol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamDateDefObj> dataTable = null;
	protected TableColumn<ICFBamDateDefObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamDateDefObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnName = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamDateDefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamDateDefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamDateDefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamDateDefObj, String> tableColumnDummy = null;
	protected TableColumn<ICFBamDateDefObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXDateDefListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamScopeObj argContainer,
		ICFBamDateDefObj argFocus,
		Collection<ICFBamDateDefObj> argDataCollection,
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
		dataTable = new TableView<ICFBamDateDefObj>();
		tableColumnObjKind = new TableColumn<ICFBamDateDefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
				ICFBamDateDefObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamDateDefObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamDateDefObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,Long>,TableCell<ICFBamDateDefObj,Long>>() {
			@Override public TableCell<ICFBamDateDefObj,Long> call(
				TableColumn<ICFBamDateDefObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamDateDefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamDateDefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamDateDefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamDateDefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamDateDefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamDateDefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamDateDefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamDateDefObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,Boolean>,TableCell<ICFBamDateDefObj,Boolean>>() {
			@Override public TableCell<ICFBamDateDefObj,Boolean> call(
				TableColumn<ICFBamDateDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamDateDefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamDateDefObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,Boolean>,TableCell<ICFBamDateDefObj,Boolean>>() {
			@Override public TableCell<ICFBamDateDefObj,Boolean> call(
				TableColumn<ICFBamDateDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamDateDefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamDateDefObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,Boolean>,TableCell<ICFBamDateDefObj,Boolean>>() {
			@Override public TableCell<ICFBamDateDefObj,Boolean> call(
				TableColumn<ICFBamDateDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamDateDefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnDummy = new TableColumn<ICFBamDateDefObj,String>( "Dummy" );
		tableColumnDummy.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDateDefObj, String> p ) {
				ICFBamDateDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getOptionalDummy();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnDummy.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,String>,TableCell<ICFBamDateDefObj,String>>() {
			@Override public TableCell<ICFBamDateDefObj,String> call(
				TableColumn<ICFBamDateDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDateDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDummy );
		tableColumnLookupDefSchema = new TableColumn<ICFBamDateDefObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDateDefObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamDateDefObj, ICFBamSchemaDefObj> p ) {
				ICFBamDateDefObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamDateDefObj,ICFBamSchemaDefObj>,TableCell<ICFBamDateDefObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamDateDefObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamDateDefObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamDateDefObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamDateDefObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamDateDefObj> observable,
					ICFBamDateDefObj oldValue,
					ICFBamDateDefObj newValue )
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
		if( observableListOfDateDef != null ) {
			dataTable.setItems( observableListOfDateDef );
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
		if( ( value == null ) || ( value instanceof ICFBamDateDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamDateDefObj" );
		}
		adjustListButtons();
	}

	public ICFBamDateDefObj getJavaFXFocusAsDateDef() {
		return( (ICFBamDateDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDateDef( ICFBamDateDefObj value ) {
		setJavaFXFocus( value );
	}

	public class DateDefByQualNameComparator
	implements Comparator<ICFBamDateDefObj>
	{
		public DateDefByQualNameComparator() {
		}

		public int compare( ICFBamDateDefObj lhs, ICFBamDateDefObj rhs ) {
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

	protected DateDefByQualNameComparator compareDateDefByQualName = new DateDefByQualNameComparator();

	public Collection<ICFBamDateDefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamDateDefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfDateDef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamDateDefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfDateDef.add( iter.next() );
				}
				observableListOfDateDef.sort( compareDateDefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfDateDef );
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
					buttonAddDateType = new CFButton();
					buttonAddDateType.setMinWidth( 200 );
					buttonAddDateType.setText( "Add DateType" );
					buttonAddDateType.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamDateTypeObj obj = (ICFBamDateTypeObj)schemaObj.getDateTypeTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamDateTypeEditObj edit = (ICFBamDateTypeEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXDateTypePaneCommon jpanelCommon = (ICFBamJavaFXDateTypePaneCommon)frame;
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
						list.add( buttonAddDateType );
					}
					buttonAddDateCol = new CFButton();
					buttonAddDateCol.setMinWidth( 200 );
					buttonAddDateCol.setText( "Add DateCol" );
					buttonAddDateCol.setOnAction( new EventHandler<ActionEvent>() {
						@Override public void handle( ActionEvent e ) {
							final String S_ProcName = "handle";
							try {
								ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
								ICFBamDateColObj obj = (ICFBamDateColObj)schemaObj.getDateColTableObj().newInstance();
								CFBorderPane frame = javafxSchema.getDateColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
								ICFBamDateColEditObj edit = (ICFBamDateColEditObj)( obj.beginEdit() );
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
								ICFBamJavaFXDateColPaneCommon jpanelCommon = (ICFBamJavaFXDateColPaneCommon)frame;
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
						list.add( buttonAddDateCol );
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
						ICFBamDateDefObj selectedInstance = getJavaFXFocusAsDateDef();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a815".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getDateDefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a816".equals( classCode ) ) {
								ICFBamDateTypeObj obj = (ICFBamDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a854".equals( classCode ) ) {
								ICFBamDateColObj obj = (ICFBamDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamDateDefObj, ICFBamDateTypeObj, ICFBamDateColObj" );
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
						ICFBamDateDefObj selectedInstance = getJavaFXFocusAsDateDef();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a815".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getDateDefFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a816".equals( classCode ) ) {
								ICFBamDateTypeObj obj = (ICFBamDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else if( "a854".equals( classCode ) ) {
								ICFBamDateColObj obj = (ICFBamDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateColFactory().newViewEditForm( cfFormManager, obj, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamDateDefObj, ICFBamDateTypeObj, ICFBamDateColObj" );
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
						ICFBamDateDefObj selectedInstance = getJavaFXFocusAsDateDef();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a815".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getDateDefFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXDateDefPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a816".equals( classCode ) ) {
								ICFBamDateTypeObj obj = (ICFBamDateTypeObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateTypeFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDateTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else if( "a854".equals( classCode ) ) {
								ICFBamDateColObj obj = (ICFBamDateColObj)selectedInstance;
								CFBorderPane frame = javafxSchema.getDateColFactory().newAskDeleteForm( cfFormManager, obj, getDeleteCallback() );
								((ICFBamJavaFXDateColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamDateDefObj, ICFBamDateTypeObj, ICFBamDateColObj" );
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
		ICFBamDateDefObj selectedObj = getJavaFXFocusAsDateDef();
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
