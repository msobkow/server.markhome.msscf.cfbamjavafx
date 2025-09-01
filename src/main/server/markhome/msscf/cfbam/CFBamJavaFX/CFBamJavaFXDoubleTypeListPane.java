// Description: Java 11 JavaFX List of Obj Pane implementation for DoubleType.

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
 *	CFBamJavaFXDoubleTypeListPane JavaFX List of Obj Pane implementation
 *	for DoubleType.
 */
public class CFBamJavaFXDoubleTypeListPane
extends CFBorderPane
implements ICFBamJavaFXDoubleTypePaneList
{
	public static String S_FormName = "List DoubleType";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamDoubleTypeObj> javafxDataCollection = null;
	protected ObservableList<ICFBamDoubleTypeObj> observableListOfDoubleType = null;
	protected ScrollPane scrollMenu = null;
	protected CFHBox hboxMenu = null;
	protected CFButton buttonAddDoubleType = null;
	protected CFButton buttonViewSelected = null;
	protected CFButton buttonEditSelected = null;
	protected CFButton buttonDeleteSelected = null;
	protected TableView<ICFBamDoubleTypeObj> dataTable = null;
	protected TableColumn<ICFBamDoubleTypeObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnName = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamDoubleTypeObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamDoubleTypeObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamDoubleTypeObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamDoubleTypeObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamDoubleTypeObj, Double> tableColumnInitValue = null;
	protected TableColumn<ICFBamDoubleTypeObj, Double> tableColumnMinValue = null;
	protected TableColumn<ICFBamDoubleTypeObj, Double> tableColumnMaxValue = null;
	protected TableColumn<ICFBamDoubleTypeObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;

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


	public CFBamJavaFXDoubleTypeListPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamSchemaDefObj argContainer,
		ICFBamDoubleTypeObj argFocus,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
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
		dataTable = new TableView<ICFBamDoubleTypeObj>();
		tableColumnId = new TableColumn<ICFBamDoubleTypeObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamDoubleTypeObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Long>,TableCell<ICFBamDoubleTypeObj,Long>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Long> call(
				TableColumn<ICFBamDoubleTypeObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamDoubleTypeObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamDoubleTypeObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamDoubleTypeObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamDoubleTypeObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamDoubleTypeObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamDoubleTypeObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamDoubleTypeObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamDoubleTypeObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Boolean>,TableCell<ICFBamDoubleTypeObj,Boolean>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Boolean> call(
				TableColumn<ICFBamDoubleTypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamDoubleTypeObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamDoubleTypeObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Boolean>,TableCell<ICFBamDoubleTypeObj,Boolean>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Boolean> call(
				TableColumn<ICFBamDoubleTypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamDoubleTypeObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamDoubleTypeObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Boolean>,TableCell<ICFBamDoubleTypeObj,Boolean>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Boolean> call(
				TableColumn<ICFBamDoubleTypeObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamDoubleTypeObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamDoubleTypeObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,String>,TableCell<ICFBamDoubleTypeObj,String>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,String> call(
				TableColumn<ICFBamDoubleTypeObj,String> arg)
			{
				return new CFStringTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamDoubleTypeObj,Double>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Double>,ObservableValue<Double> >() {
			public ObservableValue<Double> call( CellDataFeatures<ICFBamDoubleTypeObj, Double> p ) {
				ICFBamDoubleDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Double value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Double> observable = new ReadOnlyObjectWrapper<Double>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Double>,TableCell<ICFBamDoubleTypeObj,Double>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Double> call(
				TableColumn<ICFBamDoubleTypeObj,Double> arg)
			{
				return new CFDoubleTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamDoubleTypeObj,Double>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Double>,ObservableValue<Double> >() {
			public ObservableValue<Double> call( CellDataFeatures<ICFBamDoubleTypeObj, Double> p ) {
				ICFBamDoubleDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Double value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Double> observable = new ReadOnlyObjectWrapper<Double>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Double>,TableCell<ICFBamDoubleTypeObj,Double>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Double> call(
				TableColumn<ICFBamDoubleTypeObj,Double> arg)
			{
				return new CFDoubleTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamDoubleTypeObj,Double>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,Double>,ObservableValue<Double> >() {
			public ObservableValue<Double> call( CellDataFeatures<ICFBamDoubleTypeObj, Double> p ) {
				ICFBamDoubleDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Double value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Double> observable = new ReadOnlyObjectWrapper<Double>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,Double>,TableCell<ICFBamDoubleTypeObj,Double>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,Double> call(
				TableColumn<ICFBamDoubleTypeObj,Double> arg)
			{
				return new CFDoubleTableCell<ICFBamDoubleTypeObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamDoubleTypeObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamDoubleTypeObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamDoubleTypeObj, ICFBamSchemaDefObj> p ) {
				ICFBamDoubleTypeObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamDoubleTypeObj,ICFBamSchemaDefObj>,TableCell<ICFBamDoubleTypeObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamDoubleTypeObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamDoubleTypeObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamDoubleTypeObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamDoubleTypeObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamDoubleTypeObj> observable,
					ICFBamDoubleTypeObj oldValue,
					ICFBamDoubleTypeObj newValue )
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
		if( observableListOfDoubleType != null ) {
			dataTable.setItems( observableListOfDoubleType );
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
		if( ( value == null ) || ( value instanceof ICFBamDoubleTypeObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamDoubleTypeObj" );
		}
		adjustListButtons();
	}

	public ICFBamDoubleTypeObj getJavaFXFocusAsDoubleType() {
		return( (ICFBamDoubleTypeObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsDoubleType( ICFBamDoubleTypeObj value ) {
		setJavaFXFocus( value );
	}

	public class DoubleTypeByQualNameComparator
	implements Comparator<ICFBamDoubleTypeObj>
	{
		public DoubleTypeByQualNameComparator() {
		}

		public int compare( ICFBamDoubleTypeObj lhs, ICFBamDoubleTypeObj rhs ) {
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

	protected DoubleTypeByQualNameComparator compareDoubleTypeByQualName = new DoubleTypeByQualNameComparator();

	public Collection<ICFBamDoubleTypeObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamDoubleTypeObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfDoubleType = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamDoubleTypeObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfDoubleType.add( iter.next() );
				}
				observableListOfDoubleType.sort( compareDoubleTypeByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfDoubleType );
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
			buttonAddDoubleType = new CFButton();
			buttonAddDoubleType.setMinWidth( 200 );
			buttonAddDoubleType.setText( "Add DoubleType" );
			buttonAddDoubleType.setOnAction( new EventHandler<ActionEvent>() {
				@Override public void handle( ActionEvent e ) {
					final String S_ProcName = "handle";
					try {
						ICFBamSchemaObj schemaObj = (ICFBamSchemaObj)javafxSchema.getSchema();
						ICFBamDoubleTypeObj obj = (ICFBamDoubleTypeObj)schemaObj.getDoubleTypeTableObj().newInstance();
						ICFBamDoubleTypeEditObj edit = (ICFBamDoubleTypeEditObj)( obj.beginEdit() );
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
						CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newAddForm( cfFormManager, obj, getViewEditClosedCallback(), true );
						ICFBamJavaFXDoubleTypePaneCommon jpanelCommon = (ICFBamJavaFXDoubleTypePaneCommon)frame;
						jpanelCommon.setJavaFXFocus( obj );
						jpanelCommon.setPaneMode( CFPane.PaneMode.Add );
						cfFormManager.pushForm( frame );
					}
					catch( Throwable t ) {
						CFConsole.formException( S_FormName, ((CFButton)e.getSource()).getText(), t );
					}
				}
			});
			hboxMenu.getChildren().add( buttonAddDoubleType );
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
						ICFBamDoubleTypeObj selectedInstance = getJavaFXFocusAsDoubleType();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a81d".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDoubleTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamDoubleTypeObj" );
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
						ICFBamDoubleTypeObj selectedInstance = getJavaFXFocusAsDoubleType();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a81d".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newViewEditForm( cfFormManager, selectedInstance, getViewEditClosedCallback(), false );
								((ICFBamJavaFXDoubleTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.Edit );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamDoubleTypeObj" );
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
						ICFBamDoubleTypeObj selectedInstance = getJavaFXFocusAsDoubleType();
						if( selectedInstance != null ) {
							String classCode = selectedInstance.getClassCode();
							if( "a81d".equals( classCode ) ) {
								CFBorderPane frame = javafxSchema.getDoubleTypeFactory().newAskDeleteForm( cfFormManager, selectedInstance, getDeleteCallback() );
								((ICFBamJavaFXDoubleTypePaneCommon)frame).setPaneMode( CFPane.PaneMode.View );
								cfFormManager.pushForm( frame );
							}
							else {
								throw new CFLibUnsupportedClassException( getClass(),
									S_ProcName,
									"selectedInstance",
									selectedInstance,
									"ICFBamDoubleTypeObj" );
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
		ICFBamDoubleTypeObj selectedObj = getJavaFXFocusAsDoubleType();
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
		if( buttonAddDoubleType != null ) {
			buttonAddDoubleType.setDisable( ! allowAdds );
		}

	}
}
