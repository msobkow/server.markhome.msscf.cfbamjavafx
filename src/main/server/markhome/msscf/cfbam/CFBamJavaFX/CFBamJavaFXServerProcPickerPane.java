// Description: Java 11 JavaFX Picker of Obj Pane implementation for ServerProc.

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
 *	CFBamJavaFXServerProcPickerPane JavaFX Pick Obj Pane implementation
 *	for ServerProc.
 */
public class CFBamJavaFXServerProcPickerPane
extends CFBorderPane
implements ICFBamJavaFXServerProcPaneList
{
	public static String S_FormName = "Choose ServerProc";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamServerProcObj> javafxDataCollection = null;
	protected ObservableList<ICFBamServerProcObj> observableListOfServerProc = null;
	protected TableColumn<ICFBamServerProcObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnName = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnSuffix = null;
	protected TableColumn<ICFBamServerProcObj, Boolean> tableColumnIsInstanceMethod = null;
	protected TableColumn<ICFBamServerProcObj, Boolean> tableColumnIsServerOnly = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnJMethodBody = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnCppMethodBody = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnCsMethodBody = null;
	protected TableColumn<ICFBamServerProcObj, String> tableColumnDummy = null;
	protected TableColumn<ICFBamServerProcObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<ICFBamServerProcObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXServerProcChosen invokeWhenChosen = null;
	protected ICFBamTableObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXServerProcPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamServerProcObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerProcObj> argDataCollection,
		ICFBamJavaFXServerProcChosen whenChosen )
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
		dataTable = new TableView<ICFBamServerProcObj>();
		tableColumnId = new TableColumn<ICFBamServerProcObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamServerProcObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,Long>,TableCell<ICFBamServerProcObj,Long>>() {
			@Override public TableCell<ICFBamServerProcObj,Long> call(
				TableColumn<ICFBamServerProcObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamServerProcObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamServerProcObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamServerProcObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamServerProcObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamServerProcObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnSuffix = new TableColumn<ICFBamServerProcObj,String>( "Suffix" );
		tableColumnSuffix.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnSuffix.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnSuffix );
		tableColumnIsInstanceMethod = new TableColumn<ICFBamServerProcObj,Boolean>( "Is Instance Method" );
		tableColumnIsInstanceMethod.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamServerProcObj, Boolean> p ) {
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
		tableColumnIsInstanceMethod.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,Boolean>,TableCell<ICFBamServerProcObj,Boolean>>() {
			@Override public TableCell<ICFBamServerProcObj,Boolean> call(
				TableColumn<ICFBamServerProcObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsInstanceMethod );
		tableColumnIsServerOnly = new TableColumn<ICFBamServerProcObj,Boolean>( "Is Server Only" );
		tableColumnIsServerOnly.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamServerProcObj, Boolean> p ) {
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
		tableColumnIsServerOnly.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,Boolean>,TableCell<ICFBamServerProcObj,Boolean>>() {
			@Override public TableCell<ICFBamServerProcObj,Boolean> call(
				TableColumn<ICFBamServerProcObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsServerOnly );
		tableColumnJMethodBody = new TableColumn<ICFBamServerProcObj,String>( "Java Method Body" );
		tableColumnJMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnJMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnJMethodBody );
		tableColumnCppMethodBody = new TableColumn<ICFBamServerProcObj,String>( "C++ Method Body" );
		tableColumnCppMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnCppMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCppMethodBody );
		tableColumnCsMethodBody = new TableColumn<ICFBamServerProcObj,String>( "C-Sharp Method Body" );
		tableColumnCsMethodBody.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
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
		tableColumnCsMethodBody.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFTextTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnCsMethodBody );
		tableColumnDummy = new TableColumn<ICFBamServerProcObj,String>( "Dummy" );
		tableColumnDummy.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamServerProcObj, String> p ) {
				ICFBamServerProcObj obj = p.getValue();
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
		tableColumnDummy.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,String>,TableCell<ICFBamServerProcObj,String>>() {
			@Override public TableCell<ICFBamServerProcObj,String> call(
				TableColumn<ICFBamServerProcObj,String> arg)
			{
				return new CFStringTableCell<ICFBamServerProcObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDummy );
		tableColumnLookupDefSchema = new TableColumn<ICFBamServerProcObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamServerProcObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamServerProcObj, ICFBamSchemaDefObj> p ) {
				ICFBamServerProcObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamServerProcObj,ICFBamSchemaDefObj>,TableCell<ICFBamServerProcObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamServerProcObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamServerProcObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamServerProcObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamServerProcObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamServerProcObj> observable,
					ICFBamServerProcObj oldValue,
					ICFBamServerProcObj newValue )
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
					invokeWhenChosen.choseServerProc( null );
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
					ICFBamServerProcObj selectedInstance = getJavaFXFocusAsServerProc();
					invokeWhenChosen.choseServerProc( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamServerProcObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamServerProcObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamServerProcObj getJavaFXFocusAsServerProc() {
		return( (ICFBamServerProcObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsServerProc( ICFBamServerProcObj value ) {
		setJavaFXFocus( value );
	}

	public class ServerProcByQualNameComparator
	implements Comparator<ICFBamServerProcObj>
	{
		public ServerProcByQualNameComparator() {
		}

		public int compare( ICFBamServerProcObj lhs, ICFBamServerProcObj rhs ) {
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

	protected ServerProcByQualNameComparator compareServerProcByQualName = new ServerProcByQualNameComparator();

	public Collection<ICFBamServerProcObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamServerProcObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfServerProc = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamServerProcObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfServerProc.add( iter.next() );
				}
				observableListOfServerProc.sort( compareServerProcByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfServerProc );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamTableObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamTableObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamServerProcObj selectedObj = getJavaFXFocusAsServerProc();
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

