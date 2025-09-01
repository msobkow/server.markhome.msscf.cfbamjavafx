// Description: Java 11 JavaFX Picker of Obj Pane implementation for PopSubDep1.

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
 *	CFBamJavaFXPopSubDep1PickerPane JavaFX Pick Obj Pane implementation
 *	for PopSubDep1.
 */
public class CFBamJavaFXPopSubDep1PickerPane
extends CFBorderPane
implements ICFBamJavaFXPopSubDep1PaneList
{
	public static String S_FormName = "Choose PopSubDep1";
	protected ICFBamJavaFXSchema javafxSchema = null;
	protected Collection<ICFBamPopSubDep1Obj> javafxDataCollection = null;
	protected ObservableList<ICFBamPopSubDep1Obj> observableListOfPopSubDep1 = null;
	protected TableColumn<ICFBamPopSubDep1Obj, Long> tableColumnId = null;
	protected TableColumn<ICFBamPopSubDep1Obj, String> tableColumnName = null;
	protected TableColumn<ICFBamPopSubDep1Obj, ICFBamRelationObj> tableColumnLookupRelation = null;
	protected TableColumn<ICFBamPopSubDep1Obj, ICFBamSchemaDefObj> tableColumnLookupDefSchema = null;
	protected TableView<ICFBamPopSubDep1Obj> dataTable = null;
	protected CFHBox hboxMenu = null;
	public final String S_ColumnNames[] = { "Name" };
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXPopSubDep1Chosen invokeWhenChosen = null;
	protected ICFBamPopTopDepObj javafxContainer = null;
	protected CFButton buttonCancel = null;
	protected CFButton buttonChooseNone = null;
	protected CFButton buttonChooseSelected = null;
	protected ScrollPane scrollMenu = null;
	public CFBamJavaFXPopSubDep1PickerPane( ICFFormManager formManager,
		ICFBamJavaFXSchema argSchema,
		ICFBamPopSubDep1Obj argFocus,
		ICFBamPopTopDepObj argContainer,
		Collection<ICFBamPopSubDep1Obj> argDataCollection,
		ICFBamJavaFXPopSubDep1Chosen whenChosen )
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
		dataTable = new TableView<ICFBamPopSubDep1Obj>();
		tableColumnId = new TableColumn<ICFBamPopSubDep1Obj,Long>( "Id" );
		tableColumnId.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopSubDep1Obj,Long>,ObservableValue<Long> >() {
			public ObservableValue<Long> call( CellDataFeatures<ICFBamPopSubDep1Obj, Long> p ) {
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
		tableColumnId.setCellFactory( new Callback<TableColumn<ICFBamPopSubDep1Obj,Long>,TableCell<ICFBamPopSubDep1Obj,Long>>() {
			@Override public TableCell<ICFBamPopSubDep1Obj,Long> call(
				TableColumn<ICFBamPopSubDep1Obj,Long> arg)
			{
				return new CFInt64TableCell<ICFBamPopSubDep1Obj>();
			}
		});
		dataTable.getColumns().add( tableColumnId );
		tableColumnName = new TableColumn<ICFBamPopSubDep1Obj,String>( "Name" );
		tableColumnName.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopSubDep1Obj,String>,ObservableValue<String> >() {
			public ObservableValue<String> call( CellDataFeatures<ICFBamPopSubDep1Obj, String> p ) {
				ICFBamPopSubDep1Obj obj = p.getValue();
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
		tableColumnName.setCellFactory( new Callback<TableColumn<ICFBamPopSubDep1Obj,String>,TableCell<ICFBamPopSubDep1Obj,String>>() {
			@Override public TableCell<ICFBamPopSubDep1Obj,String> call(
				TableColumn<ICFBamPopSubDep1Obj,String> arg)
			{
				return new CFStringTableCell<ICFBamPopSubDep1Obj>();
			}
		});
		dataTable.getColumns().add( tableColumnName );
		tableColumnLookupRelation = new TableColumn<ICFBamPopSubDep1Obj, ICFBamRelationObj>( "Relation" );
		tableColumnLookupRelation.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopSubDep1Obj,ICFBamRelationObj>,ObservableValue<ICFBamRelationObj> >() {
			public ObservableValue<ICFBamRelationObj> call( CellDataFeatures<ICFBamPopSubDep1Obj, ICFBamRelationObj> p ) {
				ICFBamPopSubDep1Obj obj = p.getValue();
				if( obj == null ) {
					return( null );
				}
				else {
					ICFBamRelationObj ref = obj.getRequiredLookupRelation();
					ReadOnlyObjectWrapper<ICFBamRelationObj> observable = new ReadOnlyObjectWrapper<ICFBamRelationObj>();
					observable.setValue( ref );
					return( observable );
				}
			}
		});
		tableColumnLookupRelation.setCellFactory( new Callback<TableColumn<ICFBamPopSubDep1Obj,ICFBamRelationObj>,TableCell<ICFBamPopSubDep1Obj,ICFBamRelationObj>>() {
			@Override public TableCell<ICFBamPopSubDep1Obj,ICFBamRelationObj> call(
				TableColumn<ICFBamPopSubDep1Obj,ICFBamRelationObj> arg)
			{
				return new CFReferenceTableCell<ICFBamPopSubDep1Obj,ICFBamRelationObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupRelation );
		tableColumnLookupDefSchema = new TableColumn<ICFBamPopSubDep1Obj, ICFBamSchemaDefObj>( "Defining Schema Definition" );
		tableColumnLookupDefSchema.setCellValueFactory( new Callback<CellDataFeatures<ICFBamPopSubDep1Obj,ICFBamSchemaDefObj>,ObservableValue<ICFBamSchemaDefObj> >() {
			public ObservableValue<ICFBamSchemaDefObj> call( CellDataFeatures<ICFBamPopSubDep1Obj, ICFBamSchemaDefObj> p ) {
				ICFBamPopSubDep1Obj obj = p.getValue();
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
		tableColumnLookupDefSchema.setCellFactory( new Callback<TableColumn<ICFBamPopSubDep1Obj,ICFBamSchemaDefObj>,TableCell<ICFBamPopSubDep1Obj,ICFBamSchemaDefObj>>() {
			@Override public TableCell<ICFBamPopSubDep1Obj,ICFBamSchemaDefObj> call(
				TableColumn<ICFBamPopSubDep1Obj,ICFBamSchemaDefObj> arg)
			{
				return new CFReferenceTableCell<ICFBamPopSubDep1Obj,ICFBamSchemaDefObj>();
			}
		});
		dataTable.getColumns().add( tableColumnLookupDefSchema );
		dataTable.getSelectionModel().selectedItemProperty().addListener(
			new ChangeListener<ICFBamPopSubDep1Obj>() {
				@Override public void changed( ObservableValue<? extends ICFBamPopSubDep1Obj> observable,
					ICFBamPopSubDep1Obj oldValue,
					ICFBamPopSubDep1Obj newValue )
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
					invokeWhenChosen.chosePopSubDep1( null );
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
					ICFBamPopSubDep1Obj selectedInstance = getJavaFXFocusAsPopSubDep1();
					invokeWhenChosen.chosePopSubDep1( selectedInstance );
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
		if( ( value == null ) || ( value instanceof ICFBamPopSubDep1Obj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamPopSubDep1Obj" );
		}
		if( dataTable == null ) {
			return;
		}
	}

	public ICFBamPopSubDep1Obj getJavaFXFocusAsPopSubDep1() {
		return( (ICFBamPopSubDep1Obj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsPopSubDep1( ICFBamPopSubDep1Obj value ) {
		setJavaFXFocus( value );
	}

	public class PopSubDep1ByQualNameComparator
	implements Comparator<ICFBamPopSubDep1Obj>
	{
		public PopSubDep1ByQualNameComparator() {
		}

		public int compare( ICFBamPopSubDep1Obj lhs, ICFBamPopSubDep1Obj rhs ) {
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

	protected PopSubDep1ByQualNameComparator comparePopSubDep1ByQualName = new PopSubDep1ByQualNameComparator();

	public Collection<ICFBamPopSubDep1Obj> getJavaFXDataCollection() {
		return( javafxDataCollection );
	}

	public void setJavaFXDataCollection( Collection<ICFBamPopSubDep1Obj> value ) {
		final String S_ProcName = "setJavaFXDataCollection";
		javafxDataCollection = value;
		observableListOfPopSubDep1 = FXCollections.observableArrayList();
		if( javafxDataCollection != null ) {
				Iterator<ICFBamPopSubDep1Obj> iter = javafxDataCollection.iterator();
				while( iter.hasNext() ) {
					observableListOfPopSubDep1.add( iter.next() );
				}
				observableListOfPopSubDep1.sort( comparePopSubDep1ByQualName );
		}
		if( dataTable != null ) {
			dataTable.setItems( observableListOfPopSubDep1 );
			// Hack from stackoverflow to fix JavaFX TableView refresh issue
			((TableColumn)dataTable.getColumns().get(0)).setVisible( false );
			((TableColumn)dataTable.getColumns().get(0)).setVisible( true );
		}
	}

	public ICFBamPopTopDepObj getJavaFXContainer() {
		return( javafxContainer );
	}

	public void setJavaFXContainer( ICFBamPopTopDepObj value ) {
		javafxContainer = value;
	}

	public void adjustListButtons() {
		boolean enableState;
		ICFBamPopSubDep1Obj selectedObj = getJavaFXFocusAsPopSubDep1();
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

