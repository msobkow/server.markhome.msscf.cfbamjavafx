// Description: Java 11 JavaFX Picker of Obj Pane implementation for IndexCol.

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
 *	CFBamJavaFXIndexColPickerPane JavaFX Pick Obj Pane implementation
 *	for IndexCol.
 */
public class CFBamJavaFXIndexColPickerPane
extends CFBorderPane
implements ICFBamJavaFXIndexColPaneList
{
	public static String S_FormName = "Choose IndexCol";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamIndexColObj> javafxDataCollection = null;
	protected ObservableList<ICFBamIndexColObj> observableListOfIndexCol = null;
	protected TableColumn<ICFBamIndexColObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamIndexColObj, String> tableColumnName = null;
	protected TableColumn<ICFBamIndexColObj, String> tableColumnShortName = null;
	protected TableColumn<ICFBamIndexColObj, String> tableColumnLabel = null;
	protected TableColumn<ICFBamIndexColObj, String> tableColumnShortDescription = null;
	protected TableColumn<ICFBamIndexColObj, String> tableColumnDescription = null;
	protected TableColumn<ICFBamIndexColObj, Boolean> tableColumnIsAscending = null;
	protected TableColumn<ICFBamIndexColObj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableColumn<ICFBamIndexColObj, ICFBamValueObj> tableColumnLookupColumn = null;
	protected TableView<ICFBamIndexColObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXIndexColChosen invokeWhenChosen = null;
	protected ICFBamIndexObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXIndexColPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamIndexColObj argFocus,
		ICFBamIndexObj argContainer,
		Collection<ICFBamIndexColObj> argDataCollection,
		ICFBamJavaFXIndexColChosen whenChosen )
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
		dataTable = new TableView<ICFBamIndexColObj>();
		tableColumnId = new TableColumn<ICFBamIndexColObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamIndexColObj, Long> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,Long>,TableCell<ICFBamIndexColObj,Long>>() {
			@Override public TableCell<ICFBamIndexColObj,Long> call(
				TableColumn<ICFBamIndexColObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamIndexColObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamIndexColObj, String> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,String>,TableCell<ICFBamIndexColObj,String>>() {
			@Override public TableCell<ICFBamIndexColObj,String> call(
				TableColumn<ICFBamIndexColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnShortName = new TableColumn<ICFBamIndexColObj,String>( "Short Name" );
		tableColumnShortName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamIndexColObj, String> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnShortName.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,String>,TableCell<ICFBamIndexColObj,String>>() {
			@Override public TableCell<ICFBamIndexColObj,String> call(
				TableColumn<ICFBamIndexColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortName );
		tableColumnLabel = new TableColumn<ICFBamIndexColObj,String>( "Label" );
		tableColumnLabel.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamIndexColObj, String> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnLabel.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,String>,TableCell<ICFBamIndexColObj,String>>() {
			@Override public TableCell<ICFBamIndexColObj,String> call(
				TableColumn<ICFBamIndexColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLabel );
		tableColumnShortDescription = new TableColumn<ICFBamIndexColObj,String>( "Short Description" );
		tableColumnShortDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamIndexColObj, String> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnShortDescription.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,String>,TableCell<ICFBamIndexColObj,String>>() {
			@Override public TableCell<ICFBamIndexColObj,String> call(
				TableColumn<ICFBamIndexColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnShortDescription );
		tableColumnDescription = new TableColumn<ICFBamIndexColObj,String>( "Description" );
		tableColumnDescription.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamIndexColObj, String> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnDescription.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,String>,TableCell<ICFBamIndexColObj,String>>() {
			@Override public TableCell<ICFBamIndexColObj,String> call(
				TableColumn<ICFBamIndexColObj,String> arg)
			{
				return new CFStringTableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnDescription );
		tableColumnIsAscending = new TableColumn<ICFBamIndexColObj,Boolean>( "IsAscending" );
		tableColumnIsAscending.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,Boolean>,ObservableValue<Boolean> >() {
			public ObservableValue<Boolean> call( CellDataFeatures<ICFBamIndexColObj, Boolean> p ) {
				ICFBamIndexColObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					boolean value = obj.getRequiredIsAscending();
					Boolean wrapped = Boolean.valueOf( value );
					ReadOnlyObjectWrapper<Boolean> observable = new ReadOnlyObjectWrapper<Boolean>();
					observable.setValue( wrapped );
					return( observable );
				}
			}
		});
		tableColumnIsAscending.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,Boolean>,TableCell<ICFBamIndexColObj,Boolean>>() {
			@Override public TableCell<ICFBamIndexColObj,Boolean> call(
				TableColumn<ICFBamIndexColObj,Boolean> arg)
			{
				return new CFBoolTableCell<ICFBamIndexColObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIsAscending );
		tableColumnLookupDefSchema = new TableColumn<ICFBamIndexColObj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamIndexColObj, ICFBamSchemaDefObj> p ) {
				ICFBamIndexColObj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,ICFBamSchemaDefObj>,TableCell<ICFBamIndexColObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamIndexColObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamIndexColObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamIndexColObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		tableColumnLookupColumn = new TableColumn<ICFBamIndexColObj, ICFBamValueObj>( "Column" );
		tableColumnLookupColumn.setCellValueFactory( new Callback<CellDataFeatures<ICFBamIndexColObj,ICFBamValueObj>,ObservableValue<ICFBamValueObj> >() {
			public ObservableValue<ICFBamValueObj> call( CellDataFeatures<ICFBamIndexColObj, ICFBamValueObj> p ) {
				ICFBamIndexColObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamValueObj ref = obj.getRequiredLookupColumn();
					ReadOnlyObjectWrapper<ICFBamValueObj> observable = new ReadOnlyObjectWrapper<ICFBamValueObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupColumn.setCellFactory( new Callback<TableColumn<ICFBamIndexColObj,ICFBamValueObj>,TableCell<ICFBamIndexColObj,ICFBamValueObj>>() {
			@Override public TableCell<ICFBamIndexColObj,ICFBamValueObj> call(
				TableColumn<ICFBamIndexColObj,ICFBamValueObj> arg)
			{
				return new CFReferenceTableCell<ICFBamIndexColObj,ICFBamValueObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupColumn );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamIndexColObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamIndexColObj> observable,
					ICFBamIndexColObj oldValue,
					ICFBamIndexColObj newValue )
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
					invokeWhenChosen.choseIndexCol( null );
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
					ICFBamIndexColObj selectedInstance = getJavaFXFocusAsIndexCol();
					invokeWhenChosen.choseIndexCol( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamIndexColObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamIndexColObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamIndexColObj getJavaFXFocusAsIndexCol() {
		return( (ICFBamIndexColObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsIndexCol( ICFBamIndexColObj value ) {
		setJavaFXFocus( value );
	}

	public class IndexColByQualNameComparator
	implements Comparator<ICFBamIndexColObj>
	{
		public IndexColByQualNameComparator() {
		}

		public int compare( ICFBamIndexColObj lhs, ICFBamIndexColObj rhs ) {
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

	protected IndexColByQualNameComparator compareIndexColByQualName = new IndexColByQualNameComparator();

	public Collection<ICFBamIndexColObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamIndexColObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfIndexCol = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamIndexColObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfIndexCol.add( iter.next() );
				}
				observableListOfIndexCol.sort( compareIndexColByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfIndexCol );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamIndexObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamIndexObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamIndexColObj selectedObj = getJavaFXFocusAsIndexCol();
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

