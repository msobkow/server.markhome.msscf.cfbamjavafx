// Description: Java 11 JavaFX Picker of Obj Pane implementation for FloatCol.

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
 *	CFBamJavaFXFloatColPickerPane JavaFX Pick Obj Pane implementation
 *	for FloatCol.
 */
public class CFBamJavaFXFloatColPickerPane
extends CFBorderPane
implements ICFBamJavaFXFloatColPaneList
{
	public static String S_FormName = "Choose FloatCol";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamFloatColObj> javafxDataCollection = null;
	protected ObservableList<ICFBamFloatColObj> observableListOfFloatCol = null;
	protected TableColumn<ICFBamFloatColObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnName = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnDefaultXmlValue = null;
	protected TableColumn<ICFBamFloatColObj, Boolean> tableColumnIsNullable = null;
	protected TableColumn<ICFBamFloatColObj, Boolean> tableColumnGenerateId = null;
	protected TableColumn<ICFBamFloatColObj, Boolean> tableColumnImplementsPolymorph = null;
	protected TableColumn<ICFBamFloatColObj, String> tableColumnDbName = null;
	protected TableColumn<ICFBamFloatColObj, Float> tableColumnInitValue = null;
	protected TableColumn<ICFBamFloatColObj, Float> tableColumnMinValue = null;
	protected TableColumn<ICFBamFloatColObj, Float> tableColumnMaxValue = null;
	protected TableColumn<ICFBamFloatColObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<ICFBamFloatColObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXFloatColChosen invokeWhenChosen = null;
	protected ICFBamTableObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXFloatColPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamFloatColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamFloatColObj> argDataCollection,
		ICFBamJavaFXFloatColChosen whenChosen )
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
		dataTable = new TableView<ICFBamFloatColObj>();
		tableColumnId = new TableColumn<ICFBamFloatColObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamFloatColObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Long>,TableCell<ICFBamFloatColObj,Long>>() {
			@Override public TableCell<ICFBamFloatColObj,Long> call(
				TableColumn<ICFBamFloatColObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamFloatColObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamFloatColObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamFloatColObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamFloatColObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamFloatColObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnDefaultXmlValue = new TableColumn<ICFBamFloatColObj,String>( "DefaultXmlValue" );
		tableColumnDefaultXmlValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnDefaultXmlValue.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDefaultXmlValue );
		tableColumnIsNullable = new TableColumn<ICFBamFloatColObj,Boolean>( "Is Nullable" );
		tableColumnIsNullable.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamFloatColObj, Boolean> p ) {
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
		tableColumnIsNullable.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Boolean>,TableCell<ICFBamFloatColObj,Boolean>>() {
			@Override public TableCell<ICFBamFloatColObj,Boolean> call(
				TableColumn<ICFBamFloatColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsNullable );
		tableColumnGenerateId = new TableColumn<ICFBamFloatColObj,Boolean>( "Generate Id" );
		tableColumnGenerateId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamFloatColObj, Boolean> p ) {
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
		tableColumnGenerateId.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Boolean>,TableCell<ICFBamFloatColObj,Boolean>>() {
			@Override public TableCell<ICFBamFloatColObj,Boolean> call(
				TableColumn<ICFBamFloatColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnGenerateId );
		tableColumnImplementsPolymorph = new TableColumn<ICFBamFloatColObj,Boolean>( "ImplementsPolymorph" );
		tableColumnImplementsPolymorph.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamFloatColObj, Boolean> p ) {
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
		tableColumnImplementsPolymorph.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Boolean>,TableCell<ICFBamFloatColObj,Boolean>>() {
			@Override public TableCell<ICFBamFloatColObj,Boolean> call(
				TableColumn<ICFBamFloatColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnImplementsPolymorph );
		tableColumnDbName = new TableColumn<ICFBamFloatColObj,String>( "Db Name" );
		tableColumnDbName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamFloatColObj, String> p ) {
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
		tableColumnDbName.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,String>,TableCell<ICFBamFloatColObj,String>>() {
			@Override public TableCell<ICFBamFloatColObj,String> call(
				TableColumn<ICFBamFloatColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDbName );
		tableColumnInitValue = new TableColumn<ICFBamFloatColObj,Float>( "Init. Value" );
		tableColumnInitValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<ICFBamFloatColObj, Float> p ) {
				ICFBamFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalInitValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnInitValue.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Float>,TableCell<ICFBamFloatColObj,Float>>() {
			@Override public TableCell<ICFBamFloatColObj,Float> call(
				TableColumn<ICFBamFloatColObj,Float> arg)
			{
				return new CFFloatTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnInitValue );
		tableColumnMinValue = new TableColumn<ICFBamFloatColObj,Float>( "Min. Value" );
		tableColumnMinValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<ICFBamFloatColObj, Float> p ) {
				ICFBamFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalMinValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMinValue.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Float>,TableCell<ICFBamFloatColObj,Float>>() {
			@Override public TableCell<ICFBamFloatColObj,Float> call(
				TableColumn<ICFBamFloatColObj,Float> arg)
			{
				return new CFFloatTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMinValue );
		tableColumnMaxValue = new TableColumn<ICFBamFloatColObj,Float>( "Max. Value" );
		tableColumnMaxValue.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,Float>,ObservableValue<Float> >() {
			public ObservableValue<Float> call( CellDataFeatures<ICFBamFloatColObj, Float> p ) {
				ICFBamFloatDefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					Float value = obj.getOptionalMaxValue();
					ReadOnlyObjectWrapper<Float> observable = new ReadOnlyObjectWrapper<Float>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnMaxValue.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,Float>,TableCell<ICFBamFloatColObj,Float>>() {
			@Override public TableCell<ICFBamFloatColObj,Float> call(
				TableColumn<ICFBamFloatColObj,Float> arg)
			{
				return new CFFloatTableCell<ICFBamFloatColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnMaxValue );
		tableColumnLookupDefSchema = new TableColumn<ICFBamFloatColObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamFloatColObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamFloatColObj, ICFBamSchemaDefObj> p ) {
				ICFBamFloatColObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamFloatColObj,ICFBamSchemaDefObj>,TableCell<ICFBamFloatColObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamFloatColObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamFloatColObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamFloatColObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamFloatColObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamFloatColObj> observable,
					ICFBamFloatColObj oldValue,
					ICFBamFloatColObj newValue )
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
					invokeWhenChosen.choseFloatCol( null );
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
					ICFBamFloatColObj selectedInstance = getJavaFXFocusAsFloatCol();
					invokeWhenChosen.choseFloatCol( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamFloatColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamFloatColObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamFloatColObj getJavaFXFocusAsFloatCol() {
		return( (ICFBamFloatColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsFloatCol( ICFBamFloatColObj value ) {
		setJavaFXFocus( value );
	}

	public class FloatColByQualNameComparator
	implements Comparator<ICFBamFloatColObj>
	{
		public FloatColByQualNameComparator() {
		}

		public int compare( ICFBamFloatColObj lhs, ICFBamFloatColObj rhs ) {
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

	protected FloatColByQualNameComparator compareFloatColByQualName = new FloatColByQualNameComparator();

	public Collection<ICFBamFloatColObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamFloatColObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfFloatCol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamFloatColObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfFloatCol.add( iter.next() );
				}
				observableListOfFloatCol.sort( compareFloatColByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfFloatCol );
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
		ICFBamFloatColObj selectedObj = getJavaFXFocusAsFloatCol();
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

