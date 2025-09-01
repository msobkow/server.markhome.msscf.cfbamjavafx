// Description: Java 11 JavaFX Picker of Obj Pane implementation for UuidDef.

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
 *	CFBamJavaFXUuidDefPickerPane JavaFX Pick Obj Pane implementation
 *	for UuidDef.
 */
public class CFBamJavaFXUuidDefPickerPane
extends CFBorderPane
implements ICFBamJavaFXUuidDefPaneList
{
	public static String S_FormName = "Choose UuidDef";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamUuidDefObj> javafxDataCollection = null;
	protected ObservableList<ICFBamUuidDefObj> observableListOfUuidDef = null;
	protected TableColumn<ICFBamUuidDefObj,String> tableColumnObjKind = null;
	protected TableColumn<ICFBamUuidDefObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnName = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamUuidDefObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamUuidDefObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamUuidDefObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamUuidDefObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamUuidDefObj, UUID> tableColumnInitValue = null;
	protected TableColumn<ICFBamUuidDefObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<ICFBamUuidDefObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXUuidDefChosen invokeWhenChosen = null;
	protected ICFBamScopeObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXUuidDefPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamUuidDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUuidDefObj> argDataCollection,
		ICFBamJavaFXUuidDefChosen whenChosen )
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
		dataTable = new TableView<ICFBamUuidDefObj>();
		tableColumnObjKind = new TableColumn<ICFBamUuidDefObj,String>( "Class Code" );
		tableColumnObjKind.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			@Override public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
				ICFBamUuidDefObj obj = p.getValue();
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
		tableColumnObjKind.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnObjKind );
		tableColumnId = new TableColumn<ICFBamUuidDefObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamUuidDefObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,Long>,TableCell<ICFBamUuidDefObj,Long>>() {
			@Override public TableCell<ICFBamUuidDefObj,Long> call(
				TableColumn<ICFBamUuidDefObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamUuidDefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamUuidDefObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamUuidDefObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamUuidDefObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamUuidDefObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamUuidDefObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamUuidDefObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamUuidDefObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,Boolean>,TableCell<ICFBamUuidDefObj,Boolean>>() {
			@Override public TableCell<ICFBamUuidDefObj,Boolean> call(
				TableColumn<ICFBamUuidDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamUuidDefObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamUuidDefObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,Boolean>,TableCell<ICFBamUuidDefObj,Boolean>>() {
			@Override public TableCell<ICFBamUuidDefObj,Boolean> call(
				TableColumn<ICFBamUuidDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamUuidDefObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamUuidDefObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,Boolean>,TableCell<ICFBamUuidDefObj,Boolean>>() {
			@Override public TableCell<ICFBamUuidDefObj,Boolean> call(
				TableColumn<ICFBamUuidDefObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamUuidDefObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamUuidDefObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,String>,TableCell<ICFBamUuidDefObj,String>>() {
			@Override public TableCell<ICFBamUuidDefObj,String> call(
				TableColumn<ICFBamUuidDefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamUuidDefObj,UUID>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,UUID>,ObservableValue<UUID> >() {
			public ObservableValue<UUID> call( CellDataFeatures<ICFBamUuidDefObj, UUID> p ) {
				ICFBamUuidDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					UUID value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<UUID> observable = new ReadOnlyObjectWrapper<UUID>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,UUID>,TableCell<ICFBamUuidDefObj,UUID>>() {
			@Override public TableCell<ICFBamUuidDefObj,UUID> call(
				TableColumn<ICFBamUuidDefObj,UUID> arg)
			{
				return new CFUuidTableCell<ICFBamUuidDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamUuidDefObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamUuidDefObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamUuidDefObj, ICFBamSchemaDefObj> p ) {
				ICFBamUuidDefObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamUuidDefObj,ICFBamSchemaDefObj>,TableCell<ICFBamUuidDefObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamUuidDefObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamUuidDefObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamUuidDefObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamUuidDefObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamUuidDefObj> observable,
					ICFBamUuidDefObj oldValue,
					ICFBamUuidDefObj newValue )
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
					invokeWhenChosen.choseUuidDef( null );
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
					ICFBamUuidDefObj selectedInstance = getJavaFXFocusAsUuidDef();
					invokeWhenChosen.choseUuidDef( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamUuidDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamUuidDefObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamUuidDefObj getJavaFXFocusAsUuidDef() {
		return( (ICFBamUuidDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsUuidDef( ICFBamUuidDefObj value ) {
		setJavaFXFocus( value );
	}

	public class UuidDefByQualNameComparator
	implements Comparator<ICFBamUuidDefObj>
	{
		public UuidDefByQualNameComparator() {
		}

		public int compare( ICFBamUuidDefObj lhs, ICFBamUuidDefObj rhs ) {
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

	protected UuidDefByQualNameComparator compareUuidDefByQualName = new UuidDefByQualNameComparator();

	public Collection<ICFBamUuidDefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamUuidDefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfUuidDef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamUuidDefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfUuidDef.add( iter.next() );
				}
				observableListOfUuidDef.sort( compareUuidDefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfUuidDef );
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
		ICFBamUuidDefObj selectedObj = getJavaFXFocusAsUuidDef();
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

