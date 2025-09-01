// Description: Java 11 JavaFX Picker of Obj Pane implementation for SchemaRef.

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
 *	CFBamJavaFXSchemaRefPickerPane JavaFX Pick Obj Pane implementation
 *	for SchemaRef.
 */
public class CFBamJavaFXSchemaRefPickerPane
extends CFBorderPane
implements ICFBamJavaFXSchemaRefPaneList
{
	public static String S_FormName = "Choose SchemaRef";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamSchemaRefObj> javafxDataCollection = null;
	protected ObservableList<ICFBamSchemaRefObj> observableListOfSchemaRef = null;
	protected TableColumn<ICFBamSchemaRefObj, Long> tableColumnId = null;
	protected TableColumn<ICFBamSchemaRefObj, String> tableColumnName = null;
	protected TableColumn<ICFBamSchemaRefObj, String> tableColumnRefModelName = null;
	protected TableColumn<ICFBamSchemaRefObj, String> tableColumnIncludeRoot = null;
	protected TableColumn<ICFBamSchemaRefObj, ICFBamSchemaDefObj> tableColumnLookupRefSchema = null;
	protected TableView<ICFBamSchemaRefObj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchemaRefChosen invokeWhenChosen = null;
	protected ICFBamSchemaDefObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXSchemaRefPickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamSchemaRefObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamSchemaRefObj> argDataCollection,
		ICFBamJavaFXSchemaRefChosen whenChosen )
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
		dataTable = new TableView<ICFBamSchemaRefObj>();
		tableColumnId = new TableColumn<ICFBamSchemaRefObj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamSchemaRefObj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamSchemaRefObj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamSchemaRefObj,Long>,TableCell<ICFBamSchemaRefObj,Long>>() {
			@Override public TableCell<ICFBamSchemaRefObj,Long> call(
				TableColumn<ICFBamSchemaRefObj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamSchemaRefObj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamSchemaRefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamSchemaRefObj, String> p ) {
				ICFBamSchemaRefObj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamSchemaRefObj,String>,TableCell<ICFBamSchemaRefObj,String>>() {
			@Override public TableCell<ICFBamSchemaRefObj,String> call(
				TableColumn<ICFBamSchemaRefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnRefModelName = new TableColumn<ICFBamSchemaRefObj,String>( "Ref. Model Name" );
		tableColumnRefModelName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamSchemaRefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamSchemaRefObj, String> p ) {
				ICFBamSchemaRefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredRefModelName();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnRefModelName.setCellFactory( new Callback<TableColumn<ICFBamSchemaRefObj,String>,TableCell<ICFBamSchemaRefObj,String>>() {
			@Override public TableCell<ICFBamSchemaRefObj,String> call(
				TableColumn<ICFBamSchemaRefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnRefModelName );
		tableColumnIncludeRoot = new TableColumn<ICFBamSchemaRefObj,String>( "Include Root" );
		tableColumnIncludeRoot.setCellValueFactory( new Callback<CellDataFeatures<ICFBamSchemaRefObj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamSchemaRefObj, String> p ) {
				ICFBamSchemaRefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					String value = obj.getRequiredIncludeRoot();
					ReadOnlyObjectWrapper<String> observable = new ReadOnlyObjectWrapper<String>();
					observable.setValue( value );
					return( observable );
				}
			}
		});
		tableColumnIncludeRoot.setCellFactory( new Callback<TableColumn<ICFBamSchemaRefObj,String>,TableCell<ICFBamSchemaRefObj,String>>() {
			@Override public TableCell<ICFBamSchemaRefObj,String> call(
				TableColumn<ICFBamSchemaRefObj,String> arg)
			{
				return new CFStringTableCell<ICFBamSchemaRefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnIncludeRoot );
		tableColumnLookupRefSchema = new TableColumn<ICFBamSchemaRefObj, ICFBamSchemaDefObj>( "Referenced Schema" );
		tableColumnLookupRefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamSchemaRefObj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamSchemaRefObj, ICFBamSchemaDefObj> p ) {
				ICFBamSchemaRefObj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamSchemaDefObj ref = obj.getOptionalLookupRefSchema();
					ReadOnlyObjectWrapper<ICFBamSchemaDefObj> observable = new ReadOnlyObjectWrapper<ICFBamSchemaDefObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRefSchema.setCellFactory( new Callback<TableColumn<ICFBamSchemaRefObj,ICFBamSchemaDefObj>,TableCell<ICFBamSchemaRefObj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamSchemaRefObj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamSchemaRefObj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamSchemaRefObj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamSchemaRefObj>() {
				@Override public void changed( ObservableValue<? extends ICFBamSchemaRefObj> observable,
					ICFBamSchemaRefObj oldValue,
					ICFBamSchemaRefObj newValue )
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
					invokeWhenChosen.choseSchemaRef( null );
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
					ICFBamSchemaRefObj selectedInstance = getJavaFXFocusAsSchemaRef();
					invokeWhenChosen.choseSchemaRef( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamSchemaRefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamSchemaRefObj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamSchemaRefObj getJavaFXFocusAsSchemaRef() {
		return( (ICFBamSchemaRefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaRef( ICFBamSchemaRefObj value ) {
		setJavaFXFocus( value );
	}

	public class SchemaRefByQualNameComparator
	implements Comparator<ICFBamSchemaRefObj>
	{
		public SchemaRefByQualNameComparator() {
		}

		public int compare( ICFBamSchemaRefObj lhs, ICFBamSchemaRefObj rhs ) {
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

	protected SchemaRefByQualNameComparator compareSchemaRefByQualName = new SchemaRefByQualNameComparator();

	public Collection<ICFBamSchemaRefObj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamSchemaRefObj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfSchemaRef = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamSchemaRefObj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfSchemaRef.add( iter.next() );
				}
				observableListOfSchemaRef.sort( compareSchemaRefByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfSchemaRef );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamSchemaDefObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamSchemaDefObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamSchemaRefObj selectedObj = getJavaFXFocusAsSchemaRef();
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

