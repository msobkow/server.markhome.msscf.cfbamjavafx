// Description: Java 11 JavaFX List of Obj Pane implementation for BlobCol.

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
 *	CFBamJavaFXBlobColListPane JavaFX List of Obj Pane implementation
 *	for BlobCol.
 */
public class CFBamJavaFXBlobColListPane
extends CFBorderPane
implements ICFBamJavaFXBlobColPaneList
{
	public static String S_FormName = "List BlobCol";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamBlobColObj> javafxDataCollection = null;
	protected ObservableList<ICFBamBlobColObj> observableListOfBlobCol = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddBlobCol = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamBlobColObj> dataTable = null;
	protected TableColumn<ICFBamBlobColObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnName = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamBlobColObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamBlobColObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamBlobColObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamBlobColObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamBlobColObj, Integer> tableColumnMaxLen = null;
	protected TableColumn<ICFBamBlobColObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXBlobColListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamTableObj argContainer,
		ICFBamBlobColObj argFocus,
		Collection<ICFBamBlobColObj> argDataCollection,
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
		dataTable = new TableView<ICFBamBlobColObj>();
		tableColumnId = new TableColumn<ICFBamBlobColObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamBlobColObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,Long>,TableCell<ICFBamBlobColObj,Long>>() {
			@Override public TableCell<ICFBamBlobColObj,Long> call(
				TableColumn<ICFBamBlobColObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamBlobColObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamBlobColObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamBlobColObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamBlobColObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamBlobColObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamBlobColObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamBlobColObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBlobColObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,Boolean>,TableCell<ICFBamBlobColObj,Boolean>>() {
			@Override public TableCell<ICFBamBlobColObj,Boolean> call(
				TableColumn<ICFBamBlobColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamBlobColObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBlobColObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,Boolean>,TableCell<ICFBamBlobColObj,Boolean>>() {
			@Override public TableCell<ICFBamBlobColObj,Boolean> call(
				TableColumn<ICFBamBlobColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamBlobColObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamBlobColObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,Boolean>,TableCell<ICFBamBlobColObj,Boolean>>() {
			@Override public TableCell<ICFBamBlobColObj,Boolean> call(
				TableColumn<ICFBamBlobColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamBlobColObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamBlobColObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,String>,TableCell<ICFBamBlobColObj,String>>() {
			@Override public TableCell<ICFBamBlobColObj,String> call(
				TableColumn<ICFBamBlobColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnMaxLen = new TableColumn<ICFBamBlobColObj,Integer>( "Max. Length" );
		tableColumnMaxLen.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,Integer>,ObservableValue<Integer> >() {
			public ObservableValue<Integer> call( CellDataFeatures<ICFBamBlobColObj, Integer> p ) {
				ICFBamBlobDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					int value = obj.getRequiredMaxLen();
					Integer wrapped = Integer.valueOf( value );
					ReadOnlyObjectWrapper<Integer> observable = new ReadOnlyObjectWrapper<Integer>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnMaxLen.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,Integer>,TableCell<ICFBamBlobColObj,Integer>>() {
			@Override public TableCell<ICFBamBlobColObj,Integer> call(
				TableColumn<ICFBamBlobColObj,Integer> arg)
			{
				return new CFInt32TableCell<ICFBamBlobColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxLen );
		tableColumnLookupDefSchema = new TableColumn<ICFBamBlobColObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamBlobColObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamBlobColObj, ICFBamSchemaDefObj> p ) {
				ICFBamBlobColObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamBlobColObj,ICFBamSchemaDefObj>,TableCell<ICFBamBlobColObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamBlobColObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamBlobColObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamBlobColObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamBlobColObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamBlobColObj> observable,
					ICFBamBlobColObj oldValue,
					ICFBamBlobColObj newValue )
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
		if( observableListOfBlobCol != null ) {
			dataTable.setItems( observableListOfBlobCol );
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
		if( ( value == null ) || ( value instanceof ICFBamBlobColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamBlobColObj" );
		}
		adjustListButtons();
	}

	public ICFBamBlobColObj getJavaFXFocusAsBlobCol() {
		return( (ICFBamBlobColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsBlobCol( ICFBamBlobColObj value ) {
		setJavaFXFocus( value );
	}

	public class BlobColByQualNameComparator
	implements Comparator<ICFBamBlobColObj>
	{
		public BlobColByQualNameComparator() {
		}

		public int compare( ICFBamBlobColObj lhs, ICFBamBlobColObj rhs ) {
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

	protected BlobColByQualNameComparator compareBlobColByQualName = new BlobColByQualNameComparator();

	public Collection<ICFBamBlobColObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamBlobColObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfBlobCol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamBlobColObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfBlobCol.add( iter.next() );
				}
				observableListOfBlobCol.sort( compareBlobColByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfBlobCol );
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
			buttonAddBlobCol = new CFButton();
			buttonAddBlobCol.setMinWidth( 200 );
			buttonAddBlobCol.setText( "Add BlobCol" );
			buttonAddBlobCol.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						ICFBamBlobColObj obj = (ICFBamBlobColObj)schemaObj.getBlobColTableObj().newInstance();
						ICFBamBlobColEditObj edit = (ICFBamBlobColEditObj)( obj.beginEdit() );
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
						CFBorderPane frame = javafxSchema.getBlobColFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ICFBamJavaFXBlobColPaneCommon jpanelCommon = (ICFBamJavaFXBlobColPaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddBlobCol );
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
						ICFBamBlobColObj selectedInstance = getJavaFXFocusAsBlobCol();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a852".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getBlobColFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBlobColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamBlobColObj" );
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
						ICFBamBlobColObj selectedInstance = getJavaFXFocusAsBlobCol();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a852".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getBlobColFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXBlobColPaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamBlobColObj" );
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
						ICFBamBlobColObj selectedInstance = getJavaFXFocusAsBlobCol();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a852".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getBlobColFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXBlobColPaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamBlobColObj" );
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
		ICFBamBlobColObj selectedObj = getJavaFXFocusAsBlobCol();
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
		if( buttonAddBlobCol != null ) {
			buttonAddBlobCol.setDisable( ! allowAdds );
		}

	}
}
