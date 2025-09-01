// Description: Java 11 JavaFX Attribute Pane implementation for SchemaDef.

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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Priority;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.CFReferenceEditor.ICFReferenceCallback;
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
 *	CFBamJavaFXSchemaDefAttrPane JavaFX Attribute Pane implementation
 *	for SchemaDef.
 */
public class CFBamJavaFXSchemaDefAttrPane
extends CFGridPane
implements ICFBamJavaFXSchemaDefPaneCommon
{
	protected ICFFormManager cfFormManager = null;
	protected ICFBamJavaFXSchema javafxSchema = null;
	boolean javafxIsInitializing = true;

	protected class IdCFLabel
		extends CFLabel
	{
		public IdCFLabel() {
			super();
			setText( "Id" );
		}
	}

	protected class IdEditor
		extends CFInt64Editor
	{
		public IdEditor() {
			super();
			setMinValue( CFBamScopeBuff.ID_MIN_VALUE );
			setFieldName( "Id" );
		}
	}

	protected class NameCFLabel
		extends CFLabel
	{
		public NameCFLabel() {
			super();
			setText( "Name" );
		}
	}

	protected class NameEditor
		extends CFStringEditor
	{
		public NameEditor() {
			super();
			setMaxLen( 192 );
			setFieldName( "Name" );
		}
	}

	protected class DbNameCFLabel
		extends CFLabel
	{
		public DbNameCFLabel() {
			super();
			setText( "Db Name" );
		}
	}

	protected class DbNameEditor
		extends CFStringEditor
	{
		public DbNameEditor() {
			super();
			setMaxLen( 12 );
			setFieldName( "Db Name" );
		}
	}

	protected class ShortNameCFLabel
		extends CFLabel
	{
		public ShortNameCFLabel() {
			super();
			setText( "Short Name" );
		}
	}

	protected class ShortNameEditor
		extends CFStringEditor
	{
		public ShortNameEditor() {
			super();
			setMaxLen( 16 );
			setFieldName( "Short Name" );
		}
	}

	protected class LabelCFLabel
		extends CFLabel
	{
		public LabelCFLabel() {
			super();
			setText( "Label" );
		}
	}

	protected class LabelEditor
		extends CFStringEditor
	{
		public LabelEditor() {
			super();
			setMaxLen( 64 );
			setFieldName( "Label" );
		}
	}

	protected class ShortDescriptionCFLabel
		extends CFLabel
	{
		public ShortDescriptionCFLabel() {
			super();
			setText( "Short Description" );
		}
	}

	protected class ShortDescriptionEditor
		extends CFStringEditor
	{
		public ShortDescriptionEditor() {
			super();
			setMaxLen( 128 );
			setFieldName( "Short Description" );
		}
	}

	protected class DescriptionCFLabel
		extends CFLabel
	{
		public DescriptionCFLabel() {
			super();
			setText( "Description" );
		}
	}

	protected class DescriptionEditor
		extends CFStringEditor
	{
		public DescriptionEditor() {
			super();
			setMaxLen( 1023 );
			setFieldName( "Description" );
		}
	}

	protected class PublicLicenseNameCFLabel
		extends CFLabel
	{
		public PublicLicenseNameCFLabel() {
			super();
			setText( "PublicLicenseName" );
		}
	}

	protected class PublicLicenseNameEditor
		extends CFStringEditor
	{
		public PublicLicenseNameEditor() {
			super();
			setMaxLen( 127 );
			setFieldName( "PublicLicenseName" );
		}
	}

	protected class PublicLicenseTextCFLabel
		extends CFLabel
	{
		public PublicLicenseTextCFLabel() {
			super();
			setText( "PublicLicenseText" );
		}
	}

	protected class PublicLicenseTextEditor
		extends CFTextEditor
	{
		public PublicLicenseTextEditor() {
			super();
			setMaxLen( 32767 );
			setFieldName( "PublicLicenseText" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class ImplementationLicenseNameCFLabel
		extends CFLabel
	{
		public ImplementationLicenseNameCFLabel() {
			super();
			setText( "ImplementationLicenseName" );
		}
	}

	protected class ImplementationLicenseNameEditor
		extends CFStringEditor
	{
		public ImplementationLicenseNameEditor() {
			super();
			setMaxLen( 127 );
			setFieldName( "ImplementationLicenseName" );
		}
	}

	protected class ImplementationLicenseTextCFLabel
		extends CFLabel
	{
		public ImplementationLicenseTextCFLabel() {
			super();
			setText( "ImplementationLicenseText" );
		}
	}

	protected class ImplementationLicenseTextEditor
		extends CFTextEditor
	{
		public ImplementationLicenseTextEditor() {
			super();
			setMaxLen( 32767 );
			setFieldName( "ImplementationLicenseText" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CopyrightPeriodCFLabel
		extends CFLabel
	{
		public CopyrightPeriodCFLabel() {
			super();
			setText( "Copyright Period" );
		}
	}

	protected class CopyrightPeriodEditor
		extends CFStringEditor
	{
		public CopyrightPeriodEditor() {
			super();
			setMaxLen( 10 );
			setFieldName( "Copyright Period" );
		}
	}

	protected class CopyrightHolderCFLabel
		extends CFLabel
	{
		public CopyrightHolderCFLabel() {
			super();
			setText( "Copyright Holder" );
		}
	}

	protected class CopyrightHolderEditor
		extends CFStringEditor
	{
		public CopyrightHolderEditor() {
			super();
			setMaxLen( 511 );
			setFieldName( "Copyright Holder" );
		}
	}

	protected class AuthorEMailCFLabel
		extends CFLabel
	{
		public AuthorEMailCFLabel() {
			super();
			setText( "Author EMail" );
		}
	}

	protected class AuthorEMailEditor
		extends CFStringEditor
	{
		public AuthorEMailEditor() {
			super();
			setMaxLen( 512 );
			setFieldName( "Author EMail" );
		}
	}

	protected class ProjectURLCFLabel
		extends CFLabel
	{
		public ProjectURLCFLabel() {
			super();
			setText( "Project URL" );
		}
	}

	protected class ProjectURLEditor
		extends CFStringEditor
	{
		public ProjectURLEditor() {
			super();
			setMaxLen( 1024 );
			setFieldName( "Project URL" );
		}
	}

	protected class PublishURICFLabel
		extends CFLabel
	{
		public PublishURICFLabel() {
			super();
			setText( "Publish URI" );
		}
	}

	protected class PublishURIEditor
		extends CFStringEditor
	{
		public PublishURIEditor() {
			super();
			setMaxLen( 512 );
			setFieldName( "Publish URI" );
		}
	}

	protected class JSchemaObjImportCFLabel
		extends CFLabel
	{
		public JSchemaObjImportCFLabel() {
			super();
			setText( "JSchemaObjImport" );
		}
	}

	protected class JSchemaObjImportEditor
		extends CFTextEditor
	{
		public JSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JSchemaObjInterfaceCFLabel
		extends CFLabel
	{
		public JSchemaObjInterfaceCFLabel() {
			super();
			setText( "JSchemaObjInterface" );
		}
	}

	protected class JSchemaObjInterfaceEditor
		extends CFTextEditor
	{
		public JSchemaObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSchemaObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JSchemaObjMembersCFLabel() {
			super();
			setText( "JSchemaObjMembers" );
		}
	}

	protected class JSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JSchemaObjImplementationCFLabel
		extends CFLabel
	{
		public JSchemaObjImplementationCFLabel() {
			super();
			setText( "JSchemaObjImplementation" );
		}
	}

	protected class JSchemaObjImplementationEditor
		extends CFTextEditor
	{
		public JSchemaObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JSchemaObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JDb2LUWSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JDb2LUWSchemaObjMembersCFLabel() {
			super();
			setText( "JDb2LUWSchemaObjMembers" );
		}
	}

	protected class JDb2LUWSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JDb2LUWSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JDb2LUWSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JDb2LUWSchemaObjImplCFLabel
		extends CFLabel
	{
		public JDb2LUWSchemaObjImplCFLabel() {
			super();
			setText( "JDb2LUWSchemaObjImpl" );
		}
	}

	protected class JDb2LUWSchemaObjImplEditor
		extends CFTextEditor
	{
		public JDb2LUWSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JDb2LUWSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JDb2LUWSchemaObjImportCFLabel
		extends CFLabel
	{
		public JDb2LUWSchemaObjImportCFLabel() {
			super();
			setText( "JDb2LUWSchemaObjImport" );
		}
	}

	protected class JDb2LUWSchemaObjImportEditor
		extends CFTextEditor
	{
		public JDb2LUWSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JDb2LUWSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMSSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JMSSqlSchemaObjMembersCFLabel() {
			super();
			setText( "JMSSqlSchemaObjMembers" );
		}
	}

	protected class JMSSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JMSSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMSSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMSSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public JMSSqlSchemaObjImplCFLabel() {
			super();
			setText( "JMSSqlSchemaObjImpl" );
		}
	}

	protected class JMSSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public JMSSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMSSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMSSqlSchemaObjImportCFLabel
		extends CFLabel
	{
		public JMSSqlSchemaObjImportCFLabel() {
			super();
			setText( "JMSSqlSchemaObjImport" );
		}
	}

	protected class JMSSqlSchemaObjImportEditor
		extends CFTextEditor
	{
		public JMSSqlSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMSSqlSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMySqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JMySqlSchemaObjMembersCFLabel() {
			super();
			setText( "JMySqlSchemaObjMembers" );
		}
	}

	protected class JMySqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JMySqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMySqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMySqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public JMySqlSchemaObjImplCFLabel() {
			super();
			setText( "JMySqlSchemaObjImpl" );
		}
	}

	protected class JMySqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public JMySqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMySqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JMySqlSchemaObjImportCFLabel
		extends CFLabel
	{
		public JMySqlSchemaObjImportCFLabel() {
			super();
			setText( "JMySqlSchemaObjImport" );
		}
	}

	protected class JMySqlSchemaObjImportEditor
		extends CFTextEditor
	{
		public JMySqlSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JMySqlSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JOracleSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JOracleSchemaObjMembersCFLabel() {
			super();
			setText( "JOracleSchemaObjMembers" );
		}
	}

	protected class JOracleSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JOracleSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JOracleSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JOracleSchemaObjImplCFLabel
		extends CFLabel
	{
		public JOracleSchemaObjImplCFLabel() {
			super();
			setText( "JOracleSchemaObjImpl" );
		}
	}

	protected class JOracleSchemaObjImplEditor
		extends CFTextEditor
	{
		public JOracleSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JOracleSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JOracleSchemaObjImportCFLabel
		extends CFLabel
	{
		public JOracleSchemaObjImportCFLabel() {
			super();
			setText( "JOracleSchemaObjImport" );
		}
	}

	protected class JOracleSchemaObjImportEditor
		extends CFTextEditor
	{
		public JOracleSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JOracleSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JPgSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JPgSqlSchemaObjMembersCFLabel() {
			super();
			setText( "JPgSqlSchemaObjMembers" );
		}
	}

	protected class JPgSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JPgSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JPgSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JPgSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public JPgSqlSchemaObjImplCFLabel() {
			super();
			setText( "JPgSqlSchemaObjImpl" );
		}
	}

	protected class JPgSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public JPgSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JPgSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JPgSqlSchemaObjImportCFLabel
		extends CFLabel
	{
		public JPgSqlSchemaObjImportCFLabel() {
			super();
			setText( "JPgSqlSchemaObjImport" );
		}
	}

	protected class JPgSqlSchemaObjImportEditor
		extends CFTextEditor
	{
		public JPgSqlSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JPgSqlSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JRamSchemaObjMembersCFLabel
		extends CFLabel
	{
		public JRamSchemaObjMembersCFLabel() {
			super();
			setText( "JRamSchemaObjMembers" );
		}
	}

	protected class JRamSchemaObjMembersEditor
		extends CFTextEditor
	{
		public JRamSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JRamSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JRamSchemaObjImplCFLabel
		extends CFLabel
	{
		public JRamSchemaObjImplCFLabel() {
			super();
			setText( "JRamSchemaObjImpl" );
		}
	}

	protected class JRamSchemaObjImplEditor
		extends CFTextEditor
	{
		public JRamSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JRamSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JRamSchemaObjImportCFLabel
		extends CFLabel
	{
		public JRamSchemaObjImportCFLabel() {
			super();
			setText( "JRamSchemaObjImport" );
		}
	}

	protected class JRamSchemaObjImportEditor
		extends CFTextEditor
	{
		public JRamSchemaObjImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JRamSchemaObjImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgSchemaImportCFLabel
		extends CFLabel
	{
		public JXMsgSchemaImportCFLabel() {
			super();
			setText( "JXMsgSchemaImport" );
		}
	}

	protected class JXMsgSchemaImportEditor
		extends CFTextEditor
	{
		public JXMsgSchemaImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgSchemaImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgSchemaFormattersCFLabel
		extends CFLabel
	{
		public JXMsgSchemaFormattersCFLabel() {
			super();
			setText( "JXMsgSchemaFormatters" );
		}
	}

	protected class JXMsgSchemaFormattersEditor
		extends CFTextEditor
	{
		public JXMsgSchemaFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgSchemaFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgClientSchemaImportCFLabel
		extends CFLabel
	{
		public JXMsgClientSchemaImportCFLabel() {
			super();
			setText( "JXMsgClientSchemaImport" );
		}
	}

	protected class JXMsgClientSchemaImportEditor
		extends CFTextEditor
	{
		public JXMsgClientSchemaImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgClientSchemaImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgClientSchemaBodyCFLabel
		extends CFLabel
	{
		public JXMsgClientSchemaBodyCFLabel() {
			super();
			setText( "JXMsgClientSchemaBody" );
		}
	}

	protected class JXMsgClientSchemaBodyEditor
		extends CFTextEditor
	{
		public JXMsgClientSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgClientSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstSchemaBodyCFLabel
		extends CFLabel
	{
		public JXMsgRqstSchemaBodyCFLabel() {
			super();
			setText( "JXMsgRqstSchemaBody" );
		}
	}

	protected class JXMsgRqstSchemaBodyEditor
		extends CFTextEditor
	{
		public JXMsgRqstSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstSchemaImportCFLabel
		extends CFLabel
	{
		public JXMsgRqstSchemaImportCFLabel() {
			super();
			setText( "JXMsgRqstSchemaImport" );
		}
	}

	protected class JXMsgRqstSchemaImportEditor
		extends CFTextEditor
	{
		public JXMsgRqstSchemaImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstSchemaImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstSchemaWireParsersCFLabel
		extends CFLabel
	{
		public JXMsgRqstSchemaWireParsersCFLabel() {
			super();
			setText( "JXMsgRqstSchemaWireParsers" );
		}
	}

	protected class JXMsgRqstSchemaWireParsersEditor
		extends CFTextEditor
	{
		public JXMsgRqstSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public JXMsgRqstSchemaXsdSpecCFLabel() {
			super();
			setText( "JXMsgRqstSchemaXsdSpec" );
		}
	}

	protected class JXMsgRqstSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public JXMsgRqstSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRqstSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public JXMsgRqstSchemaXsdElementListCFLabel() {
			super();
			setText( "JXMsgRqstSchemaXsdElementList" );
		}
	}

	protected class JXMsgRqstSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public JXMsgRqstSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRqstSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnSchemaBodyCFLabel
		extends CFLabel
	{
		public JXMsgRspnSchemaBodyCFLabel() {
			super();
			setText( "JXMsgRspnSchemaBody" );
		}
	}

	protected class JXMsgRspnSchemaBodyEditor
		extends CFTextEditor
	{
		public JXMsgRspnSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnSchemaImportCFLabel
		extends CFLabel
	{
		public JXMsgRspnSchemaImportCFLabel() {
			super();
			setText( "JXMsgRspnSchemaImport" );
		}
	}

	protected class JXMsgRspnSchemaImportEditor
		extends CFTextEditor
	{
		public JXMsgRspnSchemaImportEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnSchemaImport" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnSchemaWireParsersCFLabel
		extends CFLabel
	{
		public JXMsgRspnSchemaWireParsersCFLabel() {
			super();
			setText( "JXMsgRspnSchemaWireParsers" );
		}
	}

	protected class JXMsgRspnSchemaWireParsersEditor
		extends CFTextEditor
	{
		public JXMsgRspnSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public JXMsgRspnSchemaXsdElementListCFLabel() {
			super();
			setText( "JXMsgRspnSchemaXsdElementList" );
		}
	}

	protected class JXMsgRspnSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public JXMsgRspnSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class JXMsgRspnSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public JXMsgRspnSchemaXsdSpecCFLabel() {
			super();
			setText( "JXMsgRspnSchemaXsdSpec" );
		}
	}

	protected class JXMsgRspnSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public JXMsgRspnSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "JXMsgRspnSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppSchemaObjIncludeCFLabel() {
			super();
			setText( "CppSchemaObjInclude" );
		}
	}

	protected class CppSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSchemaObjInterfaceCFLabel
		extends CFLabel
	{
		public CppSchemaObjInterfaceCFLabel() {
			super();
			setText( "CppSchemaObjInterface" );
		}
	}

	protected class CppSchemaObjInterfaceEditor
		extends CFTextEditor
	{
		public CppSchemaObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSchemaObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppSchemaObjMembersCFLabel() {
			super();
			setText( "CppSchemaObjMembers" );
		}
	}

	protected class CppSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppSchemaObjImplementationCFLabel
		extends CFLabel
	{
		public CppSchemaObjImplementationCFLabel() {
			super();
			setText( "CppSchemaObjImplementation" );
		}
	}

	protected class CppSchemaObjImplementationEditor
		extends CFTextEditor
	{
		public CppSchemaObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppSchemaObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppDb2LUWSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppDb2LUWSchemaObjMembersCFLabel() {
			super();
			setText( "CppDb2LUWSchemaObjMembers" );
		}
	}

	protected class CppDb2LUWSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppDb2LUWSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppDb2LUWSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppDb2LUWSchemaObjImplCFLabel
		extends CFLabel
	{
		public CppDb2LUWSchemaObjImplCFLabel() {
			super();
			setText( "CppDb2LUWSchemaObjImpl" );
		}
	}

	protected class CppDb2LUWSchemaObjImplEditor
		extends CFTextEditor
	{
		public CppDb2LUWSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppDb2LUWSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppDb2LUWSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppDb2LUWSchemaObjIncludeCFLabel() {
			super();
			setText( "CppDb2LUWSchemaObjInclude" );
		}
	}

	protected class CppDb2LUWSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppDb2LUWSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppDb2LUWSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMSSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppMSSqlSchemaObjMembersCFLabel() {
			super();
			setText( "CppMSSqlSchemaObjMembers" );
		}
	}

	protected class CppMSSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppMSSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMSSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMSSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public CppMSSqlSchemaObjImplCFLabel() {
			super();
			setText( "CppMSSqlSchemaObjImpl" );
		}
	}

	protected class CppMSSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public CppMSSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMSSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMSSqlSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppMSSqlSchemaObjIncludeCFLabel() {
			super();
			setText( "CppMSSqlSchemaObjInclude" );
		}
	}

	protected class CppMSSqlSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppMSSqlSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMSSqlSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMySqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppMySqlSchemaObjMembersCFLabel() {
			super();
			setText( "CppMySqlSchemaObjMembers" );
		}
	}

	protected class CppMySqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppMySqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMySqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMySqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public CppMySqlSchemaObjImplCFLabel() {
			super();
			setText( "CppMySqlSchemaObjImpl" );
		}
	}

	protected class CppMySqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public CppMySqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMySqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppMySqlSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppMySqlSchemaObjIncludeCFLabel() {
			super();
			setText( "CppMySqlSchemaObjInclude" );
		}
	}

	protected class CppMySqlSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppMySqlSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppMySqlSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppOracleSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppOracleSchemaObjMembersCFLabel() {
			super();
			setText( "CppOracleSchemaObjMembers" );
		}
	}

	protected class CppOracleSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppOracleSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppOracleSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppOracleSchemaObjImplCFLabel
		extends CFLabel
	{
		public CppOracleSchemaObjImplCFLabel() {
			super();
			setText( "CppOracleSchemaObjImpl" );
		}
	}

	protected class CppOracleSchemaObjImplEditor
		extends CFTextEditor
	{
		public CppOracleSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppOracleSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppOracleSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppOracleSchemaObjIncludeCFLabel() {
			super();
			setText( "CppOracleSchemaObjInclude" );
		}
	}

	protected class CppOracleSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppOracleSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppOracleSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppPgSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppPgSqlSchemaObjMembersCFLabel() {
			super();
			setText( "CppPgSqlSchemaObjMembers" );
		}
	}

	protected class CppPgSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppPgSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppPgSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppPgSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public CppPgSqlSchemaObjImplCFLabel() {
			super();
			setText( "CppPgSqlSchemaObjImpl" );
		}
	}

	protected class CppPgSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public CppPgSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppPgSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppPgSqlSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppPgSqlSchemaObjIncludeCFLabel() {
			super();
			setText( "CppPgSqlSchemaObjInclude" );
		}
	}

	protected class CppPgSqlSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppPgSqlSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppPgSqlSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppRamSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CppRamSchemaObjMembersCFLabel() {
			super();
			setText( "CppRamSchemaObjMembers" );
		}
	}

	protected class CppRamSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CppRamSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppRamSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppRamSchemaObjImplCFLabel
		extends CFLabel
	{
		public CppRamSchemaObjImplCFLabel() {
			super();
			setText( "CppRamSchemaObjImpl" );
		}
	}

	protected class CppRamSchemaObjImplEditor
		extends CFTextEditor
	{
		public CppRamSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppRamSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppRamSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public CppRamSchemaObjIncludeCFLabel() {
			super();
			setText( "CppRamSchemaObjInclude" );
		}
	}

	protected class CppRamSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public CppRamSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppRamSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgSchemaIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgSchemaIncludeCFLabel() {
			super();
			setText( "CppXMsgSchemaInclude" );
		}
	}

	protected class CppXMsgSchemaIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgSchemaFormattersCFLabel
		extends CFLabel
	{
		public CppXMsgSchemaFormattersCFLabel() {
			super();
			setText( "CppXMsgSchemaFormatters" );
		}
	}

	protected class CppXMsgSchemaFormattersEditor
		extends CFTextEditor
	{
		public CppXMsgSchemaFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgSchemaFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgClientSchemaIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgClientSchemaIncludeCFLabel() {
			super();
			setText( "CppXMsgClientSchemaInclude" );
		}
	}

	protected class CppXMsgClientSchemaIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgClientSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgClientSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgClientSchemaBodyCFLabel
		extends CFLabel
	{
		public CppXMsgClientSchemaBodyCFLabel() {
			super();
			setText( "CppXMsgClientSchemaBody" );
		}
	}

	protected class CppXMsgClientSchemaBodyEditor
		extends CFTextEditor
	{
		public CppXMsgClientSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgClientSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstSchemaBodyCFLabel
		extends CFLabel
	{
		public CppXMsgRqstSchemaBodyCFLabel() {
			super();
			setText( "CppXMsgRqstSchemaBody" );
		}
	}

	protected class CppXMsgRqstSchemaBodyEditor
		extends CFTextEditor
	{
		public CppXMsgRqstSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstSchemaIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgRqstSchemaIncludeCFLabel() {
			super();
			setText( "CppXMsgRqstSchemaInclude" );
		}
	}

	protected class CppXMsgRqstSchemaIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgRqstSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstSchemaWireParsersCFLabel
		extends CFLabel
	{
		public CppXMsgRqstSchemaWireParsersCFLabel() {
			super();
			setText( "CppXMsgRqstSchemaWireParsers" );
		}
	}

	protected class CppXMsgRqstSchemaWireParsersEditor
		extends CFTextEditor
	{
		public CppXMsgRqstSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public CppXMsgRqstSchemaXsdSpecCFLabel() {
			super();
			setText( "CppXMsgRqstSchemaXsdSpec" );
		}
	}

	protected class CppXMsgRqstSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public CppXMsgRqstSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRqstSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public CppXMsgRqstSchemaXsdElementListCFLabel() {
			super();
			setText( "CppXMsgRqstSchemaXsdElementList" );
		}
	}

	protected class CppXMsgRqstSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public CppXMsgRqstSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRqstSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnSchemaBodyCFLabel
		extends CFLabel
	{
		public CppXMsgRspnSchemaBodyCFLabel() {
			super();
			setText( "CppXMsgRspnSchemaBody" );
		}
	}

	protected class CppXMsgRspnSchemaBodyEditor
		extends CFTextEditor
	{
		public CppXMsgRspnSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnSchemaIncludeCFLabel
		extends CFLabel
	{
		public CppXMsgRspnSchemaIncludeCFLabel() {
			super();
			setText( "CppXMsgRspnSchemaInclude" );
		}
	}

	protected class CppXMsgRspnSchemaIncludeEditor
		extends CFTextEditor
	{
		public CppXMsgRspnSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnSchemaWireParsersCFLabel
		extends CFLabel
	{
		public CppXMsgRspnSchemaWireParsersCFLabel() {
			super();
			setText( "CppXMsgRspnSchemaWireParsers" );
		}
	}

	protected class CppXMsgRspnSchemaWireParsersEditor
		extends CFTextEditor
	{
		public CppXMsgRspnSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public CppXMsgRspnSchemaXsdElementListCFLabel() {
			super();
			setText( "CppXMsgRspnSchemaXsdElementList" );
		}
	}

	protected class CppXMsgRspnSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public CppXMsgRspnSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CppXMsgRspnSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public CppXMsgRspnSchemaXsdSpecCFLabel() {
			super();
			setText( "CppXMsgRspnSchemaXsdSpec" );
		}
	}

	protected class CppXMsgRspnSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public CppXMsgRspnSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CppXMsgRspnSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppSchemaObjIncludeCFLabel() {
			super();
			setText( "HppSchemaObjInclude" );
		}
	}

	protected class HppSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSchemaObjInterfaceCFLabel
		extends CFLabel
	{
		public HppSchemaObjInterfaceCFLabel() {
			super();
			setText( "HppSchemaObjInterface" );
		}
	}

	protected class HppSchemaObjInterfaceEditor
		extends CFTextEditor
	{
		public HppSchemaObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSchemaObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppSchemaObjMembersCFLabel() {
			super();
			setText( "HppSchemaObjMembers" );
		}
	}

	protected class HppSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppSchemaObjImplementationCFLabel
		extends CFLabel
	{
		public HppSchemaObjImplementationCFLabel() {
			super();
			setText( "HppSchemaObjImplementation" );
		}
	}

	protected class HppSchemaObjImplementationEditor
		extends CFTextEditor
	{
		public HppSchemaObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppSchemaObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppDb2LUWSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppDb2LUWSchemaObjMembersCFLabel() {
			super();
			setText( "HppDb2LUWSchemaObjMembers" );
		}
	}

	protected class HppDb2LUWSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppDb2LUWSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppDb2LUWSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppDb2LUWSchemaObjImplCFLabel
		extends CFLabel
	{
		public HppDb2LUWSchemaObjImplCFLabel() {
			super();
			setText( "HppDb2LUWSchemaObjImpl" );
		}
	}

	protected class HppDb2LUWSchemaObjImplEditor
		extends CFTextEditor
	{
		public HppDb2LUWSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppDb2LUWSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppDb2LUWSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppDb2LUWSchemaObjIncludeCFLabel() {
			super();
			setText( "HppDb2LUWSchemaObjInclude" );
		}
	}

	protected class HppDb2LUWSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppDb2LUWSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppDb2LUWSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMSSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppMSSqlSchemaObjMembersCFLabel() {
			super();
			setText( "HppMSSqlSchemaObjMembers" );
		}
	}

	protected class HppMSSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppMSSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMSSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMSSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public HppMSSqlSchemaObjImplCFLabel() {
			super();
			setText( "HppMSSqlSchemaObjImpl" );
		}
	}

	protected class HppMSSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public HppMSSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMSSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMSSqlSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppMSSqlSchemaObjIncludeCFLabel() {
			super();
			setText( "HppMSSqlSchemaObjInclude" );
		}
	}

	protected class HppMSSqlSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppMSSqlSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMSSqlSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMySqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppMySqlSchemaObjMembersCFLabel() {
			super();
			setText( "HppMySqlSchemaObjMembers" );
		}
	}

	protected class HppMySqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppMySqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMySqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMySqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public HppMySqlSchemaObjImplCFLabel() {
			super();
			setText( "HppMySqlSchemaObjImpl" );
		}
	}

	protected class HppMySqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public HppMySqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMySqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppMySqlSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppMySqlSchemaObjIncludeCFLabel() {
			super();
			setText( "HppMySqlSchemaObjInclude" );
		}
	}

	protected class HppMySqlSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppMySqlSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppMySqlSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppOracleSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppOracleSchemaObjMembersCFLabel() {
			super();
			setText( "HppOracleSchemaObjMembers" );
		}
	}

	protected class HppOracleSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppOracleSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppOracleSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppOracleSchemaObjImplCFLabel
		extends CFLabel
	{
		public HppOracleSchemaObjImplCFLabel() {
			super();
			setText( "HppOracleSchemaObjImpl" );
		}
	}

	protected class HppOracleSchemaObjImplEditor
		extends CFTextEditor
	{
		public HppOracleSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppOracleSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppOracleSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppOracleSchemaObjIncludeCFLabel() {
			super();
			setText( "HppOracleSchemaObjInclude" );
		}
	}

	protected class HppOracleSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppOracleSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppOracleSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppPgSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppPgSqlSchemaObjMembersCFLabel() {
			super();
			setText( "HppPgSqlSchemaObjMembers" );
		}
	}

	protected class HppPgSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppPgSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppPgSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppPgSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public HppPgSqlSchemaObjImplCFLabel() {
			super();
			setText( "HppPgSqlSchemaObjImpl" );
		}
	}

	protected class HppPgSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public HppPgSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppPgSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppPgSqlSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppPgSqlSchemaObjIncludeCFLabel() {
			super();
			setText( "HppPgSqlSchemaObjInclude" );
		}
	}

	protected class HppPgSqlSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppPgSqlSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppPgSqlSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppRamSchemaObjMembersCFLabel
		extends CFLabel
	{
		public HppRamSchemaObjMembersCFLabel() {
			super();
			setText( "HppRamSchemaObjMembers" );
		}
	}

	protected class HppRamSchemaObjMembersEditor
		extends CFTextEditor
	{
		public HppRamSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppRamSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppRamSchemaObjImplCFLabel
		extends CFLabel
	{
		public HppRamSchemaObjImplCFLabel() {
			super();
			setText( "HppRamSchemaObjImpl" );
		}
	}

	protected class HppRamSchemaObjImplEditor
		extends CFTextEditor
	{
		public HppRamSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppRamSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppRamSchemaObjIncludeCFLabel
		extends CFLabel
	{
		public HppRamSchemaObjIncludeCFLabel() {
			super();
			setText( "HppRamSchemaObjInclude" );
		}
	}

	protected class HppRamSchemaObjIncludeEditor
		extends CFTextEditor
	{
		public HppRamSchemaObjIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppRamSchemaObjInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgSchemaIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgSchemaIncludeCFLabel() {
			super();
			setText( "HppXMsgSchemaInclude" );
		}
	}

	protected class HppXMsgSchemaIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgSchemaFormattersCFLabel
		extends CFLabel
	{
		public HppXMsgSchemaFormattersCFLabel() {
			super();
			setText( "HppXMsgSchemaFormatters" );
		}
	}

	protected class HppXMsgSchemaFormattersEditor
		extends CFTextEditor
	{
		public HppXMsgSchemaFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgSchemaFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgClientSchemaIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgClientSchemaIncludeCFLabel() {
			super();
			setText( "HppXMsgClientSchemaInclude" );
		}
	}

	protected class HppXMsgClientSchemaIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgClientSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgClientSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgClientSchemaBodyCFLabel
		extends CFLabel
	{
		public HppXMsgClientSchemaBodyCFLabel() {
			super();
			setText( "HppXMsgClientSchemaBody" );
		}
	}

	protected class HppXMsgClientSchemaBodyEditor
		extends CFTextEditor
	{
		public HppXMsgClientSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgClientSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstSchemaBodyCFLabel
		extends CFLabel
	{
		public HppXMsgRqstSchemaBodyCFLabel() {
			super();
			setText( "HppXMsgRqstSchemaBody" );
		}
	}

	protected class HppXMsgRqstSchemaBodyEditor
		extends CFTextEditor
	{
		public HppXMsgRqstSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstSchemaIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgRqstSchemaIncludeCFLabel() {
			super();
			setText( "HppXMsgRqstSchemaInclude" );
		}
	}

	protected class HppXMsgRqstSchemaIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgRqstSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstSchemaWireParsersCFLabel
		extends CFLabel
	{
		public HppXMsgRqstSchemaWireParsersCFLabel() {
			super();
			setText( "HppXMsgRqstSchemaWireParsers" );
		}
	}

	protected class HppXMsgRqstSchemaWireParsersEditor
		extends CFTextEditor
	{
		public HppXMsgRqstSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public HppXMsgRqstSchemaXsdSpecCFLabel() {
			super();
			setText( "HppXMsgRqstSchemaXsdSpec" );
		}
	}

	protected class HppXMsgRqstSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public HppXMsgRqstSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRqstSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public HppXMsgRqstSchemaXsdElementListCFLabel() {
			super();
			setText( "HppXMsgRqstSchemaXsdElementList" );
		}
	}

	protected class HppXMsgRqstSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public HppXMsgRqstSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRqstSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnSchemaBodyCFLabel
		extends CFLabel
	{
		public HppXMsgRspnSchemaBodyCFLabel() {
			super();
			setText( "HppXMsgRspnSchemaBody" );
		}
	}

	protected class HppXMsgRspnSchemaBodyEditor
		extends CFTextEditor
	{
		public HppXMsgRspnSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnSchemaIncludeCFLabel
		extends CFLabel
	{
		public HppXMsgRspnSchemaIncludeCFLabel() {
			super();
			setText( "HppXMsgRspnSchemaInclude" );
		}
	}

	protected class HppXMsgRspnSchemaIncludeEditor
		extends CFTextEditor
	{
		public HppXMsgRspnSchemaIncludeEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnSchemaInclude" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnSchemaWireParsersCFLabel
		extends CFLabel
	{
		public HppXMsgRspnSchemaWireParsersCFLabel() {
			super();
			setText( "HppXMsgRspnSchemaWireParsers" );
		}
	}

	protected class HppXMsgRspnSchemaWireParsersEditor
		extends CFTextEditor
	{
		public HppXMsgRspnSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public HppXMsgRspnSchemaXsdElementListCFLabel() {
			super();
			setText( "HppXMsgRspnSchemaXsdElementList" );
		}
	}

	protected class HppXMsgRspnSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public HppXMsgRspnSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class HppXMsgRspnSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public HppXMsgRspnSchemaXsdSpecCFLabel() {
			super();
			setText( "HppXMsgRspnSchemaXsdSpec" );
		}
	}

	protected class HppXMsgRspnSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public HppXMsgRspnSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "HppXMsgRspnSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsSchemaObjUsingCFLabel() {
			super();
			setText( "CsSchemaObjUsing" );
		}
	}

	protected class CsSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSchemaObjInterfaceCFLabel
		extends CFLabel
	{
		public CsSchemaObjInterfaceCFLabel() {
			super();
			setText( "CsSchemaObjInterface" );
		}
	}

	protected class CsSchemaObjInterfaceEditor
		extends CFTextEditor
	{
		public CsSchemaObjInterfaceEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSchemaObjInterface" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsSchemaObjMembersCFLabel() {
			super();
			setText( "CsSchemaObjMembers" );
		}
	}

	protected class CsSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsSchemaObjImplementationCFLabel
		extends CFLabel
	{
		public CsSchemaObjImplementationCFLabel() {
			super();
			setText( "CsSchemaObjImplementation" );
		}
	}

	protected class CsSchemaObjImplementationEditor
		extends CFTextEditor
	{
		public CsSchemaObjImplementationEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsSchemaObjImplementation" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsDb2LUWSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsDb2LUWSchemaObjMembersCFLabel() {
			super();
			setText( "CsDb2LUWSchemaObjMembers" );
		}
	}

	protected class CsDb2LUWSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsDb2LUWSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsDb2LUWSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsDb2LUWSchemaObjImplCFLabel
		extends CFLabel
	{
		public CsDb2LUWSchemaObjImplCFLabel() {
			super();
			setText( "CsDb2LUWSchemaObjImpl" );
		}
	}

	protected class CsDb2LUWSchemaObjImplEditor
		extends CFTextEditor
	{
		public CsDb2LUWSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsDb2LUWSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsDb2LUWSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsDb2LUWSchemaObjUsingCFLabel() {
			super();
			setText( "CsDb2LUWSchemaObjUsing" );
		}
	}

	protected class CsDb2LUWSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsDb2LUWSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsDb2LUWSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMSSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsMSSqlSchemaObjMembersCFLabel() {
			super();
			setText( "CsMSSqlSchemaObjMembers" );
		}
	}

	protected class CsMSSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsMSSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMSSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMSSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public CsMSSqlSchemaObjImplCFLabel() {
			super();
			setText( "CsMSSqlSchemaObjImpl" );
		}
	}

	protected class CsMSSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public CsMSSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMSSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMSSqlSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsMSSqlSchemaObjUsingCFLabel() {
			super();
			setText( "CsMSSqlSchemaObjUsing" );
		}
	}

	protected class CsMSSqlSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsMSSqlSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMSSqlSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMySqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsMySqlSchemaObjMembersCFLabel() {
			super();
			setText( "CsMySqlSchemaObjMembers" );
		}
	}

	protected class CsMySqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsMySqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMySqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMySqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public CsMySqlSchemaObjImplCFLabel() {
			super();
			setText( "CsMySqlSchemaObjImpl" );
		}
	}

	protected class CsMySqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public CsMySqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMySqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsMySqlSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsMySqlSchemaObjUsingCFLabel() {
			super();
			setText( "CsMySqlSchemaObjUsing" );
		}
	}

	protected class CsMySqlSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsMySqlSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsMySqlSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsOracleSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsOracleSchemaObjMembersCFLabel() {
			super();
			setText( "CsOracleSchemaObjMembers" );
		}
	}

	protected class CsOracleSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsOracleSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsOracleSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsOracleSchemaObjImplCFLabel
		extends CFLabel
	{
		public CsOracleSchemaObjImplCFLabel() {
			super();
			setText( "CsOracleSchemaObjImpl" );
		}
	}

	protected class CsOracleSchemaObjImplEditor
		extends CFTextEditor
	{
		public CsOracleSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsOracleSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsOracleSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsOracleSchemaObjUsingCFLabel() {
			super();
			setText( "CsOracleSchemaObjUsing" );
		}
	}

	protected class CsOracleSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsOracleSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsOracleSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsPgSqlSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsPgSqlSchemaObjMembersCFLabel() {
			super();
			setText( "CsPgSqlSchemaObjMembers" );
		}
	}

	protected class CsPgSqlSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsPgSqlSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsPgSqlSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsPgSqlSchemaObjImplCFLabel
		extends CFLabel
	{
		public CsPgSqlSchemaObjImplCFLabel() {
			super();
			setText( "CsPgSqlSchemaObjImpl" );
		}
	}

	protected class CsPgSqlSchemaObjImplEditor
		extends CFTextEditor
	{
		public CsPgSqlSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsPgSqlSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsPgSqlSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsPgSqlSchemaObjUsingCFLabel() {
			super();
			setText( "CsPgSqlSchemaObjUsing" );
		}
	}

	protected class CsPgSqlSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsPgSqlSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsPgSqlSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsRamSchemaObjMembersCFLabel
		extends CFLabel
	{
		public CsRamSchemaObjMembersCFLabel() {
			super();
			setText( "CsRamSchemaObjMembers" );
		}
	}

	protected class CsRamSchemaObjMembersEditor
		extends CFTextEditor
	{
		public CsRamSchemaObjMembersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsRamSchemaObjMembers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsRamSchemaObjImplCFLabel
		extends CFLabel
	{
		public CsRamSchemaObjImplCFLabel() {
			super();
			setText( "CsRamSchemaObjImpl" );
		}
	}

	protected class CsRamSchemaObjImplEditor
		extends CFTextEditor
	{
		public CsRamSchemaObjImplEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsRamSchemaObjImpl" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsRamSchemaObjUsingCFLabel
		extends CFLabel
	{
		public CsRamSchemaObjUsingCFLabel() {
			super();
			setText( "CsRamSchemaObjUsing" );
		}
	}

	protected class CsRamSchemaObjUsingEditor
		extends CFTextEditor
	{
		public CsRamSchemaObjUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsRamSchemaObjUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgSchemaUsingCFLabel
		extends CFLabel
	{
		public CsXMsgSchemaUsingCFLabel() {
			super();
			setText( "CsXMsgSchemaUsing" );
		}
	}

	protected class CsXMsgSchemaUsingEditor
		extends CFTextEditor
	{
		public CsXMsgSchemaUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgSchemaUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgSchemaFormattersCFLabel
		extends CFLabel
	{
		public CsXMsgSchemaFormattersCFLabel() {
			super();
			setText( "CsXMsgSchemaFormatters" );
		}
	}

	protected class CsXMsgSchemaFormattersEditor
		extends CFTextEditor
	{
		public CsXMsgSchemaFormattersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgSchemaFormatters" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgClientSchemaUsingCFLabel
		extends CFLabel
	{
		public CsXMsgClientSchemaUsingCFLabel() {
			super();
			setText( "CsXMsgClientSchemaUsing" );
		}
	}

	protected class CsXMsgClientSchemaUsingEditor
		extends CFTextEditor
	{
		public CsXMsgClientSchemaUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgClientSchemaUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgClientSchemaBodyCFLabel
		extends CFLabel
	{
		public CsXMsgClientSchemaBodyCFLabel() {
			super();
			setText( "CsXMsgClientSchemaBody" );
		}
	}

	protected class CsXMsgClientSchemaBodyEditor
		extends CFTextEditor
	{
		public CsXMsgClientSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgClientSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstSchemaBodyCFLabel
		extends CFLabel
	{
		public CsXMsgRqstSchemaBodyCFLabel() {
			super();
			setText( "CsXMsgRqstSchemaBody" );
		}
	}

	protected class CsXMsgRqstSchemaBodyEditor
		extends CFTextEditor
	{
		public CsXMsgRqstSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstSchemaUsingCFLabel
		extends CFLabel
	{
		public CsXMsgRqstSchemaUsingCFLabel() {
			super();
			setText( "CsXMsgRqstSchemaUsing" );
		}
	}

	protected class CsXMsgRqstSchemaUsingEditor
		extends CFTextEditor
	{
		public CsXMsgRqstSchemaUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstSchemaUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstSchemaWireParsersCFLabel
		extends CFLabel
	{
		public CsXMsgRqstSchemaWireParsersCFLabel() {
			super();
			setText( "CsXMsgRqstSchemaWireParsers" );
		}
	}

	protected class CsXMsgRqstSchemaWireParsersEditor
		extends CFTextEditor
	{
		public CsXMsgRqstSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public CsXMsgRqstSchemaXsdSpecCFLabel() {
			super();
			setText( "CsXMsgRqstSchemaXsdSpec" );
		}
	}

	protected class CsXMsgRqstSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public CsXMsgRqstSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRqstSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public CsXMsgRqstSchemaXsdElementListCFLabel() {
			super();
			setText( "CsXMsgRqstSchemaXsdElementList" );
		}
	}

	protected class CsXMsgRqstSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public CsXMsgRqstSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRqstSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnSchemaBodyCFLabel
		extends CFLabel
	{
		public CsXMsgRspnSchemaBodyCFLabel() {
			super();
			setText( "CsXMsgRspnSchemaBody" );
		}
	}

	protected class CsXMsgRspnSchemaBodyEditor
		extends CFTextEditor
	{
		public CsXMsgRspnSchemaBodyEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnSchemaBody" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnSchemaUsingCFLabel
		extends CFLabel
	{
		public CsXMsgRspnSchemaUsingCFLabel() {
			super();
			setText( "CsXMsgRspnSchemaUsing" );
		}
	}

	protected class CsXMsgRspnSchemaUsingEditor
		extends CFTextEditor
	{
		public CsXMsgRspnSchemaUsingEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnSchemaUsing" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnSchemaWireParsersCFLabel
		extends CFLabel
	{
		public CsXMsgRspnSchemaWireParsersCFLabel() {
			super();
			setText( "CsXMsgRspnSchemaWireParsers" );
		}
	}

	protected class CsXMsgRspnSchemaWireParsersEditor
		extends CFTextEditor
	{
		public CsXMsgRspnSchemaWireParsersEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnSchemaWireParsers" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnSchemaXsdElementListCFLabel
		extends CFLabel
	{
		public CsXMsgRspnSchemaXsdElementListCFLabel() {
			super();
			setText( "CsXMsgRspnSchemaXsdElementList" );
		}
	}

	protected class CsXMsgRspnSchemaXsdElementListEditor
		extends CFTextEditor
	{
		public CsXMsgRspnSchemaXsdElementListEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnSchemaXsdElementList" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected class CsXMsgRspnSchemaXsdSpecCFLabel
		extends CFLabel
	{
		public CsXMsgRspnSchemaXsdSpecCFLabel() {
			super();
			setText( "CsXMsgRspnSchemaXsdSpec" );
		}
	}

	protected class CsXMsgRspnSchemaXsdSpecEditor
		extends CFTextEditor
	{
		public CsXMsgRspnSchemaXsdSpecEditor() {
			super();
			setMaxLen( 2000000 );
			setFieldName( "CsXMsgRspnSchemaXsdSpec" );
			setPrefHeight( 10 * 20 );
			setMinHeight( 10 * 20 );
		}
	}

	protected IdCFLabel javafxLabelId = null;
	protected IdEditor javafxEditorId = null;
	protected NameCFLabel javafxLabelName = null;
	protected NameEditor javafxEditorName = null;
	protected DbNameCFLabel javafxLabelDbName = null;
	protected DbNameEditor javafxEditorDbName = null;
	protected ShortNameCFLabel javafxLabelShortName = null;
	protected ShortNameEditor javafxEditorShortName = null;
	protected LabelCFLabel javafxLabelLabel = null;
	protected LabelEditor javafxEditorLabel = null;
	protected ShortDescriptionCFLabel javafxLabelShortDescription = null;
	protected ShortDescriptionEditor javafxEditorShortDescription = null;
	protected DescriptionCFLabel javafxLabelDescription = null;
	protected DescriptionEditor javafxEditorDescription = null;
	protected PublicLicenseNameCFLabel javafxLabelPublicLicenseName = null;
	protected PublicLicenseNameEditor javafxEditorPublicLicenseName = null;
	protected PublicLicenseTextCFLabel javafxLabelPublicLicenseText = null;
	protected PublicLicenseTextEditor javafxEditorPublicLicenseText = null;
	protected ImplementationLicenseNameCFLabel javafxLabelImplementationLicenseName = null;
	protected ImplementationLicenseNameEditor javafxEditorImplementationLicenseName = null;
	protected ImplementationLicenseTextCFLabel javafxLabelImplementationLicenseText = null;
	protected ImplementationLicenseTextEditor javafxEditorImplementationLicenseText = null;
	protected CopyrightPeriodCFLabel javafxLabelCopyrightPeriod = null;
	protected CopyrightPeriodEditor javafxEditorCopyrightPeriod = null;
	protected CopyrightHolderCFLabel javafxLabelCopyrightHolder = null;
	protected CopyrightHolderEditor javafxEditorCopyrightHolder = null;
	protected AuthorEMailCFLabel javafxLabelAuthorEMail = null;
	protected AuthorEMailEditor javafxEditorAuthorEMail = null;
	protected ProjectURLCFLabel javafxLabelProjectURL = null;
	protected ProjectURLEditor javafxEditorProjectURL = null;
	protected PublishURICFLabel javafxLabelPublishURI = null;
	protected PublishURIEditor javafxEditorPublishURI = null;
	protected JSchemaObjImportCFLabel javafxLabelJSchemaObjImport = null;
	protected JSchemaObjImportEditor javafxEditorJSchemaObjImport = null;
	protected JSchemaObjInterfaceCFLabel javafxLabelJSchemaObjInterface = null;
	protected JSchemaObjInterfaceEditor javafxEditorJSchemaObjInterface = null;
	protected JSchemaObjMembersCFLabel javafxLabelJSchemaObjMembers = null;
	protected JSchemaObjMembersEditor javafxEditorJSchemaObjMembers = null;
	protected JSchemaObjImplementationCFLabel javafxLabelJSchemaObjImplementation = null;
	protected JSchemaObjImplementationEditor javafxEditorJSchemaObjImplementation = null;
	protected JDb2LUWSchemaObjMembersCFLabel javafxLabelJDb2LUWSchemaObjMembers = null;
	protected JDb2LUWSchemaObjMembersEditor javafxEditorJDb2LUWSchemaObjMembers = null;
	protected JDb2LUWSchemaObjImplCFLabel javafxLabelJDb2LUWSchemaObjImpl = null;
	protected JDb2LUWSchemaObjImplEditor javafxEditorJDb2LUWSchemaObjImpl = null;
	protected JDb2LUWSchemaObjImportCFLabel javafxLabelJDb2LUWSchemaObjImport = null;
	protected JDb2LUWSchemaObjImportEditor javafxEditorJDb2LUWSchemaObjImport = null;
	protected JMSSqlSchemaObjMembersCFLabel javafxLabelJMSSqlSchemaObjMembers = null;
	protected JMSSqlSchemaObjMembersEditor javafxEditorJMSSqlSchemaObjMembers = null;
	protected JMSSqlSchemaObjImplCFLabel javafxLabelJMSSqlSchemaObjImpl = null;
	protected JMSSqlSchemaObjImplEditor javafxEditorJMSSqlSchemaObjImpl = null;
	protected JMSSqlSchemaObjImportCFLabel javafxLabelJMSSqlSchemaObjImport = null;
	protected JMSSqlSchemaObjImportEditor javafxEditorJMSSqlSchemaObjImport = null;
	protected JMySqlSchemaObjMembersCFLabel javafxLabelJMySqlSchemaObjMembers = null;
	protected JMySqlSchemaObjMembersEditor javafxEditorJMySqlSchemaObjMembers = null;
	protected JMySqlSchemaObjImplCFLabel javafxLabelJMySqlSchemaObjImpl = null;
	protected JMySqlSchemaObjImplEditor javafxEditorJMySqlSchemaObjImpl = null;
	protected JMySqlSchemaObjImportCFLabel javafxLabelJMySqlSchemaObjImport = null;
	protected JMySqlSchemaObjImportEditor javafxEditorJMySqlSchemaObjImport = null;
	protected JOracleSchemaObjMembersCFLabel javafxLabelJOracleSchemaObjMembers = null;
	protected JOracleSchemaObjMembersEditor javafxEditorJOracleSchemaObjMembers = null;
	protected JOracleSchemaObjImplCFLabel javafxLabelJOracleSchemaObjImpl = null;
	protected JOracleSchemaObjImplEditor javafxEditorJOracleSchemaObjImpl = null;
	protected JOracleSchemaObjImportCFLabel javafxLabelJOracleSchemaObjImport = null;
	protected JOracleSchemaObjImportEditor javafxEditorJOracleSchemaObjImport = null;
	protected JPgSqlSchemaObjMembersCFLabel javafxLabelJPgSqlSchemaObjMembers = null;
	protected JPgSqlSchemaObjMembersEditor javafxEditorJPgSqlSchemaObjMembers = null;
	protected JPgSqlSchemaObjImplCFLabel javafxLabelJPgSqlSchemaObjImpl = null;
	protected JPgSqlSchemaObjImplEditor javafxEditorJPgSqlSchemaObjImpl = null;
	protected JPgSqlSchemaObjImportCFLabel javafxLabelJPgSqlSchemaObjImport = null;
	protected JPgSqlSchemaObjImportEditor javafxEditorJPgSqlSchemaObjImport = null;
	protected JRamSchemaObjMembersCFLabel javafxLabelJRamSchemaObjMembers = null;
	protected JRamSchemaObjMembersEditor javafxEditorJRamSchemaObjMembers = null;
	protected JRamSchemaObjImplCFLabel javafxLabelJRamSchemaObjImpl = null;
	protected JRamSchemaObjImplEditor javafxEditorJRamSchemaObjImpl = null;
	protected JRamSchemaObjImportCFLabel javafxLabelJRamSchemaObjImport = null;
	protected JRamSchemaObjImportEditor javafxEditorJRamSchemaObjImport = null;
	protected JXMsgSchemaImportCFLabel javafxLabelJXMsgSchemaImport = null;
	protected JXMsgSchemaImportEditor javafxEditorJXMsgSchemaImport = null;
	protected JXMsgSchemaFormattersCFLabel javafxLabelJXMsgSchemaFormatters = null;
	protected JXMsgSchemaFormattersEditor javafxEditorJXMsgSchemaFormatters = null;
	protected JXMsgClientSchemaImportCFLabel javafxLabelJXMsgClientSchemaImport = null;
	protected JXMsgClientSchemaImportEditor javafxEditorJXMsgClientSchemaImport = null;
	protected JXMsgClientSchemaBodyCFLabel javafxLabelJXMsgClientSchemaBody = null;
	protected JXMsgClientSchemaBodyEditor javafxEditorJXMsgClientSchemaBody = null;
	protected JXMsgRqstSchemaBodyCFLabel javafxLabelJXMsgRqstSchemaBody = null;
	protected JXMsgRqstSchemaBodyEditor javafxEditorJXMsgRqstSchemaBody = null;
	protected JXMsgRqstSchemaImportCFLabel javafxLabelJXMsgRqstSchemaImport = null;
	protected JXMsgRqstSchemaImportEditor javafxEditorJXMsgRqstSchemaImport = null;
	protected JXMsgRqstSchemaWireParsersCFLabel javafxLabelJXMsgRqstSchemaWireParsers = null;
	protected JXMsgRqstSchemaWireParsersEditor javafxEditorJXMsgRqstSchemaWireParsers = null;
	protected JXMsgRqstSchemaXsdSpecCFLabel javafxLabelJXMsgRqstSchemaXsdSpec = null;
	protected JXMsgRqstSchemaXsdSpecEditor javafxEditorJXMsgRqstSchemaXsdSpec = null;
	protected JXMsgRqstSchemaXsdElementListCFLabel javafxLabelJXMsgRqstSchemaXsdElementList = null;
	protected JXMsgRqstSchemaXsdElementListEditor javafxEditorJXMsgRqstSchemaXsdElementList = null;
	protected JXMsgRspnSchemaBodyCFLabel javafxLabelJXMsgRspnSchemaBody = null;
	protected JXMsgRspnSchemaBodyEditor javafxEditorJXMsgRspnSchemaBody = null;
	protected JXMsgRspnSchemaImportCFLabel javafxLabelJXMsgRspnSchemaImport = null;
	protected JXMsgRspnSchemaImportEditor javafxEditorJXMsgRspnSchemaImport = null;
	protected JXMsgRspnSchemaWireParsersCFLabel javafxLabelJXMsgRspnSchemaWireParsers = null;
	protected JXMsgRspnSchemaWireParsersEditor javafxEditorJXMsgRspnSchemaWireParsers = null;
	protected JXMsgRspnSchemaXsdElementListCFLabel javafxLabelJXMsgRspnSchemaXsdElementList = null;
	protected JXMsgRspnSchemaXsdElementListEditor javafxEditorJXMsgRspnSchemaXsdElementList = null;
	protected JXMsgRspnSchemaXsdSpecCFLabel javafxLabelJXMsgRspnSchemaXsdSpec = null;
	protected JXMsgRspnSchemaXsdSpecEditor javafxEditorJXMsgRspnSchemaXsdSpec = null;
	protected CppSchemaObjIncludeCFLabel javafxLabelCppSchemaObjInclude = null;
	protected CppSchemaObjIncludeEditor javafxEditorCppSchemaObjInclude = null;
	protected CppSchemaObjInterfaceCFLabel javafxLabelCppSchemaObjInterface = null;
	protected CppSchemaObjInterfaceEditor javafxEditorCppSchemaObjInterface = null;
	protected CppSchemaObjMembersCFLabel javafxLabelCppSchemaObjMembers = null;
	protected CppSchemaObjMembersEditor javafxEditorCppSchemaObjMembers = null;
	protected CppSchemaObjImplementationCFLabel javafxLabelCppSchemaObjImplementation = null;
	protected CppSchemaObjImplementationEditor javafxEditorCppSchemaObjImplementation = null;
	protected CppDb2LUWSchemaObjMembersCFLabel javafxLabelCppDb2LUWSchemaObjMembers = null;
	protected CppDb2LUWSchemaObjMembersEditor javafxEditorCppDb2LUWSchemaObjMembers = null;
	protected CppDb2LUWSchemaObjImplCFLabel javafxLabelCppDb2LUWSchemaObjImpl = null;
	protected CppDb2LUWSchemaObjImplEditor javafxEditorCppDb2LUWSchemaObjImpl = null;
	protected CppDb2LUWSchemaObjIncludeCFLabel javafxLabelCppDb2LUWSchemaObjInclude = null;
	protected CppDb2LUWSchemaObjIncludeEditor javafxEditorCppDb2LUWSchemaObjInclude = null;
	protected CppMSSqlSchemaObjMembersCFLabel javafxLabelCppMSSqlSchemaObjMembers = null;
	protected CppMSSqlSchemaObjMembersEditor javafxEditorCppMSSqlSchemaObjMembers = null;
	protected CppMSSqlSchemaObjImplCFLabel javafxLabelCppMSSqlSchemaObjImpl = null;
	protected CppMSSqlSchemaObjImplEditor javafxEditorCppMSSqlSchemaObjImpl = null;
	protected CppMSSqlSchemaObjIncludeCFLabel javafxLabelCppMSSqlSchemaObjInclude = null;
	protected CppMSSqlSchemaObjIncludeEditor javafxEditorCppMSSqlSchemaObjInclude = null;
	protected CppMySqlSchemaObjMembersCFLabel javafxLabelCppMySqlSchemaObjMembers = null;
	protected CppMySqlSchemaObjMembersEditor javafxEditorCppMySqlSchemaObjMembers = null;
	protected CppMySqlSchemaObjImplCFLabel javafxLabelCppMySqlSchemaObjImpl = null;
	protected CppMySqlSchemaObjImplEditor javafxEditorCppMySqlSchemaObjImpl = null;
	protected CppMySqlSchemaObjIncludeCFLabel javafxLabelCppMySqlSchemaObjInclude = null;
	protected CppMySqlSchemaObjIncludeEditor javafxEditorCppMySqlSchemaObjInclude = null;
	protected CppOracleSchemaObjMembersCFLabel javafxLabelCppOracleSchemaObjMembers = null;
	protected CppOracleSchemaObjMembersEditor javafxEditorCppOracleSchemaObjMembers = null;
	protected CppOracleSchemaObjImplCFLabel javafxLabelCppOracleSchemaObjImpl = null;
	protected CppOracleSchemaObjImplEditor javafxEditorCppOracleSchemaObjImpl = null;
	protected CppOracleSchemaObjIncludeCFLabel javafxLabelCppOracleSchemaObjInclude = null;
	protected CppOracleSchemaObjIncludeEditor javafxEditorCppOracleSchemaObjInclude = null;
	protected CppPgSqlSchemaObjMembersCFLabel javafxLabelCppPgSqlSchemaObjMembers = null;
	protected CppPgSqlSchemaObjMembersEditor javafxEditorCppPgSqlSchemaObjMembers = null;
	protected CppPgSqlSchemaObjImplCFLabel javafxLabelCppPgSqlSchemaObjImpl = null;
	protected CppPgSqlSchemaObjImplEditor javafxEditorCppPgSqlSchemaObjImpl = null;
	protected CppPgSqlSchemaObjIncludeCFLabel javafxLabelCppPgSqlSchemaObjInclude = null;
	protected CppPgSqlSchemaObjIncludeEditor javafxEditorCppPgSqlSchemaObjInclude = null;
	protected CppRamSchemaObjMembersCFLabel javafxLabelCppRamSchemaObjMembers = null;
	protected CppRamSchemaObjMembersEditor javafxEditorCppRamSchemaObjMembers = null;
	protected CppRamSchemaObjImplCFLabel javafxLabelCppRamSchemaObjImpl = null;
	protected CppRamSchemaObjImplEditor javafxEditorCppRamSchemaObjImpl = null;
	protected CppRamSchemaObjIncludeCFLabel javafxLabelCppRamSchemaObjInclude = null;
	protected CppRamSchemaObjIncludeEditor javafxEditorCppRamSchemaObjInclude = null;
	protected CppXMsgSchemaIncludeCFLabel javafxLabelCppXMsgSchemaInclude = null;
	protected CppXMsgSchemaIncludeEditor javafxEditorCppXMsgSchemaInclude = null;
	protected CppXMsgSchemaFormattersCFLabel javafxLabelCppXMsgSchemaFormatters = null;
	protected CppXMsgSchemaFormattersEditor javafxEditorCppXMsgSchemaFormatters = null;
	protected CppXMsgClientSchemaIncludeCFLabel javafxLabelCppXMsgClientSchemaInclude = null;
	protected CppXMsgClientSchemaIncludeEditor javafxEditorCppXMsgClientSchemaInclude = null;
	protected CppXMsgClientSchemaBodyCFLabel javafxLabelCppXMsgClientSchemaBody = null;
	protected CppXMsgClientSchemaBodyEditor javafxEditorCppXMsgClientSchemaBody = null;
	protected CppXMsgRqstSchemaBodyCFLabel javafxLabelCppXMsgRqstSchemaBody = null;
	protected CppXMsgRqstSchemaBodyEditor javafxEditorCppXMsgRqstSchemaBody = null;
	protected CppXMsgRqstSchemaIncludeCFLabel javafxLabelCppXMsgRqstSchemaInclude = null;
	protected CppXMsgRqstSchemaIncludeEditor javafxEditorCppXMsgRqstSchemaInclude = null;
	protected CppXMsgRqstSchemaWireParsersCFLabel javafxLabelCppXMsgRqstSchemaWireParsers = null;
	protected CppXMsgRqstSchemaWireParsersEditor javafxEditorCppXMsgRqstSchemaWireParsers = null;
	protected CppXMsgRqstSchemaXsdSpecCFLabel javafxLabelCppXMsgRqstSchemaXsdSpec = null;
	protected CppXMsgRqstSchemaXsdSpecEditor javafxEditorCppXMsgRqstSchemaXsdSpec = null;
	protected CppXMsgRqstSchemaXsdElementListCFLabel javafxLabelCppXMsgRqstSchemaXsdElementList = null;
	protected CppXMsgRqstSchemaXsdElementListEditor javafxEditorCppXMsgRqstSchemaXsdElementList = null;
	protected CppXMsgRspnSchemaBodyCFLabel javafxLabelCppXMsgRspnSchemaBody = null;
	protected CppXMsgRspnSchemaBodyEditor javafxEditorCppXMsgRspnSchemaBody = null;
	protected CppXMsgRspnSchemaIncludeCFLabel javafxLabelCppXMsgRspnSchemaInclude = null;
	protected CppXMsgRspnSchemaIncludeEditor javafxEditorCppXMsgRspnSchemaInclude = null;
	protected CppXMsgRspnSchemaWireParsersCFLabel javafxLabelCppXMsgRspnSchemaWireParsers = null;
	protected CppXMsgRspnSchemaWireParsersEditor javafxEditorCppXMsgRspnSchemaWireParsers = null;
	protected CppXMsgRspnSchemaXsdElementListCFLabel javafxLabelCppXMsgRspnSchemaXsdElementList = null;
	protected CppXMsgRspnSchemaXsdElementListEditor javafxEditorCppXMsgRspnSchemaXsdElementList = null;
	protected CppXMsgRspnSchemaXsdSpecCFLabel javafxLabelCppXMsgRspnSchemaXsdSpec = null;
	protected CppXMsgRspnSchemaXsdSpecEditor javafxEditorCppXMsgRspnSchemaXsdSpec = null;
	protected HppSchemaObjIncludeCFLabel javafxLabelHppSchemaObjInclude = null;
	protected HppSchemaObjIncludeEditor javafxEditorHppSchemaObjInclude = null;
	protected HppSchemaObjInterfaceCFLabel javafxLabelHppSchemaObjInterface = null;
	protected HppSchemaObjInterfaceEditor javafxEditorHppSchemaObjInterface = null;
	protected HppSchemaObjMembersCFLabel javafxLabelHppSchemaObjMembers = null;
	protected HppSchemaObjMembersEditor javafxEditorHppSchemaObjMembers = null;
	protected HppSchemaObjImplementationCFLabel javafxLabelHppSchemaObjImplementation = null;
	protected HppSchemaObjImplementationEditor javafxEditorHppSchemaObjImplementation = null;
	protected HppDb2LUWSchemaObjMembersCFLabel javafxLabelHppDb2LUWSchemaObjMembers = null;
	protected HppDb2LUWSchemaObjMembersEditor javafxEditorHppDb2LUWSchemaObjMembers = null;
	protected HppDb2LUWSchemaObjImplCFLabel javafxLabelHppDb2LUWSchemaObjImpl = null;
	protected HppDb2LUWSchemaObjImplEditor javafxEditorHppDb2LUWSchemaObjImpl = null;
	protected HppDb2LUWSchemaObjIncludeCFLabel javafxLabelHppDb2LUWSchemaObjInclude = null;
	protected HppDb2LUWSchemaObjIncludeEditor javafxEditorHppDb2LUWSchemaObjInclude = null;
	protected HppMSSqlSchemaObjMembersCFLabel javafxLabelHppMSSqlSchemaObjMembers = null;
	protected HppMSSqlSchemaObjMembersEditor javafxEditorHppMSSqlSchemaObjMembers = null;
	protected HppMSSqlSchemaObjImplCFLabel javafxLabelHppMSSqlSchemaObjImpl = null;
	protected HppMSSqlSchemaObjImplEditor javafxEditorHppMSSqlSchemaObjImpl = null;
	protected HppMSSqlSchemaObjIncludeCFLabel javafxLabelHppMSSqlSchemaObjInclude = null;
	protected HppMSSqlSchemaObjIncludeEditor javafxEditorHppMSSqlSchemaObjInclude = null;
	protected HppMySqlSchemaObjMembersCFLabel javafxLabelHppMySqlSchemaObjMembers = null;
	protected HppMySqlSchemaObjMembersEditor javafxEditorHppMySqlSchemaObjMembers = null;
	protected HppMySqlSchemaObjImplCFLabel javafxLabelHppMySqlSchemaObjImpl = null;
	protected HppMySqlSchemaObjImplEditor javafxEditorHppMySqlSchemaObjImpl = null;
	protected HppMySqlSchemaObjIncludeCFLabel javafxLabelHppMySqlSchemaObjInclude = null;
	protected HppMySqlSchemaObjIncludeEditor javafxEditorHppMySqlSchemaObjInclude = null;
	protected HppOracleSchemaObjMembersCFLabel javafxLabelHppOracleSchemaObjMembers = null;
	protected HppOracleSchemaObjMembersEditor javafxEditorHppOracleSchemaObjMembers = null;
	protected HppOracleSchemaObjImplCFLabel javafxLabelHppOracleSchemaObjImpl = null;
	protected HppOracleSchemaObjImplEditor javafxEditorHppOracleSchemaObjImpl = null;
	protected HppOracleSchemaObjIncludeCFLabel javafxLabelHppOracleSchemaObjInclude = null;
	protected HppOracleSchemaObjIncludeEditor javafxEditorHppOracleSchemaObjInclude = null;
	protected HppPgSqlSchemaObjMembersCFLabel javafxLabelHppPgSqlSchemaObjMembers = null;
	protected HppPgSqlSchemaObjMembersEditor javafxEditorHppPgSqlSchemaObjMembers = null;
	protected HppPgSqlSchemaObjImplCFLabel javafxLabelHppPgSqlSchemaObjImpl = null;
	protected HppPgSqlSchemaObjImplEditor javafxEditorHppPgSqlSchemaObjImpl = null;
	protected HppPgSqlSchemaObjIncludeCFLabel javafxLabelHppPgSqlSchemaObjInclude = null;
	protected HppPgSqlSchemaObjIncludeEditor javafxEditorHppPgSqlSchemaObjInclude = null;
	protected HppRamSchemaObjMembersCFLabel javafxLabelHppRamSchemaObjMembers = null;
	protected HppRamSchemaObjMembersEditor javafxEditorHppRamSchemaObjMembers = null;
	protected HppRamSchemaObjImplCFLabel javafxLabelHppRamSchemaObjImpl = null;
	protected HppRamSchemaObjImplEditor javafxEditorHppRamSchemaObjImpl = null;
	protected HppRamSchemaObjIncludeCFLabel javafxLabelHppRamSchemaObjInclude = null;
	protected HppRamSchemaObjIncludeEditor javafxEditorHppRamSchemaObjInclude = null;
	protected HppXMsgSchemaIncludeCFLabel javafxLabelHppXMsgSchemaInclude = null;
	protected HppXMsgSchemaIncludeEditor javafxEditorHppXMsgSchemaInclude = null;
	protected HppXMsgSchemaFormattersCFLabel javafxLabelHppXMsgSchemaFormatters = null;
	protected HppXMsgSchemaFormattersEditor javafxEditorHppXMsgSchemaFormatters = null;
	protected HppXMsgClientSchemaIncludeCFLabel javafxLabelHppXMsgClientSchemaInclude = null;
	protected HppXMsgClientSchemaIncludeEditor javafxEditorHppXMsgClientSchemaInclude = null;
	protected HppXMsgClientSchemaBodyCFLabel javafxLabelHppXMsgClientSchemaBody = null;
	protected HppXMsgClientSchemaBodyEditor javafxEditorHppXMsgClientSchemaBody = null;
	protected HppXMsgRqstSchemaBodyCFLabel javafxLabelHppXMsgRqstSchemaBody = null;
	protected HppXMsgRqstSchemaBodyEditor javafxEditorHppXMsgRqstSchemaBody = null;
	protected HppXMsgRqstSchemaIncludeCFLabel javafxLabelHppXMsgRqstSchemaInclude = null;
	protected HppXMsgRqstSchemaIncludeEditor javafxEditorHppXMsgRqstSchemaInclude = null;
	protected HppXMsgRqstSchemaWireParsersCFLabel javafxLabelHppXMsgRqstSchemaWireParsers = null;
	protected HppXMsgRqstSchemaWireParsersEditor javafxEditorHppXMsgRqstSchemaWireParsers = null;
	protected HppXMsgRqstSchemaXsdSpecCFLabel javafxLabelHppXMsgRqstSchemaXsdSpec = null;
	protected HppXMsgRqstSchemaXsdSpecEditor javafxEditorHppXMsgRqstSchemaXsdSpec = null;
	protected HppXMsgRqstSchemaXsdElementListCFLabel javafxLabelHppXMsgRqstSchemaXsdElementList = null;
	protected HppXMsgRqstSchemaXsdElementListEditor javafxEditorHppXMsgRqstSchemaXsdElementList = null;
	protected HppXMsgRspnSchemaBodyCFLabel javafxLabelHppXMsgRspnSchemaBody = null;
	protected HppXMsgRspnSchemaBodyEditor javafxEditorHppXMsgRspnSchemaBody = null;
	protected HppXMsgRspnSchemaIncludeCFLabel javafxLabelHppXMsgRspnSchemaInclude = null;
	protected HppXMsgRspnSchemaIncludeEditor javafxEditorHppXMsgRspnSchemaInclude = null;
	protected HppXMsgRspnSchemaWireParsersCFLabel javafxLabelHppXMsgRspnSchemaWireParsers = null;
	protected HppXMsgRspnSchemaWireParsersEditor javafxEditorHppXMsgRspnSchemaWireParsers = null;
	protected HppXMsgRspnSchemaXsdElementListCFLabel javafxLabelHppXMsgRspnSchemaXsdElementList = null;
	protected HppXMsgRspnSchemaXsdElementListEditor javafxEditorHppXMsgRspnSchemaXsdElementList = null;
	protected HppXMsgRspnSchemaXsdSpecCFLabel javafxLabelHppXMsgRspnSchemaXsdSpec = null;
	protected HppXMsgRspnSchemaXsdSpecEditor javafxEditorHppXMsgRspnSchemaXsdSpec = null;
	protected CsSchemaObjUsingCFLabel javafxLabelCsSchemaObjUsing = null;
	protected CsSchemaObjUsingEditor javafxEditorCsSchemaObjUsing = null;
	protected CsSchemaObjInterfaceCFLabel javafxLabelCsSchemaObjInterface = null;
	protected CsSchemaObjInterfaceEditor javafxEditorCsSchemaObjInterface = null;
	protected CsSchemaObjMembersCFLabel javafxLabelCsSchemaObjMembers = null;
	protected CsSchemaObjMembersEditor javafxEditorCsSchemaObjMembers = null;
	protected CsSchemaObjImplementationCFLabel javafxLabelCsSchemaObjImplementation = null;
	protected CsSchemaObjImplementationEditor javafxEditorCsSchemaObjImplementation = null;
	protected CsDb2LUWSchemaObjMembersCFLabel javafxLabelCsDb2LUWSchemaObjMembers = null;
	protected CsDb2LUWSchemaObjMembersEditor javafxEditorCsDb2LUWSchemaObjMembers = null;
	protected CsDb2LUWSchemaObjImplCFLabel javafxLabelCsDb2LUWSchemaObjImpl = null;
	protected CsDb2LUWSchemaObjImplEditor javafxEditorCsDb2LUWSchemaObjImpl = null;
	protected CsDb2LUWSchemaObjUsingCFLabel javafxLabelCsDb2LUWSchemaObjUsing = null;
	protected CsDb2LUWSchemaObjUsingEditor javafxEditorCsDb2LUWSchemaObjUsing = null;
	protected CsMSSqlSchemaObjMembersCFLabel javafxLabelCsMSSqlSchemaObjMembers = null;
	protected CsMSSqlSchemaObjMembersEditor javafxEditorCsMSSqlSchemaObjMembers = null;
	protected CsMSSqlSchemaObjImplCFLabel javafxLabelCsMSSqlSchemaObjImpl = null;
	protected CsMSSqlSchemaObjImplEditor javafxEditorCsMSSqlSchemaObjImpl = null;
	protected CsMSSqlSchemaObjUsingCFLabel javafxLabelCsMSSqlSchemaObjUsing = null;
	protected CsMSSqlSchemaObjUsingEditor javafxEditorCsMSSqlSchemaObjUsing = null;
	protected CsMySqlSchemaObjMembersCFLabel javafxLabelCsMySqlSchemaObjMembers = null;
	protected CsMySqlSchemaObjMembersEditor javafxEditorCsMySqlSchemaObjMembers = null;
	protected CsMySqlSchemaObjImplCFLabel javafxLabelCsMySqlSchemaObjImpl = null;
	protected CsMySqlSchemaObjImplEditor javafxEditorCsMySqlSchemaObjImpl = null;
	protected CsMySqlSchemaObjUsingCFLabel javafxLabelCsMySqlSchemaObjUsing = null;
	protected CsMySqlSchemaObjUsingEditor javafxEditorCsMySqlSchemaObjUsing = null;
	protected CsOracleSchemaObjMembersCFLabel javafxLabelCsOracleSchemaObjMembers = null;
	protected CsOracleSchemaObjMembersEditor javafxEditorCsOracleSchemaObjMembers = null;
	protected CsOracleSchemaObjImplCFLabel javafxLabelCsOracleSchemaObjImpl = null;
	protected CsOracleSchemaObjImplEditor javafxEditorCsOracleSchemaObjImpl = null;
	protected CsOracleSchemaObjUsingCFLabel javafxLabelCsOracleSchemaObjUsing = null;
	protected CsOracleSchemaObjUsingEditor javafxEditorCsOracleSchemaObjUsing = null;
	protected CsPgSqlSchemaObjMembersCFLabel javafxLabelCsPgSqlSchemaObjMembers = null;
	protected CsPgSqlSchemaObjMembersEditor javafxEditorCsPgSqlSchemaObjMembers = null;
	protected CsPgSqlSchemaObjImplCFLabel javafxLabelCsPgSqlSchemaObjImpl = null;
	protected CsPgSqlSchemaObjImplEditor javafxEditorCsPgSqlSchemaObjImpl = null;
	protected CsPgSqlSchemaObjUsingCFLabel javafxLabelCsPgSqlSchemaObjUsing = null;
	protected CsPgSqlSchemaObjUsingEditor javafxEditorCsPgSqlSchemaObjUsing = null;
	protected CsRamSchemaObjMembersCFLabel javafxLabelCsRamSchemaObjMembers = null;
	protected CsRamSchemaObjMembersEditor javafxEditorCsRamSchemaObjMembers = null;
	protected CsRamSchemaObjImplCFLabel javafxLabelCsRamSchemaObjImpl = null;
	protected CsRamSchemaObjImplEditor javafxEditorCsRamSchemaObjImpl = null;
	protected CsRamSchemaObjUsingCFLabel javafxLabelCsRamSchemaObjUsing = null;
	protected CsRamSchemaObjUsingEditor javafxEditorCsRamSchemaObjUsing = null;
	protected CsXMsgSchemaUsingCFLabel javafxLabelCsXMsgSchemaUsing = null;
	protected CsXMsgSchemaUsingEditor javafxEditorCsXMsgSchemaUsing = null;
	protected CsXMsgSchemaFormattersCFLabel javafxLabelCsXMsgSchemaFormatters = null;
	protected CsXMsgSchemaFormattersEditor javafxEditorCsXMsgSchemaFormatters = null;
	protected CsXMsgClientSchemaUsingCFLabel javafxLabelCsXMsgClientSchemaUsing = null;
	protected CsXMsgClientSchemaUsingEditor javafxEditorCsXMsgClientSchemaUsing = null;
	protected CsXMsgClientSchemaBodyCFLabel javafxLabelCsXMsgClientSchemaBody = null;
	protected CsXMsgClientSchemaBodyEditor javafxEditorCsXMsgClientSchemaBody = null;
	protected CsXMsgRqstSchemaBodyCFLabel javafxLabelCsXMsgRqstSchemaBody = null;
	protected CsXMsgRqstSchemaBodyEditor javafxEditorCsXMsgRqstSchemaBody = null;
	protected CsXMsgRqstSchemaUsingCFLabel javafxLabelCsXMsgRqstSchemaUsing = null;
	protected CsXMsgRqstSchemaUsingEditor javafxEditorCsXMsgRqstSchemaUsing = null;
	protected CsXMsgRqstSchemaWireParsersCFLabel javafxLabelCsXMsgRqstSchemaWireParsers = null;
	protected CsXMsgRqstSchemaWireParsersEditor javafxEditorCsXMsgRqstSchemaWireParsers = null;
	protected CsXMsgRqstSchemaXsdSpecCFLabel javafxLabelCsXMsgRqstSchemaXsdSpec = null;
	protected CsXMsgRqstSchemaXsdSpecEditor javafxEditorCsXMsgRqstSchemaXsdSpec = null;
	protected CsXMsgRqstSchemaXsdElementListCFLabel javafxLabelCsXMsgRqstSchemaXsdElementList = null;
	protected CsXMsgRqstSchemaXsdElementListEditor javafxEditorCsXMsgRqstSchemaXsdElementList = null;
	protected CsXMsgRspnSchemaBodyCFLabel javafxLabelCsXMsgRspnSchemaBody = null;
	protected CsXMsgRspnSchemaBodyEditor javafxEditorCsXMsgRspnSchemaBody = null;
	protected CsXMsgRspnSchemaUsingCFLabel javafxLabelCsXMsgRspnSchemaUsing = null;
	protected CsXMsgRspnSchemaUsingEditor javafxEditorCsXMsgRspnSchemaUsing = null;
	protected CsXMsgRspnSchemaWireParsersCFLabel javafxLabelCsXMsgRspnSchemaWireParsers = null;
	protected CsXMsgRspnSchemaWireParsersEditor javafxEditorCsXMsgRspnSchemaWireParsers = null;
	protected CsXMsgRspnSchemaXsdElementListCFLabel javafxLabelCsXMsgRspnSchemaXsdElementList = null;
	protected CsXMsgRspnSchemaXsdElementListEditor javafxEditorCsXMsgRspnSchemaXsdElementList = null;
	protected CsXMsgRspnSchemaXsdSpecCFLabel javafxLabelCsXMsgRspnSchemaXsdSpec = null;
	protected CsXMsgRspnSchemaXsdSpecEditor javafxEditorCsXMsgRspnSchemaXsdSpec = null;

	public CFBamJavaFXSchemaDefAttrPane( ICFFormManager formManager, ICFBamJavaFXSchema argSchema, ICFBamSchemaDefObj argFocus ) {
		super();
		Control ctrl;
		CFLabel label;
		CFReferenceEditor reference;
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
		setJavaFXFocusAsSchemaDef( argFocus );
		setPadding( new Insets(5) );
		setHgap( 5 );
		setVgap( 5 );
		setAlignment( Pos.CENTER );
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth( 100 );
		getColumnConstraints().addAll( column1 );
		int gridRow = 0;
		label = getJavaFXLabelId();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorId();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDbName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDbName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelShortName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorShortName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelLabel();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorLabel();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelShortDescription();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorShortDescription();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelDescription();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorDescription();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelPublicLicenseName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorPublicLicenseName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelPublicLicenseText();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorPublicLicenseText();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelImplementationLicenseName();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorImplementationLicenseName();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelImplementationLicenseText();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorImplementationLicenseText();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCopyrightPeriod();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCopyrightPeriod();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCopyrightHolder();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCopyrightHolder();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelAuthorEMail();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorAuthorEMail();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelProjectURL();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorProjectURL();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelPublishURI();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorPublishURI();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSchemaObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSchemaObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJSchemaObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJSchemaObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJDb2LUWSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJDb2LUWSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJDb2LUWSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJDb2LUWSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJDb2LUWSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJDb2LUWSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMSSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMSSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMSSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMSSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMSSqlSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMSSqlSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMySqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMySqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMySqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMySqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJMySqlSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJMySqlSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJOracleSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJOracleSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJOracleSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJOracleSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJOracleSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJOracleSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJPgSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJPgSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJPgSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJPgSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJPgSqlSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJPgSqlSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJRamSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJRamSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJRamSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJRamSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJRamSchemaObjImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJRamSchemaObjImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgSchemaImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgSchemaImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgSchemaFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgSchemaFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgClientSchemaImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgClientSchemaImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgClientSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgClientSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstSchemaImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstSchemaImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRqstSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRqstSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnSchemaImport();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnSchemaImport();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelJXMsgRspnSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorJXMsgRspnSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSchemaObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSchemaObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppSchemaObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppSchemaObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppDb2LUWSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppDb2LUWSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppDb2LUWSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppDb2LUWSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppDb2LUWSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppDb2LUWSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMSSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMSSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMSSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMSSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMSSqlSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMSSqlSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMySqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMySqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMySqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMySqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppMySqlSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppMySqlSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppOracleSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppOracleSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppOracleSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppOracleSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppOracleSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppOracleSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppPgSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppPgSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppPgSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppPgSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppPgSqlSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppPgSqlSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppRamSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppRamSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppRamSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppRamSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppRamSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppRamSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgSchemaFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgSchemaFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgClientSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgClientSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgClientSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgClientSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRqstSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRqstSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCppXMsgRspnSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCppXMsgRspnSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSchemaObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSchemaObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppSchemaObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppSchemaObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppDb2LUWSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppDb2LUWSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppDb2LUWSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppDb2LUWSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppDb2LUWSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppDb2LUWSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMSSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMSSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMSSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMSSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMSSqlSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMSSqlSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMySqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMySqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMySqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMySqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppMySqlSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppMySqlSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppOracleSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppOracleSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppOracleSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppOracleSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppOracleSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppOracleSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppPgSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppPgSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppPgSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppPgSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppPgSqlSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppPgSqlSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppRamSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppRamSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppRamSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppRamSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppRamSchemaObjInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppRamSchemaObjInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgSchemaFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgSchemaFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgClientSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgClientSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgClientSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgClientSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRqstSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRqstSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnSchemaInclude();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnSchemaInclude();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelHppXMsgRspnSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorHppXMsgRspnSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSchemaObjInterface();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSchemaObjInterface();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsSchemaObjImplementation();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsSchemaObjImplementation();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsDb2LUWSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsDb2LUWSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsDb2LUWSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsDb2LUWSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsDb2LUWSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsDb2LUWSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMSSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMSSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMSSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMSSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMSSqlSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMSSqlSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMySqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMySqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMySqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMySqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsMySqlSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsMySqlSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsOracleSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsOracleSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsOracleSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsOracleSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsOracleSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsOracleSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsPgSqlSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsPgSqlSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsPgSqlSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsPgSqlSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsPgSqlSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsPgSqlSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsRamSchemaObjMembers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsRamSchemaObjMembers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsRamSchemaObjImpl();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsRamSchemaObjImpl();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsRamSchemaObjUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsRamSchemaObjUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgSchemaUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgSchemaUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgSchemaFormatters();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgSchemaFormatters();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgClientSchemaUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgClientSchemaUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgClientSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgClientSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstSchemaUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstSchemaUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRqstSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRqstSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnSchemaBody();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnSchemaBody();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnSchemaUsing();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnSchemaUsing();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnSchemaWireParsers();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnSchemaWireParsers();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnSchemaXsdElementList();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnSchemaXsdElementList();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		label = getJavaFXLabelCsXMsgRspnSchemaXsdSpec();
		setHalignment( label, HPos.LEFT );
		setValignment( label, VPos.BOTTOM );
		add( label, 0, gridRow );
		gridRow ++;

		ctrl = getJavaFXEditorCsXMsgRspnSchemaXsdSpec();
		setHalignment( ctrl, HPos.LEFT );
		add( ctrl, 0, gridRow );
		gridRow ++;

		populateFields();
		adjustComponentEnableStates();
		javafxIsInitializing = false;
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
		if( ( value == null ) || ( value instanceof ICFBamSchemaDefObj ) ) {
			super.setJavaFXFocus( value );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				S_ProcName,
				"value",
				value,
				"ICFBamSchemaDefObj" );
		}
		populateFields();
		adjustComponentEnableStates();
	}

	public ICFBamSchemaDefObj getJavaFXFocusAsSchemaDef() {
		return( (ICFBamSchemaDefObj)getJavaFXFocus() );
	}

	public void setJavaFXFocusAsSchemaDef( ICFBamSchemaDefObj value ) {
		setJavaFXFocus( value );
	}

	public ICFBamSchemaDefObj getEffJavaFXFocus() {
		ICFBamSchemaDefObj eff = (ICFBamSchemaDefObj)getJavaFXFocus();
		if( eff != null ) {
			if( null != eff.getEdit() ) {
				eff = (ICFBamSchemaDefObj)eff.getEdit();
			}
		}
		return( eff );
	}

	public IdCFLabel getJavaFXLabelId() {
		if( javafxLabelId == null ) {
			javafxLabelId = new IdCFLabel();
		}
		return( javafxLabelId );
	}

	public void setJavaFXLabelId( IdCFLabel value ) {
		javafxLabelId = value;
	}

	public IdEditor getJavaFXEditorId() {
		if( javafxEditorId == null ) {
			javafxEditorId = new IdEditor();
		}
		return( javafxEditorId );
	}

	public void setJavaFXEditorId( IdEditor value ) {
		javafxEditorId = value;
	}

	public NameCFLabel getJavaFXLabelName() {
		if( javafxLabelName == null ) {
			javafxLabelName = new NameCFLabel();
		}
		return( javafxLabelName );
	}

	public void setJavaFXLabelName( NameCFLabel value ) {
		javafxLabelName = value;
	}

	public NameEditor getJavaFXEditorName() {
		if( javafxEditorName == null ) {
			javafxEditorName = new NameEditor();
		}
		return( javafxEditorName );
	}

	public void setJavaFXEditorName( NameEditor value ) {
		javafxEditorName = value;
	}

	public DbNameCFLabel getJavaFXLabelDbName() {
		if( javafxLabelDbName == null ) {
			javafxLabelDbName = new DbNameCFLabel();
		}
		return( javafxLabelDbName );
	}

	public void setJavaFXLabelDbName( DbNameCFLabel value ) {
		javafxLabelDbName = value;
	}

	public DbNameEditor getJavaFXEditorDbName() {
		if( javafxEditorDbName == null ) {
			javafxEditorDbName = new DbNameEditor();
		}
		return( javafxEditorDbName );
	}

	public void setJavaFXEditorDbName( DbNameEditor value ) {
		javafxEditorDbName = value;
	}

	public ShortNameCFLabel getJavaFXLabelShortName() {
		if( javafxLabelShortName == null ) {
			javafxLabelShortName = new ShortNameCFLabel();
		}
		return( javafxLabelShortName );
	}

	public void setJavaFXLabelShortName( ShortNameCFLabel value ) {
		javafxLabelShortName = value;
	}

	public ShortNameEditor getJavaFXEditorShortName() {
		if( javafxEditorShortName == null ) {
			javafxEditorShortName = new ShortNameEditor();
		}
		return( javafxEditorShortName );
	}

	public void setJavaFXEditorShortName( ShortNameEditor value ) {
		javafxEditorShortName = value;
	}

	public LabelCFLabel getJavaFXLabelLabel() {
		if( javafxLabelLabel == null ) {
			javafxLabelLabel = new LabelCFLabel();
		}
		return( javafxLabelLabel );
	}

	public void setJavaFXLabelLabel( LabelCFLabel value ) {
		javafxLabelLabel = value;
	}

	public LabelEditor getJavaFXEditorLabel() {
		if( javafxEditorLabel == null ) {
			javafxEditorLabel = new LabelEditor();
		}
		return( javafxEditorLabel );
	}

	public void setJavaFXEditorLabel( LabelEditor value ) {
		javafxEditorLabel = value;
	}

	public ShortDescriptionCFLabel getJavaFXLabelShortDescription() {
		if( javafxLabelShortDescription == null ) {
			javafxLabelShortDescription = new ShortDescriptionCFLabel();
		}
		return( javafxLabelShortDescription );
	}

	public void setJavaFXLabelShortDescription( ShortDescriptionCFLabel value ) {
		javafxLabelShortDescription = value;
	}

	public ShortDescriptionEditor getJavaFXEditorShortDescription() {
		if( javafxEditorShortDescription == null ) {
			javafxEditorShortDescription = new ShortDescriptionEditor();
		}
		return( javafxEditorShortDescription );
	}

	public void setJavaFXEditorShortDescription( ShortDescriptionEditor value ) {
		javafxEditorShortDescription = value;
	}

	public DescriptionCFLabel getJavaFXLabelDescription() {
		if( javafxLabelDescription == null ) {
			javafxLabelDescription = new DescriptionCFLabel();
		}
		return( javafxLabelDescription );
	}

	public void setJavaFXLabelDescription( DescriptionCFLabel value ) {
		javafxLabelDescription = value;
	}

	public DescriptionEditor getJavaFXEditorDescription() {
		if( javafxEditorDescription == null ) {
			javafxEditorDescription = new DescriptionEditor();
		}
		return( javafxEditorDescription );
	}

	public void setJavaFXEditorDescription( DescriptionEditor value ) {
		javafxEditorDescription = value;
	}

	public PublicLicenseNameCFLabel getJavaFXLabelPublicLicenseName() {
		if( javafxLabelPublicLicenseName == null ) {
			javafxLabelPublicLicenseName = new PublicLicenseNameCFLabel();
		}
		return( javafxLabelPublicLicenseName );
	}

	public void setJavaFXLabelPublicLicenseName( PublicLicenseNameCFLabel value ) {
		javafxLabelPublicLicenseName = value;
	}

	public PublicLicenseNameEditor getJavaFXEditorPublicLicenseName() {
		if( javafxEditorPublicLicenseName == null ) {
			javafxEditorPublicLicenseName = new PublicLicenseNameEditor();
		}
		return( javafxEditorPublicLicenseName );
	}

	public void setJavaFXEditorPublicLicenseName( PublicLicenseNameEditor value ) {
		javafxEditorPublicLicenseName = value;
	}

	public PublicLicenseTextCFLabel getJavaFXLabelPublicLicenseText() {
		if( javafxLabelPublicLicenseText == null ) {
			javafxLabelPublicLicenseText = new PublicLicenseTextCFLabel();
		}
		return( javafxLabelPublicLicenseText );
	}

	public void setJavaFXLabelPublicLicenseText( PublicLicenseTextCFLabel value ) {
		javafxLabelPublicLicenseText = value;
	}

	public PublicLicenseTextEditor getJavaFXEditorPublicLicenseText() {
		if( javafxEditorPublicLicenseText == null ) {
			javafxEditorPublicLicenseText = new PublicLicenseTextEditor();
		}
		return( javafxEditorPublicLicenseText );
	}

	public void setJavaFXEditorPublicLicenseText( PublicLicenseTextEditor value ) {
		javafxEditorPublicLicenseText = value;
	}

	public ImplementationLicenseNameCFLabel getJavaFXLabelImplementationLicenseName() {
		if( javafxLabelImplementationLicenseName == null ) {
			javafxLabelImplementationLicenseName = new ImplementationLicenseNameCFLabel();
		}
		return( javafxLabelImplementationLicenseName );
	}

	public void setJavaFXLabelImplementationLicenseName( ImplementationLicenseNameCFLabel value ) {
		javafxLabelImplementationLicenseName = value;
	}

	public ImplementationLicenseNameEditor getJavaFXEditorImplementationLicenseName() {
		if( javafxEditorImplementationLicenseName == null ) {
			javafxEditorImplementationLicenseName = new ImplementationLicenseNameEditor();
		}
		return( javafxEditorImplementationLicenseName );
	}

	public void setJavaFXEditorImplementationLicenseName( ImplementationLicenseNameEditor value ) {
		javafxEditorImplementationLicenseName = value;
	}

	public ImplementationLicenseTextCFLabel getJavaFXLabelImplementationLicenseText() {
		if( javafxLabelImplementationLicenseText == null ) {
			javafxLabelImplementationLicenseText = new ImplementationLicenseTextCFLabel();
		}
		return( javafxLabelImplementationLicenseText );
	}

	public void setJavaFXLabelImplementationLicenseText( ImplementationLicenseTextCFLabel value ) {
		javafxLabelImplementationLicenseText = value;
	}

	public ImplementationLicenseTextEditor getJavaFXEditorImplementationLicenseText() {
		if( javafxEditorImplementationLicenseText == null ) {
			javafxEditorImplementationLicenseText = new ImplementationLicenseTextEditor();
		}
		return( javafxEditorImplementationLicenseText );
	}

	public void setJavaFXEditorImplementationLicenseText( ImplementationLicenseTextEditor value ) {
		javafxEditorImplementationLicenseText = value;
	}

	public CopyrightPeriodCFLabel getJavaFXLabelCopyrightPeriod() {
		if( javafxLabelCopyrightPeriod == null ) {
			javafxLabelCopyrightPeriod = new CopyrightPeriodCFLabel();
		}
		return( javafxLabelCopyrightPeriod );
	}

	public void setJavaFXLabelCopyrightPeriod( CopyrightPeriodCFLabel value ) {
		javafxLabelCopyrightPeriod = value;
	}

	public CopyrightPeriodEditor getJavaFXEditorCopyrightPeriod() {
		if( javafxEditorCopyrightPeriod == null ) {
			javafxEditorCopyrightPeriod = new CopyrightPeriodEditor();
		}
		return( javafxEditorCopyrightPeriod );
	}

	public void setJavaFXEditorCopyrightPeriod( CopyrightPeriodEditor value ) {
		javafxEditorCopyrightPeriod = value;
	}

	public CopyrightHolderCFLabel getJavaFXLabelCopyrightHolder() {
		if( javafxLabelCopyrightHolder == null ) {
			javafxLabelCopyrightHolder = new CopyrightHolderCFLabel();
		}
		return( javafxLabelCopyrightHolder );
	}

	public void setJavaFXLabelCopyrightHolder( CopyrightHolderCFLabel value ) {
		javafxLabelCopyrightHolder = value;
	}

	public CopyrightHolderEditor getJavaFXEditorCopyrightHolder() {
		if( javafxEditorCopyrightHolder == null ) {
			javafxEditorCopyrightHolder = new CopyrightHolderEditor();
		}
		return( javafxEditorCopyrightHolder );
	}

	public void setJavaFXEditorCopyrightHolder( CopyrightHolderEditor value ) {
		javafxEditorCopyrightHolder = value;
	}

	public AuthorEMailCFLabel getJavaFXLabelAuthorEMail() {
		if( javafxLabelAuthorEMail == null ) {
			javafxLabelAuthorEMail = new AuthorEMailCFLabel();
		}
		return( javafxLabelAuthorEMail );
	}

	public void setJavaFXLabelAuthorEMail( AuthorEMailCFLabel value ) {
		javafxLabelAuthorEMail = value;
	}

	public AuthorEMailEditor getJavaFXEditorAuthorEMail() {
		if( javafxEditorAuthorEMail == null ) {
			javafxEditorAuthorEMail = new AuthorEMailEditor();
		}
		return( javafxEditorAuthorEMail );
	}

	public void setJavaFXEditorAuthorEMail( AuthorEMailEditor value ) {
		javafxEditorAuthorEMail = value;
	}

	public ProjectURLCFLabel getJavaFXLabelProjectURL() {
		if( javafxLabelProjectURL == null ) {
			javafxLabelProjectURL = new ProjectURLCFLabel();
		}
		return( javafxLabelProjectURL );
	}

	public void setJavaFXLabelProjectURL( ProjectURLCFLabel value ) {
		javafxLabelProjectURL = value;
	}

	public ProjectURLEditor getJavaFXEditorProjectURL() {
		if( javafxEditorProjectURL == null ) {
			javafxEditorProjectURL = new ProjectURLEditor();
		}
		return( javafxEditorProjectURL );
	}

	public void setJavaFXEditorProjectURL( ProjectURLEditor value ) {
		javafxEditorProjectURL = value;
	}

	public PublishURICFLabel getJavaFXLabelPublishURI() {
		if( javafxLabelPublishURI == null ) {
			javafxLabelPublishURI = new PublishURICFLabel();
		}
		return( javafxLabelPublishURI );
	}

	public void setJavaFXLabelPublishURI( PublishURICFLabel value ) {
		javafxLabelPublishURI = value;
	}

	public PublishURIEditor getJavaFXEditorPublishURI() {
		if( javafxEditorPublishURI == null ) {
			javafxEditorPublishURI = new PublishURIEditor();
		}
		return( javafxEditorPublishURI );
	}

	public void setJavaFXEditorPublishURI( PublishURIEditor value ) {
		javafxEditorPublishURI = value;
	}

	public JSchemaObjImportCFLabel getJavaFXLabelJSchemaObjImport() {
		if( javafxLabelJSchemaObjImport == null ) {
			javafxLabelJSchemaObjImport = new JSchemaObjImportCFLabel();
		}
		return( javafxLabelJSchemaObjImport );
	}

	public void setJavaFXLabelJSchemaObjImport( JSchemaObjImportCFLabel value ) {
		javafxLabelJSchemaObjImport = value;
	}

	public JSchemaObjImportEditor getJavaFXEditorJSchemaObjImport() {
		if( javafxEditorJSchemaObjImport == null ) {
			javafxEditorJSchemaObjImport = new JSchemaObjImportEditor();
		}
		return( javafxEditorJSchemaObjImport );
	}

	public void setJavaFXEditorJSchemaObjImport( JSchemaObjImportEditor value ) {
		javafxEditorJSchemaObjImport = value;
	}

	public JSchemaObjInterfaceCFLabel getJavaFXLabelJSchemaObjInterface() {
		if( javafxLabelJSchemaObjInterface == null ) {
			javafxLabelJSchemaObjInterface = new JSchemaObjInterfaceCFLabel();
		}
		return( javafxLabelJSchemaObjInterface );
	}

	public void setJavaFXLabelJSchemaObjInterface( JSchemaObjInterfaceCFLabel value ) {
		javafxLabelJSchemaObjInterface = value;
	}

	public JSchemaObjInterfaceEditor getJavaFXEditorJSchemaObjInterface() {
		if( javafxEditorJSchemaObjInterface == null ) {
			javafxEditorJSchemaObjInterface = new JSchemaObjInterfaceEditor();
		}
		return( javafxEditorJSchemaObjInterface );
	}

	public void setJavaFXEditorJSchemaObjInterface( JSchemaObjInterfaceEditor value ) {
		javafxEditorJSchemaObjInterface = value;
	}

	public JSchemaObjMembersCFLabel getJavaFXLabelJSchemaObjMembers() {
		if( javafxLabelJSchemaObjMembers == null ) {
			javafxLabelJSchemaObjMembers = new JSchemaObjMembersCFLabel();
		}
		return( javafxLabelJSchemaObjMembers );
	}

	public void setJavaFXLabelJSchemaObjMembers( JSchemaObjMembersCFLabel value ) {
		javafxLabelJSchemaObjMembers = value;
	}

	public JSchemaObjMembersEditor getJavaFXEditorJSchemaObjMembers() {
		if( javafxEditorJSchemaObjMembers == null ) {
			javafxEditorJSchemaObjMembers = new JSchemaObjMembersEditor();
		}
		return( javafxEditorJSchemaObjMembers );
	}

	public void setJavaFXEditorJSchemaObjMembers( JSchemaObjMembersEditor value ) {
		javafxEditorJSchemaObjMembers = value;
	}

	public JSchemaObjImplementationCFLabel getJavaFXLabelJSchemaObjImplementation() {
		if( javafxLabelJSchemaObjImplementation == null ) {
			javafxLabelJSchemaObjImplementation = new JSchemaObjImplementationCFLabel();
		}
		return( javafxLabelJSchemaObjImplementation );
	}

	public void setJavaFXLabelJSchemaObjImplementation( JSchemaObjImplementationCFLabel value ) {
		javafxLabelJSchemaObjImplementation = value;
	}

	public JSchemaObjImplementationEditor getJavaFXEditorJSchemaObjImplementation() {
		if( javafxEditorJSchemaObjImplementation == null ) {
			javafxEditorJSchemaObjImplementation = new JSchemaObjImplementationEditor();
		}
		return( javafxEditorJSchemaObjImplementation );
	}

	public void setJavaFXEditorJSchemaObjImplementation( JSchemaObjImplementationEditor value ) {
		javafxEditorJSchemaObjImplementation = value;
	}

	public JDb2LUWSchemaObjMembersCFLabel getJavaFXLabelJDb2LUWSchemaObjMembers() {
		if( javafxLabelJDb2LUWSchemaObjMembers == null ) {
			javafxLabelJDb2LUWSchemaObjMembers = new JDb2LUWSchemaObjMembersCFLabel();
		}
		return( javafxLabelJDb2LUWSchemaObjMembers );
	}

	public void setJavaFXLabelJDb2LUWSchemaObjMembers( JDb2LUWSchemaObjMembersCFLabel value ) {
		javafxLabelJDb2LUWSchemaObjMembers = value;
	}

	public JDb2LUWSchemaObjMembersEditor getJavaFXEditorJDb2LUWSchemaObjMembers() {
		if( javafxEditorJDb2LUWSchemaObjMembers == null ) {
			javafxEditorJDb2LUWSchemaObjMembers = new JDb2LUWSchemaObjMembersEditor();
		}
		return( javafxEditorJDb2LUWSchemaObjMembers );
	}

	public void setJavaFXEditorJDb2LUWSchemaObjMembers( JDb2LUWSchemaObjMembersEditor value ) {
		javafxEditorJDb2LUWSchemaObjMembers = value;
	}

	public JDb2LUWSchemaObjImplCFLabel getJavaFXLabelJDb2LUWSchemaObjImpl() {
		if( javafxLabelJDb2LUWSchemaObjImpl == null ) {
			javafxLabelJDb2LUWSchemaObjImpl = new JDb2LUWSchemaObjImplCFLabel();
		}
		return( javafxLabelJDb2LUWSchemaObjImpl );
	}

	public void setJavaFXLabelJDb2LUWSchemaObjImpl( JDb2LUWSchemaObjImplCFLabel value ) {
		javafxLabelJDb2LUWSchemaObjImpl = value;
	}

	public JDb2LUWSchemaObjImplEditor getJavaFXEditorJDb2LUWSchemaObjImpl() {
		if( javafxEditorJDb2LUWSchemaObjImpl == null ) {
			javafxEditorJDb2LUWSchemaObjImpl = new JDb2LUWSchemaObjImplEditor();
		}
		return( javafxEditorJDb2LUWSchemaObjImpl );
	}

	public void setJavaFXEditorJDb2LUWSchemaObjImpl( JDb2LUWSchemaObjImplEditor value ) {
		javafxEditorJDb2LUWSchemaObjImpl = value;
	}

	public JDb2LUWSchemaObjImportCFLabel getJavaFXLabelJDb2LUWSchemaObjImport() {
		if( javafxLabelJDb2LUWSchemaObjImport == null ) {
			javafxLabelJDb2LUWSchemaObjImport = new JDb2LUWSchemaObjImportCFLabel();
		}
		return( javafxLabelJDb2LUWSchemaObjImport );
	}

	public void setJavaFXLabelJDb2LUWSchemaObjImport( JDb2LUWSchemaObjImportCFLabel value ) {
		javafxLabelJDb2LUWSchemaObjImport = value;
	}

	public JDb2LUWSchemaObjImportEditor getJavaFXEditorJDb2LUWSchemaObjImport() {
		if( javafxEditorJDb2LUWSchemaObjImport == null ) {
			javafxEditorJDb2LUWSchemaObjImport = new JDb2LUWSchemaObjImportEditor();
		}
		return( javafxEditorJDb2LUWSchemaObjImport );
	}

	public void setJavaFXEditorJDb2LUWSchemaObjImport( JDb2LUWSchemaObjImportEditor value ) {
		javafxEditorJDb2LUWSchemaObjImport = value;
	}

	public JMSSqlSchemaObjMembersCFLabel getJavaFXLabelJMSSqlSchemaObjMembers() {
		if( javafxLabelJMSSqlSchemaObjMembers == null ) {
			javafxLabelJMSSqlSchemaObjMembers = new JMSSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelJMSSqlSchemaObjMembers );
	}

	public void setJavaFXLabelJMSSqlSchemaObjMembers( JMSSqlSchemaObjMembersCFLabel value ) {
		javafxLabelJMSSqlSchemaObjMembers = value;
	}

	public JMSSqlSchemaObjMembersEditor getJavaFXEditorJMSSqlSchemaObjMembers() {
		if( javafxEditorJMSSqlSchemaObjMembers == null ) {
			javafxEditorJMSSqlSchemaObjMembers = new JMSSqlSchemaObjMembersEditor();
		}
		return( javafxEditorJMSSqlSchemaObjMembers );
	}

	public void setJavaFXEditorJMSSqlSchemaObjMembers( JMSSqlSchemaObjMembersEditor value ) {
		javafxEditorJMSSqlSchemaObjMembers = value;
	}

	public JMSSqlSchemaObjImplCFLabel getJavaFXLabelJMSSqlSchemaObjImpl() {
		if( javafxLabelJMSSqlSchemaObjImpl == null ) {
			javafxLabelJMSSqlSchemaObjImpl = new JMSSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelJMSSqlSchemaObjImpl );
	}

	public void setJavaFXLabelJMSSqlSchemaObjImpl( JMSSqlSchemaObjImplCFLabel value ) {
		javafxLabelJMSSqlSchemaObjImpl = value;
	}

	public JMSSqlSchemaObjImplEditor getJavaFXEditorJMSSqlSchemaObjImpl() {
		if( javafxEditorJMSSqlSchemaObjImpl == null ) {
			javafxEditorJMSSqlSchemaObjImpl = new JMSSqlSchemaObjImplEditor();
		}
		return( javafxEditorJMSSqlSchemaObjImpl );
	}

	public void setJavaFXEditorJMSSqlSchemaObjImpl( JMSSqlSchemaObjImplEditor value ) {
		javafxEditorJMSSqlSchemaObjImpl = value;
	}

	public JMSSqlSchemaObjImportCFLabel getJavaFXLabelJMSSqlSchemaObjImport() {
		if( javafxLabelJMSSqlSchemaObjImport == null ) {
			javafxLabelJMSSqlSchemaObjImport = new JMSSqlSchemaObjImportCFLabel();
		}
		return( javafxLabelJMSSqlSchemaObjImport );
	}

	public void setJavaFXLabelJMSSqlSchemaObjImport( JMSSqlSchemaObjImportCFLabel value ) {
		javafxLabelJMSSqlSchemaObjImport = value;
	}

	public JMSSqlSchemaObjImportEditor getJavaFXEditorJMSSqlSchemaObjImport() {
		if( javafxEditorJMSSqlSchemaObjImport == null ) {
			javafxEditorJMSSqlSchemaObjImport = new JMSSqlSchemaObjImportEditor();
		}
		return( javafxEditorJMSSqlSchemaObjImport );
	}

	public void setJavaFXEditorJMSSqlSchemaObjImport( JMSSqlSchemaObjImportEditor value ) {
		javafxEditorJMSSqlSchemaObjImport = value;
	}

	public JMySqlSchemaObjMembersCFLabel getJavaFXLabelJMySqlSchemaObjMembers() {
		if( javafxLabelJMySqlSchemaObjMembers == null ) {
			javafxLabelJMySqlSchemaObjMembers = new JMySqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelJMySqlSchemaObjMembers );
	}

	public void setJavaFXLabelJMySqlSchemaObjMembers( JMySqlSchemaObjMembersCFLabel value ) {
		javafxLabelJMySqlSchemaObjMembers = value;
	}

	public JMySqlSchemaObjMembersEditor getJavaFXEditorJMySqlSchemaObjMembers() {
		if( javafxEditorJMySqlSchemaObjMembers == null ) {
			javafxEditorJMySqlSchemaObjMembers = new JMySqlSchemaObjMembersEditor();
		}
		return( javafxEditorJMySqlSchemaObjMembers );
	}

	public void setJavaFXEditorJMySqlSchemaObjMembers( JMySqlSchemaObjMembersEditor value ) {
		javafxEditorJMySqlSchemaObjMembers = value;
	}

	public JMySqlSchemaObjImplCFLabel getJavaFXLabelJMySqlSchemaObjImpl() {
		if( javafxLabelJMySqlSchemaObjImpl == null ) {
			javafxLabelJMySqlSchemaObjImpl = new JMySqlSchemaObjImplCFLabel();
		}
		return( javafxLabelJMySqlSchemaObjImpl );
	}

	public void setJavaFXLabelJMySqlSchemaObjImpl( JMySqlSchemaObjImplCFLabel value ) {
		javafxLabelJMySqlSchemaObjImpl = value;
	}

	public JMySqlSchemaObjImplEditor getJavaFXEditorJMySqlSchemaObjImpl() {
		if( javafxEditorJMySqlSchemaObjImpl == null ) {
			javafxEditorJMySqlSchemaObjImpl = new JMySqlSchemaObjImplEditor();
		}
		return( javafxEditorJMySqlSchemaObjImpl );
	}

	public void setJavaFXEditorJMySqlSchemaObjImpl( JMySqlSchemaObjImplEditor value ) {
		javafxEditorJMySqlSchemaObjImpl = value;
	}

	public JMySqlSchemaObjImportCFLabel getJavaFXLabelJMySqlSchemaObjImport() {
		if( javafxLabelJMySqlSchemaObjImport == null ) {
			javafxLabelJMySqlSchemaObjImport = new JMySqlSchemaObjImportCFLabel();
		}
		return( javafxLabelJMySqlSchemaObjImport );
	}

	public void setJavaFXLabelJMySqlSchemaObjImport( JMySqlSchemaObjImportCFLabel value ) {
		javafxLabelJMySqlSchemaObjImport = value;
	}

	public JMySqlSchemaObjImportEditor getJavaFXEditorJMySqlSchemaObjImport() {
		if( javafxEditorJMySqlSchemaObjImport == null ) {
			javafxEditorJMySqlSchemaObjImport = new JMySqlSchemaObjImportEditor();
		}
		return( javafxEditorJMySqlSchemaObjImport );
	}

	public void setJavaFXEditorJMySqlSchemaObjImport( JMySqlSchemaObjImportEditor value ) {
		javafxEditorJMySqlSchemaObjImport = value;
	}

	public JOracleSchemaObjMembersCFLabel getJavaFXLabelJOracleSchemaObjMembers() {
		if( javafxLabelJOracleSchemaObjMembers == null ) {
			javafxLabelJOracleSchemaObjMembers = new JOracleSchemaObjMembersCFLabel();
		}
		return( javafxLabelJOracleSchemaObjMembers );
	}

	public void setJavaFXLabelJOracleSchemaObjMembers( JOracleSchemaObjMembersCFLabel value ) {
		javafxLabelJOracleSchemaObjMembers = value;
	}

	public JOracleSchemaObjMembersEditor getJavaFXEditorJOracleSchemaObjMembers() {
		if( javafxEditorJOracleSchemaObjMembers == null ) {
			javafxEditorJOracleSchemaObjMembers = new JOracleSchemaObjMembersEditor();
		}
		return( javafxEditorJOracleSchemaObjMembers );
	}

	public void setJavaFXEditorJOracleSchemaObjMembers( JOracleSchemaObjMembersEditor value ) {
		javafxEditorJOracleSchemaObjMembers = value;
	}

	public JOracleSchemaObjImplCFLabel getJavaFXLabelJOracleSchemaObjImpl() {
		if( javafxLabelJOracleSchemaObjImpl == null ) {
			javafxLabelJOracleSchemaObjImpl = new JOracleSchemaObjImplCFLabel();
		}
		return( javafxLabelJOracleSchemaObjImpl );
	}

	public void setJavaFXLabelJOracleSchemaObjImpl( JOracleSchemaObjImplCFLabel value ) {
		javafxLabelJOracleSchemaObjImpl = value;
	}

	public JOracleSchemaObjImplEditor getJavaFXEditorJOracleSchemaObjImpl() {
		if( javafxEditorJOracleSchemaObjImpl == null ) {
			javafxEditorJOracleSchemaObjImpl = new JOracleSchemaObjImplEditor();
		}
		return( javafxEditorJOracleSchemaObjImpl );
	}

	public void setJavaFXEditorJOracleSchemaObjImpl( JOracleSchemaObjImplEditor value ) {
		javafxEditorJOracleSchemaObjImpl = value;
	}

	public JOracleSchemaObjImportCFLabel getJavaFXLabelJOracleSchemaObjImport() {
		if( javafxLabelJOracleSchemaObjImport == null ) {
			javafxLabelJOracleSchemaObjImport = new JOracleSchemaObjImportCFLabel();
		}
		return( javafxLabelJOracleSchemaObjImport );
	}

	public void setJavaFXLabelJOracleSchemaObjImport( JOracleSchemaObjImportCFLabel value ) {
		javafxLabelJOracleSchemaObjImport = value;
	}

	public JOracleSchemaObjImportEditor getJavaFXEditorJOracleSchemaObjImport() {
		if( javafxEditorJOracleSchemaObjImport == null ) {
			javafxEditorJOracleSchemaObjImport = new JOracleSchemaObjImportEditor();
		}
		return( javafxEditorJOracleSchemaObjImport );
	}

	public void setJavaFXEditorJOracleSchemaObjImport( JOracleSchemaObjImportEditor value ) {
		javafxEditorJOracleSchemaObjImport = value;
	}

	public JPgSqlSchemaObjMembersCFLabel getJavaFXLabelJPgSqlSchemaObjMembers() {
		if( javafxLabelJPgSqlSchemaObjMembers == null ) {
			javafxLabelJPgSqlSchemaObjMembers = new JPgSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelJPgSqlSchemaObjMembers );
	}

	public void setJavaFXLabelJPgSqlSchemaObjMembers( JPgSqlSchemaObjMembersCFLabel value ) {
		javafxLabelJPgSqlSchemaObjMembers = value;
	}

	public JPgSqlSchemaObjMembersEditor getJavaFXEditorJPgSqlSchemaObjMembers() {
		if( javafxEditorJPgSqlSchemaObjMembers == null ) {
			javafxEditorJPgSqlSchemaObjMembers = new JPgSqlSchemaObjMembersEditor();
		}
		return( javafxEditorJPgSqlSchemaObjMembers );
	}

	public void setJavaFXEditorJPgSqlSchemaObjMembers( JPgSqlSchemaObjMembersEditor value ) {
		javafxEditorJPgSqlSchemaObjMembers = value;
	}

	public JPgSqlSchemaObjImplCFLabel getJavaFXLabelJPgSqlSchemaObjImpl() {
		if( javafxLabelJPgSqlSchemaObjImpl == null ) {
			javafxLabelJPgSqlSchemaObjImpl = new JPgSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelJPgSqlSchemaObjImpl );
	}

	public void setJavaFXLabelJPgSqlSchemaObjImpl( JPgSqlSchemaObjImplCFLabel value ) {
		javafxLabelJPgSqlSchemaObjImpl = value;
	}

	public JPgSqlSchemaObjImplEditor getJavaFXEditorJPgSqlSchemaObjImpl() {
		if( javafxEditorJPgSqlSchemaObjImpl == null ) {
			javafxEditorJPgSqlSchemaObjImpl = new JPgSqlSchemaObjImplEditor();
		}
		return( javafxEditorJPgSqlSchemaObjImpl );
	}

	public void setJavaFXEditorJPgSqlSchemaObjImpl( JPgSqlSchemaObjImplEditor value ) {
		javafxEditorJPgSqlSchemaObjImpl = value;
	}

	public JPgSqlSchemaObjImportCFLabel getJavaFXLabelJPgSqlSchemaObjImport() {
		if( javafxLabelJPgSqlSchemaObjImport == null ) {
			javafxLabelJPgSqlSchemaObjImport = new JPgSqlSchemaObjImportCFLabel();
		}
		return( javafxLabelJPgSqlSchemaObjImport );
	}

	public void setJavaFXLabelJPgSqlSchemaObjImport( JPgSqlSchemaObjImportCFLabel value ) {
		javafxLabelJPgSqlSchemaObjImport = value;
	}

	public JPgSqlSchemaObjImportEditor getJavaFXEditorJPgSqlSchemaObjImport() {
		if( javafxEditorJPgSqlSchemaObjImport == null ) {
			javafxEditorJPgSqlSchemaObjImport = new JPgSqlSchemaObjImportEditor();
		}
		return( javafxEditorJPgSqlSchemaObjImport );
	}

	public void setJavaFXEditorJPgSqlSchemaObjImport( JPgSqlSchemaObjImportEditor value ) {
		javafxEditorJPgSqlSchemaObjImport = value;
	}

	public JRamSchemaObjMembersCFLabel getJavaFXLabelJRamSchemaObjMembers() {
		if( javafxLabelJRamSchemaObjMembers == null ) {
			javafxLabelJRamSchemaObjMembers = new JRamSchemaObjMembersCFLabel();
		}
		return( javafxLabelJRamSchemaObjMembers );
	}

	public void setJavaFXLabelJRamSchemaObjMembers( JRamSchemaObjMembersCFLabel value ) {
		javafxLabelJRamSchemaObjMembers = value;
	}

	public JRamSchemaObjMembersEditor getJavaFXEditorJRamSchemaObjMembers() {
		if( javafxEditorJRamSchemaObjMembers == null ) {
			javafxEditorJRamSchemaObjMembers = new JRamSchemaObjMembersEditor();
		}
		return( javafxEditorJRamSchemaObjMembers );
	}

	public void setJavaFXEditorJRamSchemaObjMembers( JRamSchemaObjMembersEditor value ) {
		javafxEditorJRamSchemaObjMembers = value;
	}

	public JRamSchemaObjImplCFLabel getJavaFXLabelJRamSchemaObjImpl() {
		if( javafxLabelJRamSchemaObjImpl == null ) {
			javafxLabelJRamSchemaObjImpl = new JRamSchemaObjImplCFLabel();
		}
		return( javafxLabelJRamSchemaObjImpl );
	}

	public void setJavaFXLabelJRamSchemaObjImpl( JRamSchemaObjImplCFLabel value ) {
		javafxLabelJRamSchemaObjImpl = value;
	}

	public JRamSchemaObjImplEditor getJavaFXEditorJRamSchemaObjImpl() {
		if( javafxEditorJRamSchemaObjImpl == null ) {
			javafxEditorJRamSchemaObjImpl = new JRamSchemaObjImplEditor();
		}
		return( javafxEditorJRamSchemaObjImpl );
	}

	public void setJavaFXEditorJRamSchemaObjImpl( JRamSchemaObjImplEditor value ) {
		javafxEditorJRamSchemaObjImpl = value;
	}

	public JRamSchemaObjImportCFLabel getJavaFXLabelJRamSchemaObjImport() {
		if( javafxLabelJRamSchemaObjImport == null ) {
			javafxLabelJRamSchemaObjImport = new JRamSchemaObjImportCFLabel();
		}
		return( javafxLabelJRamSchemaObjImport );
	}

	public void setJavaFXLabelJRamSchemaObjImport( JRamSchemaObjImportCFLabel value ) {
		javafxLabelJRamSchemaObjImport = value;
	}

	public JRamSchemaObjImportEditor getJavaFXEditorJRamSchemaObjImport() {
		if( javafxEditorJRamSchemaObjImport == null ) {
			javafxEditorJRamSchemaObjImport = new JRamSchemaObjImportEditor();
		}
		return( javafxEditorJRamSchemaObjImport );
	}

	public void setJavaFXEditorJRamSchemaObjImport( JRamSchemaObjImportEditor value ) {
		javafxEditorJRamSchemaObjImport = value;
	}

	public JXMsgSchemaImportCFLabel getJavaFXLabelJXMsgSchemaImport() {
		if( javafxLabelJXMsgSchemaImport == null ) {
			javafxLabelJXMsgSchemaImport = new JXMsgSchemaImportCFLabel();
		}
		return( javafxLabelJXMsgSchemaImport );
	}

	public void setJavaFXLabelJXMsgSchemaImport( JXMsgSchemaImportCFLabel value ) {
		javafxLabelJXMsgSchemaImport = value;
	}

	public JXMsgSchemaImportEditor getJavaFXEditorJXMsgSchemaImport() {
		if( javafxEditorJXMsgSchemaImport == null ) {
			javafxEditorJXMsgSchemaImport = new JXMsgSchemaImportEditor();
		}
		return( javafxEditorJXMsgSchemaImport );
	}

	public void setJavaFXEditorJXMsgSchemaImport( JXMsgSchemaImportEditor value ) {
		javafxEditorJXMsgSchemaImport = value;
	}

	public JXMsgSchemaFormattersCFLabel getJavaFXLabelJXMsgSchemaFormatters() {
		if( javafxLabelJXMsgSchemaFormatters == null ) {
			javafxLabelJXMsgSchemaFormatters = new JXMsgSchemaFormattersCFLabel();
		}
		return( javafxLabelJXMsgSchemaFormatters );
	}

	public void setJavaFXLabelJXMsgSchemaFormatters( JXMsgSchemaFormattersCFLabel value ) {
		javafxLabelJXMsgSchemaFormatters = value;
	}

	public JXMsgSchemaFormattersEditor getJavaFXEditorJXMsgSchemaFormatters() {
		if( javafxEditorJXMsgSchemaFormatters == null ) {
			javafxEditorJXMsgSchemaFormatters = new JXMsgSchemaFormattersEditor();
		}
		return( javafxEditorJXMsgSchemaFormatters );
	}

	public void setJavaFXEditorJXMsgSchemaFormatters( JXMsgSchemaFormattersEditor value ) {
		javafxEditorJXMsgSchemaFormatters = value;
	}

	public JXMsgClientSchemaImportCFLabel getJavaFXLabelJXMsgClientSchemaImport() {
		if( javafxLabelJXMsgClientSchemaImport == null ) {
			javafxLabelJXMsgClientSchemaImport = new JXMsgClientSchemaImportCFLabel();
		}
		return( javafxLabelJXMsgClientSchemaImport );
	}

	public void setJavaFXLabelJXMsgClientSchemaImport( JXMsgClientSchemaImportCFLabel value ) {
		javafxLabelJXMsgClientSchemaImport = value;
	}

	public JXMsgClientSchemaImportEditor getJavaFXEditorJXMsgClientSchemaImport() {
		if( javafxEditorJXMsgClientSchemaImport == null ) {
			javafxEditorJXMsgClientSchemaImport = new JXMsgClientSchemaImportEditor();
		}
		return( javafxEditorJXMsgClientSchemaImport );
	}

	public void setJavaFXEditorJXMsgClientSchemaImport( JXMsgClientSchemaImportEditor value ) {
		javafxEditorJXMsgClientSchemaImport = value;
	}

	public JXMsgClientSchemaBodyCFLabel getJavaFXLabelJXMsgClientSchemaBody() {
		if( javafxLabelJXMsgClientSchemaBody == null ) {
			javafxLabelJXMsgClientSchemaBody = new JXMsgClientSchemaBodyCFLabel();
		}
		return( javafxLabelJXMsgClientSchemaBody );
	}

	public void setJavaFXLabelJXMsgClientSchemaBody( JXMsgClientSchemaBodyCFLabel value ) {
		javafxLabelJXMsgClientSchemaBody = value;
	}

	public JXMsgClientSchemaBodyEditor getJavaFXEditorJXMsgClientSchemaBody() {
		if( javafxEditorJXMsgClientSchemaBody == null ) {
			javafxEditorJXMsgClientSchemaBody = new JXMsgClientSchemaBodyEditor();
		}
		return( javafxEditorJXMsgClientSchemaBody );
	}

	public void setJavaFXEditorJXMsgClientSchemaBody( JXMsgClientSchemaBodyEditor value ) {
		javafxEditorJXMsgClientSchemaBody = value;
	}

	public JXMsgRqstSchemaBodyCFLabel getJavaFXLabelJXMsgRqstSchemaBody() {
		if( javafxLabelJXMsgRqstSchemaBody == null ) {
			javafxLabelJXMsgRqstSchemaBody = new JXMsgRqstSchemaBodyCFLabel();
		}
		return( javafxLabelJXMsgRqstSchemaBody );
	}

	public void setJavaFXLabelJXMsgRqstSchemaBody( JXMsgRqstSchemaBodyCFLabel value ) {
		javafxLabelJXMsgRqstSchemaBody = value;
	}

	public JXMsgRqstSchemaBodyEditor getJavaFXEditorJXMsgRqstSchemaBody() {
		if( javafxEditorJXMsgRqstSchemaBody == null ) {
			javafxEditorJXMsgRqstSchemaBody = new JXMsgRqstSchemaBodyEditor();
		}
		return( javafxEditorJXMsgRqstSchemaBody );
	}

	public void setJavaFXEditorJXMsgRqstSchemaBody( JXMsgRqstSchemaBodyEditor value ) {
		javafxEditorJXMsgRqstSchemaBody = value;
	}

	public JXMsgRqstSchemaImportCFLabel getJavaFXLabelJXMsgRqstSchemaImport() {
		if( javafxLabelJXMsgRqstSchemaImport == null ) {
			javafxLabelJXMsgRqstSchemaImport = new JXMsgRqstSchemaImportCFLabel();
		}
		return( javafxLabelJXMsgRqstSchemaImport );
	}

	public void setJavaFXLabelJXMsgRqstSchemaImport( JXMsgRqstSchemaImportCFLabel value ) {
		javafxLabelJXMsgRqstSchemaImport = value;
	}

	public JXMsgRqstSchemaImportEditor getJavaFXEditorJXMsgRqstSchemaImport() {
		if( javafxEditorJXMsgRqstSchemaImport == null ) {
			javafxEditorJXMsgRqstSchemaImport = new JXMsgRqstSchemaImportEditor();
		}
		return( javafxEditorJXMsgRqstSchemaImport );
	}

	public void setJavaFXEditorJXMsgRqstSchemaImport( JXMsgRqstSchemaImportEditor value ) {
		javafxEditorJXMsgRqstSchemaImport = value;
	}

	public JXMsgRqstSchemaWireParsersCFLabel getJavaFXLabelJXMsgRqstSchemaWireParsers() {
		if( javafxLabelJXMsgRqstSchemaWireParsers == null ) {
			javafxLabelJXMsgRqstSchemaWireParsers = new JXMsgRqstSchemaWireParsersCFLabel();
		}
		return( javafxLabelJXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXLabelJXMsgRqstSchemaWireParsers( JXMsgRqstSchemaWireParsersCFLabel value ) {
		javafxLabelJXMsgRqstSchemaWireParsers = value;
	}

	public JXMsgRqstSchemaWireParsersEditor getJavaFXEditorJXMsgRqstSchemaWireParsers() {
		if( javafxEditorJXMsgRqstSchemaWireParsers == null ) {
			javafxEditorJXMsgRqstSchemaWireParsers = new JXMsgRqstSchemaWireParsersEditor();
		}
		return( javafxEditorJXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXEditorJXMsgRqstSchemaWireParsers( JXMsgRqstSchemaWireParsersEditor value ) {
		javafxEditorJXMsgRqstSchemaWireParsers = value;
	}

	public JXMsgRqstSchemaXsdSpecCFLabel getJavaFXLabelJXMsgRqstSchemaXsdSpec() {
		if( javafxLabelJXMsgRqstSchemaXsdSpec == null ) {
			javafxLabelJXMsgRqstSchemaXsdSpec = new JXMsgRqstSchemaXsdSpecCFLabel();
		}
		return( javafxLabelJXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXLabelJXMsgRqstSchemaXsdSpec( JXMsgRqstSchemaXsdSpecCFLabel value ) {
		javafxLabelJXMsgRqstSchemaXsdSpec = value;
	}

	public JXMsgRqstSchemaXsdSpecEditor getJavaFXEditorJXMsgRqstSchemaXsdSpec() {
		if( javafxEditorJXMsgRqstSchemaXsdSpec == null ) {
			javafxEditorJXMsgRqstSchemaXsdSpec = new JXMsgRqstSchemaXsdSpecEditor();
		}
		return( javafxEditorJXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXEditorJXMsgRqstSchemaXsdSpec( JXMsgRqstSchemaXsdSpecEditor value ) {
		javafxEditorJXMsgRqstSchemaXsdSpec = value;
	}

	public JXMsgRqstSchemaXsdElementListCFLabel getJavaFXLabelJXMsgRqstSchemaXsdElementList() {
		if( javafxLabelJXMsgRqstSchemaXsdElementList == null ) {
			javafxLabelJXMsgRqstSchemaXsdElementList = new JXMsgRqstSchemaXsdElementListCFLabel();
		}
		return( javafxLabelJXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXLabelJXMsgRqstSchemaXsdElementList( JXMsgRqstSchemaXsdElementListCFLabel value ) {
		javafxLabelJXMsgRqstSchemaXsdElementList = value;
	}

	public JXMsgRqstSchemaXsdElementListEditor getJavaFXEditorJXMsgRqstSchemaXsdElementList() {
		if( javafxEditorJXMsgRqstSchemaXsdElementList == null ) {
			javafxEditorJXMsgRqstSchemaXsdElementList = new JXMsgRqstSchemaXsdElementListEditor();
		}
		return( javafxEditorJXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXEditorJXMsgRqstSchemaXsdElementList( JXMsgRqstSchemaXsdElementListEditor value ) {
		javafxEditorJXMsgRqstSchemaXsdElementList = value;
	}

	public JXMsgRspnSchemaBodyCFLabel getJavaFXLabelJXMsgRspnSchemaBody() {
		if( javafxLabelJXMsgRspnSchemaBody == null ) {
			javafxLabelJXMsgRspnSchemaBody = new JXMsgRspnSchemaBodyCFLabel();
		}
		return( javafxLabelJXMsgRspnSchemaBody );
	}

	public void setJavaFXLabelJXMsgRspnSchemaBody( JXMsgRspnSchemaBodyCFLabel value ) {
		javafxLabelJXMsgRspnSchemaBody = value;
	}

	public JXMsgRspnSchemaBodyEditor getJavaFXEditorJXMsgRspnSchemaBody() {
		if( javafxEditorJXMsgRspnSchemaBody == null ) {
			javafxEditorJXMsgRspnSchemaBody = new JXMsgRspnSchemaBodyEditor();
		}
		return( javafxEditorJXMsgRspnSchemaBody );
	}

	public void setJavaFXEditorJXMsgRspnSchemaBody( JXMsgRspnSchemaBodyEditor value ) {
		javafxEditorJXMsgRspnSchemaBody = value;
	}

	public JXMsgRspnSchemaImportCFLabel getJavaFXLabelJXMsgRspnSchemaImport() {
		if( javafxLabelJXMsgRspnSchemaImport == null ) {
			javafxLabelJXMsgRspnSchemaImport = new JXMsgRspnSchemaImportCFLabel();
		}
		return( javafxLabelJXMsgRspnSchemaImport );
	}

	public void setJavaFXLabelJXMsgRspnSchemaImport( JXMsgRspnSchemaImportCFLabel value ) {
		javafxLabelJXMsgRspnSchemaImport = value;
	}

	public JXMsgRspnSchemaImportEditor getJavaFXEditorJXMsgRspnSchemaImport() {
		if( javafxEditorJXMsgRspnSchemaImport == null ) {
			javafxEditorJXMsgRspnSchemaImport = new JXMsgRspnSchemaImportEditor();
		}
		return( javafxEditorJXMsgRspnSchemaImport );
	}

	public void setJavaFXEditorJXMsgRspnSchemaImport( JXMsgRspnSchemaImportEditor value ) {
		javafxEditorJXMsgRspnSchemaImport = value;
	}

	public JXMsgRspnSchemaWireParsersCFLabel getJavaFXLabelJXMsgRspnSchemaWireParsers() {
		if( javafxLabelJXMsgRspnSchemaWireParsers == null ) {
			javafxLabelJXMsgRspnSchemaWireParsers = new JXMsgRspnSchemaWireParsersCFLabel();
		}
		return( javafxLabelJXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXLabelJXMsgRspnSchemaWireParsers( JXMsgRspnSchemaWireParsersCFLabel value ) {
		javafxLabelJXMsgRspnSchemaWireParsers = value;
	}

	public JXMsgRspnSchemaWireParsersEditor getJavaFXEditorJXMsgRspnSchemaWireParsers() {
		if( javafxEditorJXMsgRspnSchemaWireParsers == null ) {
			javafxEditorJXMsgRspnSchemaWireParsers = new JXMsgRspnSchemaWireParsersEditor();
		}
		return( javafxEditorJXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXEditorJXMsgRspnSchemaWireParsers( JXMsgRspnSchemaWireParsersEditor value ) {
		javafxEditorJXMsgRspnSchemaWireParsers = value;
	}

	public JXMsgRspnSchemaXsdElementListCFLabel getJavaFXLabelJXMsgRspnSchemaXsdElementList() {
		if( javafxLabelJXMsgRspnSchemaXsdElementList == null ) {
			javafxLabelJXMsgRspnSchemaXsdElementList = new JXMsgRspnSchemaXsdElementListCFLabel();
		}
		return( javafxLabelJXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXLabelJXMsgRspnSchemaXsdElementList( JXMsgRspnSchemaXsdElementListCFLabel value ) {
		javafxLabelJXMsgRspnSchemaXsdElementList = value;
	}

	public JXMsgRspnSchemaXsdElementListEditor getJavaFXEditorJXMsgRspnSchemaXsdElementList() {
		if( javafxEditorJXMsgRspnSchemaXsdElementList == null ) {
			javafxEditorJXMsgRspnSchemaXsdElementList = new JXMsgRspnSchemaXsdElementListEditor();
		}
		return( javafxEditorJXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXEditorJXMsgRspnSchemaXsdElementList( JXMsgRspnSchemaXsdElementListEditor value ) {
		javafxEditorJXMsgRspnSchemaXsdElementList = value;
	}

	public JXMsgRspnSchemaXsdSpecCFLabel getJavaFXLabelJXMsgRspnSchemaXsdSpec() {
		if( javafxLabelJXMsgRspnSchemaXsdSpec == null ) {
			javafxLabelJXMsgRspnSchemaXsdSpec = new JXMsgRspnSchemaXsdSpecCFLabel();
		}
		return( javafxLabelJXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXLabelJXMsgRspnSchemaXsdSpec( JXMsgRspnSchemaXsdSpecCFLabel value ) {
		javafxLabelJXMsgRspnSchemaXsdSpec = value;
	}

	public JXMsgRspnSchemaXsdSpecEditor getJavaFXEditorJXMsgRspnSchemaXsdSpec() {
		if( javafxEditorJXMsgRspnSchemaXsdSpec == null ) {
			javafxEditorJXMsgRspnSchemaXsdSpec = new JXMsgRspnSchemaXsdSpecEditor();
		}
		return( javafxEditorJXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXEditorJXMsgRspnSchemaXsdSpec( JXMsgRspnSchemaXsdSpecEditor value ) {
		javafxEditorJXMsgRspnSchemaXsdSpec = value;
	}

	public CppSchemaObjIncludeCFLabel getJavaFXLabelCppSchemaObjInclude() {
		if( javafxLabelCppSchemaObjInclude == null ) {
			javafxLabelCppSchemaObjInclude = new CppSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppSchemaObjInclude );
	}

	public void setJavaFXLabelCppSchemaObjInclude( CppSchemaObjIncludeCFLabel value ) {
		javafxLabelCppSchemaObjInclude = value;
	}

	public CppSchemaObjIncludeEditor getJavaFXEditorCppSchemaObjInclude() {
		if( javafxEditorCppSchemaObjInclude == null ) {
			javafxEditorCppSchemaObjInclude = new CppSchemaObjIncludeEditor();
		}
		return( javafxEditorCppSchemaObjInclude );
	}

	public void setJavaFXEditorCppSchemaObjInclude( CppSchemaObjIncludeEditor value ) {
		javafxEditorCppSchemaObjInclude = value;
	}

	public CppSchemaObjInterfaceCFLabel getJavaFXLabelCppSchemaObjInterface() {
		if( javafxLabelCppSchemaObjInterface == null ) {
			javafxLabelCppSchemaObjInterface = new CppSchemaObjInterfaceCFLabel();
		}
		return( javafxLabelCppSchemaObjInterface );
	}

	public void setJavaFXLabelCppSchemaObjInterface( CppSchemaObjInterfaceCFLabel value ) {
		javafxLabelCppSchemaObjInterface = value;
	}

	public CppSchemaObjInterfaceEditor getJavaFXEditorCppSchemaObjInterface() {
		if( javafxEditorCppSchemaObjInterface == null ) {
			javafxEditorCppSchemaObjInterface = new CppSchemaObjInterfaceEditor();
		}
		return( javafxEditorCppSchemaObjInterface );
	}

	public void setJavaFXEditorCppSchemaObjInterface( CppSchemaObjInterfaceEditor value ) {
		javafxEditorCppSchemaObjInterface = value;
	}

	public CppSchemaObjMembersCFLabel getJavaFXLabelCppSchemaObjMembers() {
		if( javafxLabelCppSchemaObjMembers == null ) {
			javafxLabelCppSchemaObjMembers = new CppSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppSchemaObjMembers );
	}

	public void setJavaFXLabelCppSchemaObjMembers( CppSchemaObjMembersCFLabel value ) {
		javafxLabelCppSchemaObjMembers = value;
	}

	public CppSchemaObjMembersEditor getJavaFXEditorCppSchemaObjMembers() {
		if( javafxEditorCppSchemaObjMembers == null ) {
			javafxEditorCppSchemaObjMembers = new CppSchemaObjMembersEditor();
		}
		return( javafxEditorCppSchemaObjMembers );
	}

	public void setJavaFXEditorCppSchemaObjMembers( CppSchemaObjMembersEditor value ) {
		javafxEditorCppSchemaObjMembers = value;
	}

	public CppSchemaObjImplementationCFLabel getJavaFXLabelCppSchemaObjImplementation() {
		if( javafxLabelCppSchemaObjImplementation == null ) {
			javafxLabelCppSchemaObjImplementation = new CppSchemaObjImplementationCFLabel();
		}
		return( javafxLabelCppSchemaObjImplementation );
	}

	public void setJavaFXLabelCppSchemaObjImplementation( CppSchemaObjImplementationCFLabel value ) {
		javafxLabelCppSchemaObjImplementation = value;
	}

	public CppSchemaObjImplementationEditor getJavaFXEditorCppSchemaObjImplementation() {
		if( javafxEditorCppSchemaObjImplementation == null ) {
			javafxEditorCppSchemaObjImplementation = new CppSchemaObjImplementationEditor();
		}
		return( javafxEditorCppSchemaObjImplementation );
	}

	public void setJavaFXEditorCppSchemaObjImplementation( CppSchemaObjImplementationEditor value ) {
		javafxEditorCppSchemaObjImplementation = value;
	}

	public CppDb2LUWSchemaObjMembersCFLabel getJavaFXLabelCppDb2LUWSchemaObjMembers() {
		if( javafxLabelCppDb2LUWSchemaObjMembers == null ) {
			javafxLabelCppDb2LUWSchemaObjMembers = new CppDb2LUWSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppDb2LUWSchemaObjMembers );
	}

	public void setJavaFXLabelCppDb2LUWSchemaObjMembers( CppDb2LUWSchemaObjMembersCFLabel value ) {
		javafxLabelCppDb2LUWSchemaObjMembers = value;
	}

	public CppDb2LUWSchemaObjMembersEditor getJavaFXEditorCppDb2LUWSchemaObjMembers() {
		if( javafxEditorCppDb2LUWSchemaObjMembers == null ) {
			javafxEditorCppDb2LUWSchemaObjMembers = new CppDb2LUWSchemaObjMembersEditor();
		}
		return( javafxEditorCppDb2LUWSchemaObjMembers );
	}

	public void setJavaFXEditorCppDb2LUWSchemaObjMembers( CppDb2LUWSchemaObjMembersEditor value ) {
		javafxEditorCppDb2LUWSchemaObjMembers = value;
	}

	public CppDb2LUWSchemaObjImplCFLabel getJavaFXLabelCppDb2LUWSchemaObjImpl() {
		if( javafxLabelCppDb2LUWSchemaObjImpl == null ) {
			javafxLabelCppDb2LUWSchemaObjImpl = new CppDb2LUWSchemaObjImplCFLabel();
		}
		return( javafxLabelCppDb2LUWSchemaObjImpl );
	}

	public void setJavaFXLabelCppDb2LUWSchemaObjImpl( CppDb2LUWSchemaObjImplCFLabel value ) {
		javafxLabelCppDb2LUWSchemaObjImpl = value;
	}

	public CppDb2LUWSchemaObjImplEditor getJavaFXEditorCppDb2LUWSchemaObjImpl() {
		if( javafxEditorCppDb2LUWSchemaObjImpl == null ) {
			javafxEditorCppDb2LUWSchemaObjImpl = new CppDb2LUWSchemaObjImplEditor();
		}
		return( javafxEditorCppDb2LUWSchemaObjImpl );
	}

	public void setJavaFXEditorCppDb2LUWSchemaObjImpl( CppDb2LUWSchemaObjImplEditor value ) {
		javafxEditorCppDb2LUWSchemaObjImpl = value;
	}

	public CppDb2LUWSchemaObjIncludeCFLabel getJavaFXLabelCppDb2LUWSchemaObjInclude() {
		if( javafxLabelCppDb2LUWSchemaObjInclude == null ) {
			javafxLabelCppDb2LUWSchemaObjInclude = new CppDb2LUWSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppDb2LUWSchemaObjInclude );
	}

	public void setJavaFXLabelCppDb2LUWSchemaObjInclude( CppDb2LUWSchemaObjIncludeCFLabel value ) {
		javafxLabelCppDb2LUWSchemaObjInclude = value;
	}

	public CppDb2LUWSchemaObjIncludeEditor getJavaFXEditorCppDb2LUWSchemaObjInclude() {
		if( javafxEditorCppDb2LUWSchemaObjInclude == null ) {
			javafxEditorCppDb2LUWSchemaObjInclude = new CppDb2LUWSchemaObjIncludeEditor();
		}
		return( javafxEditorCppDb2LUWSchemaObjInclude );
	}

	public void setJavaFXEditorCppDb2LUWSchemaObjInclude( CppDb2LUWSchemaObjIncludeEditor value ) {
		javafxEditorCppDb2LUWSchemaObjInclude = value;
	}

	public CppMSSqlSchemaObjMembersCFLabel getJavaFXLabelCppMSSqlSchemaObjMembers() {
		if( javafxLabelCppMSSqlSchemaObjMembers == null ) {
			javafxLabelCppMSSqlSchemaObjMembers = new CppMSSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppMSSqlSchemaObjMembers );
	}

	public void setJavaFXLabelCppMSSqlSchemaObjMembers( CppMSSqlSchemaObjMembersCFLabel value ) {
		javafxLabelCppMSSqlSchemaObjMembers = value;
	}

	public CppMSSqlSchemaObjMembersEditor getJavaFXEditorCppMSSqlSchemaObjMembers() {
		if( javafxEditorCppMSSqlSchemaObjMembers == null ) {
			javafxEditorCppMSSqlSchemaObjMembers = new CppMSSqlSchemaObjMembersEditor();
		}
		return( javafxEditorCppMSSqlSchemaObjMembers );
	}

	public void setJavaFXEditorCppMSSqlSchemaObjMembers( CppMSSqlSchemaObjMembersEditor value ) {
		javafxEditorCppMSSqlSchemaObjMembers = value;
	}

	public CppMSSqlSchemaObjImplCFLabel getJavaFXLabelCppMSSqlSchemaObjImpl() {
		if( javafxLabelCppMSSqlSchemaObjImpl == null ) {
			javafxLabelCppMSSqlSchemaObjImpl = new CppMSSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelCppMSSqlSchemaObjImpl );
	}

	public void setJavaFXLabelCppMSSqlSchemaObjImpl( CppMSSqlSchemaObjImplCFLabel value ) {
		javafxLabelCppMSSqlSchemaObjImpl = value;
	}

	public CppMSSqlSchemaObjImplEditor getJavaFXEditorCppMSSqlSchemaObjImpl() {
		if( javafxEditorCppMSSqlSchemaObjImpl == null ) {
			javafxEditorCppMSSqlSchemaObjImpl = new CppMSSqlSchemaObjImplEditor();
		}
		return( javafxEditorCppMSSqlSchemaObjImpl );
	}

	public void setJavaFXEditorCppMSSqlSchemaObjImpl( CppMSSqlSchemaObjImplEditor value ) {
		javafxEditorCppMSSqlSchemaObjImpl = value;
	}

	public CppMSSqlSchemaObjIncludeCFLabel getJavaFXLabelCppMSSqlSchemaObjInclude() {
		if( javafxLabelCppMSSqlSchemaObjInclude == null ) {
			javafxLabelCppMSSqlSchemaObjInclude = new CppMSSqlSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppMSSqlSchemaObjInclude );
	}

	public void setJavaFXLabelCppMSSqlSchemaObjInclude( CppMSSqlSchemaObjIncludeCFLabel value ) {
		javafxLabelCppMSSqlSchemaObjInclude = value;
	}

	public CppMSSqlSchemaObjIncludeEditor getJavaFXEditorCppMSSqlSchemaObjInclude() {
		if( javafxEditorCppMSSqlSchemaObjInclude == null ) {
			javafxEditorCppMSSqlSchemaObjInclude = new CppMSSqlSchemaObjIncludeEditor();
		}
		return( javafxEditorCppMSSqlSchemaObjInclude );
	}

	public void setJavaFXEditorCppMSSqlSchemaObjInclude( CppMSSqlSchemaObjIncludeEditor value ) {
		javafxEditorCppMSSqlSchemaObjInclude = value;
	}

	public CppMySqlSchemaObjMembersCFLabel getJavaFXLabelCppMySqlSchemaObjMembers() {
		if( javafxLabelCppMySqlSchemaObjMembers == null ) {
			javafxLabelCppMySqlSchemaObjMembers = new CppMySqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppMySqlSchemaObjMembers );
	}

	public void setJavaFXLabelCppMySqlSchemaObjMembers( CppMySqlSchemaObjMembersCFLabel value ) {
		javafxLabelCppMySqlSchemaObjMembers = value;
	}

	public CppMySqlSchemaObjMembersEditor getJavaFXEditorCppMySqlSchemaObjMembers() {
		if( javafxEditorCppMySqlSchemaObjMembers == null ) {
			javafxEditorCppMySqlSchemaObjMembers = new CppMySqlSchemaObjMembersEditor();
		}
		return( javafxEditorCppMySqlSchemaObjMembers );
	}

	public void setJavaFXEditorCppMySqlSchemaObjMembers( CppMySqlSchemaObjMembersEditor value ) {
		javafxEditorCppMySqlSchemaObjMembers = value;
	}

	public CppMySqlSchemaObjImplCFLabel getJavaFXLabelCppMySqlSchemaObjImpl() {
		if( javafxLabelCppMySqlSchemaObjImpl == null ) {
			javafxLabelCppMySqlSchemaObjImpl = new CppMySqlSchemaObjImplCFLabel();
		}
		return( javafxLabelCppMySqlSchemaObjImpl );
	}

	public void setJavaFXLabelCppMySqlSchemaObjImpl( CppMySqlSchemaObjImplCFLabel value ) {
		javafxLabelCppMySqlSchemaObjImpl = value;
	}

	public CppMySqlSchemaObjImplEditor getJavaFXEditorCppMySqlSchemaObjImpl() {
		if( javafxEditorCppMySqlSchemaObjImpl == null ) {
			javafxEditorCppMySqlSchemaObjImpl = new CppMySqlSchemaObjImplEditor();
		}
		return( javafxEditorCppMySqlSchemaObjImpl );
	}

	public void setJavaFXEditorCppMySqlSchemaObjImpl( CppMySqlSchemaObjImplEditor value ) {
		javafxEditorCppMySqlSchemaObjImpl = value;
	}

	public CppMySqlSchemaObjIncludeCFLabel getJavaFXLabelCppMySqlSchemaObjInclude() {
		if( javafxLabelCppMySqlSchemaObjInclude == null ) {
			javafxLabelCppMySqlSchemaObjInclude = new CppMySqlSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppMySqlSchemaObjInclude );
	}

	public void setJavaFXLabelCppMySqlSchemaObjInclude( CppMySqlSchemaObjIncludeCFLabel value ) {
		javafxLabelCppMySqlSchemaObjInclude = value;
	}

	public CppMySqlSchemaObjIncludeEditor getJavaFXEditorCppMySqlSchemaObjInclude() {
		if( javafxEditorCppMySqlSchemaObjInclude == null ) {
			javafxEditorCppMySqlSchemaObjInclude = new CppMySqlSchemaObjIncludeEditor();
		}
		return( javafxEditorCppMySqlSchemaObjInclude );
	}

	public void setJavaFXEditorCppMySqlSchemaObjInclude( CppMySqlSchemaObjIncludeEditor value ) {
		javafxEditorCppMySqlSchemaObjInclude = value;
	}

	public CppOracleSchemaObjMembersCFLabel getJavaFXLabelCppOracleSchemaObjMembers() {
		if( javafxLabelCppOracleSchemaObjMembers == null ) {
			javafxLabelCppOracleSchemaObjMembers = new CppOracleSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppOracleSchemaObjMembers );
	}

	public void setJavaFXLabelCppOracleSchemaObjMembers( CppOracleSchemaObjMembersCFLabel value ) {
		javafxLabelCppOracleSchemaObjMembers = value;
	}

	public CppOracleSchemaObjMembersEditor getJavaFXEditorCppOracleSchemaObjMembers() {
		if( javafxEditorCppOracleSchemaObjMembers == null ) {
			javafxEditorCppOracleSchemaObjMembers = new CppOracleSchemaObjMembersEditor();
		}
		return( javafxEditorCppOracleSchemaObjMembers );
	}

	public void setJavaFXEditorCppOracleSchemaObjMembers( CppOracleSchemaObjMembersEditor value ) {
		javafxEditorCppOracleSchemaObjMembers = value;
	}

	public CppOracleSchemaObjImplCFLabel getJavaFXLabelCppOracleSchemaObjImpl() {
		if( javafxLabelCppOracleSchemaObjImpl == null ) {
			javafxLabelCppOracleSchemaObjImpl = new CppOracleSchemaObjImplCFLabel();
		}
		return( javafxLabelCppOracleSchemaObjImpl );
	}

	public void setJavaFXLabelCppOracleSchemaObjImpl( CppOracleSchemaObjImplCFLabel value ) {
		javafxLabelCppOracleSchemaObjImpl = value;
	}

	public CppOracleSchemaObjImplEditor getJavaFXEditorCppOracleSchemaObjImpl() {
		if( javafxEditorCppOracleSchemaObjImpl == null ) {
			javafxEditorCppOracleSchemaObjImpl = new CppOracleSchemaObjImplEditor();
		}
		return( javafxEditorCppOracleSchemaObjImpl );
	}

	public void setJavaFXEditorCppOracleSchemaObjImpl( CppOracleSchemaObjImplEditor value ) {
		javafxEditorCppOracleSchemaObjImpl = value;
	}

	public CppOracleSchemaObjIncludeCFLabel getJavaFXLabelCppOracleSchemaObjInclude() {
		if( javafxLabelCppOracleSchemaObjInclude == null ) {
			javafxLabelCppOracleSchemaObjInclude = new CppOracleSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppOracleSchemaObjInclude );
	}

	public void setJavaFXLabelCppOracleSchemaObjInclude( CppOracleSchemaObjIncludeCFLabel value ) {
		javafxLabelCppOracleSchemaObjInclude = value;
	}

	public CppOracleSchemaObjIncludeEditor getJavaFXEditorCppOracleSchemaObjInclude() {
		if( javafxEditorCppOracleSchemaObjInclude == null ) {
			javafxEditorCppOracleSchemaObjInclude = new CppOracleSchemaObjIncludeEditor();
		}
		return( javafxEditorCppOracleSchemaObjInclude );
	}

	public void setJavaFXEditorCppOracleSchemaObjInclude( CppOracleSchemaObjIncludeEditor value ) {
		javafxEditorCppOracleSchemaObjInclude = value;
	}

	public CppPgSqlSchemaObjMembersCFLabel getJavaFXLabelCppPgSqlSchemaObjMembers() {
		if( javafxLabelCppPgSqlSchemaObjMembers == null ) {
			javafxLabelCppPgSqlSchemaObjMembers = new CppPgSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppPgSqlSchemaObjMembers );
	}

	public void setJavaFXLabelCppPgSqlSchemaObjMembers( CppPgSqlSchemaObjMembersCFLabel value ) {
		javafxLabelCppPgSqlSchemaObjMembers = value;
	}

	public CppPgSqlSchemaObjMembersEditor getJavaFXEditorCppPgSqlSchemaObjMembers() {
		if( javafxEditorCppPgSqlSchemaObjMembers == null ) {
			javafxEditorCppPgSqlSchemaObjMembers = new CppPgSqlSchemaObjMembersEditor();
		}
		return( javafxEditorCppPgSqlSchemaObjMembers );
	}

	public void setJavaFXEditorCppPgSqlSchemaObjMembers( CppPgSqlSchemaObjMembersEditor value ) {
		javafxEditorCppPgSqlSchemaObjMembers = value;
	}

	public CppPgSqlSchemaObjImplCFLabel getJavaFXLabelCppPgSqlSchemaObjImpl() {
		if( javafxLabelCppPgSqlSchemaObjImpl == null ) {
			javafxLabelCppPgSqlSchemaObjImpl = new CppPgSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelCppPgSqlSchemaObjImpl );
	}

	public void setJavaFXLabelCppPgSqlSchemaObjImpl( CppPgSqlSchemaObjImplCFLabel value ) {
		javafxLabelCppPgSqlSchemaObjImpl = value;
	}

	public CppPgSqlSchemaObjImplEditor getJavaFXEditorCppPgSqlSchemaObjImpl() {
		if( javafxEditorCppPgSqlSchemaObjImpl == null ) {
			javafxEditorCppPgSqlSchemaObjImpl = new CppPgSqlSchemaObjImplEditor();
		}
		return( javafxEditorCppPgSqlSchemaObjImpl );
	}

	public void setJavaFXEditorCppPgSqlSchemaObjImpl( CppPgSqlSchemaObjImplEditor value ) {
		javafxEditorCppPgSqlSchemaObjImpl = value;
	}

	public CppPgSqlSchemaObjIncludeCFLabel getJavaFXLabelCppPgSqlSchemaObjInclude() {
		if( javafxLabelCppPgSqlSchemaObjInclude == null ) {
			javafxLabelCppPgSqlSchemaObjInclude = new CppPgSqlSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppPgSqlSchemaObjInclude );
	}

	public void setJavaFXLabelCppPgSqlSchemaObjInclude( CppPgSqlSchemaObjIncludeCFLabel value ) {
		javafxLabelCppPgSqlSchemaObjInclude = value;
	}

	public CppPgSqlSchemaObjIncludeEditor getJavaFXEditorCppPgSqlSchemaObjInclude() {
		if( javafxEditorCppPgSqlSchemaObjInclude == null ) {
			javafxEditorCppPgSqlSchemaObjInclude = new CppPgSqlSchemaObjIncludeEditor();
		}
		return( javafxEditorCppPgSqlSchemaObjInclude );
	}

	public void setJavaFXEditorCppPgSqlSchemaObjInclude( CppPgSqlSchemaObjIncludeEditor value ) {
		javafxEditorCppPgSqlSchemaObjInclude = value;
	}

	public CppRamSchemaObjMembersCFLabel getJavaFXLabelCppRamSchemaObjMembers() {
		if( javafxLabelCppRamSchemaObjMembers == null ) {
			javafxLabelCppRamSchemaObjMembers = new CppRamSchemaObjMembersCFLabel();
		}
		return( javafxLabelCppRamSchemaObjMembers );
	}

	public void setJavaFXLabelCppRamSchemaObjMembers( CppRamSchemaObjMembersCFLabel value ) {
		javafxLabelCppRamSchemaObjMembers = value;
	}

	public CppRamSchemaObjMembersEditor getJavaFXEditorCppRamSchemaObjMembers() {
		if( javafxEditorCppRamSchemaObjMembers == null ) {
			javafxEditorCppRamSchemaObjMembers = new CppRamSchemaObjMembersEditor();
		}
		return( javafxEditorCppRamSchemaObjMembers );
	}

	public void setJavaFXEditorCppRamSchemaObjMembers( CppRamSchemaObjMembersEditor value ) {
		javafxEditorCppRamSchemaObjMembers = value;
	}

	public CppRamSchemaObjImplCFLabel getJavaFXLabelCppRamSchemaObjImpl() {
		if( javafxLabelCppRamSchemaObjImpl == null ) {
			javafxLabelCppRamSchemaObjImpl = new CppRamSchemaObjImplCFLabel();
		}
		return( javafxLabelCppRamSchemaObjImpl );
	}

	public void setJavaFXLabelCppRamSchemaObjImpl( CppRamSchemaObjImplCFLabel value ) {
		javafxLabelCppRamSchemaObjImpl = value;
	}

	public CppRamSchemaObjImplEditor getJavaFXEditorCppRamSchemaObjImpl() {
		if( javafxEditorCppRamSchemaObjImpl == null ) {
			javafxEditorCppRamSchemaObjImpl = new CppRamSchemaObjImplEditor();
		}
		return( javafxEditorCppRamSchemaObjImpl );
	}

	public void setJavaFXEditorCppRamSchemaObjImpl( CppRamSchemaObjImplEditor value ) {
		javafxEditorCppRamSchemaObjImpl = value;
	}

	public CppRamSchemaObjIncludeCFLabel getJavaFXLabelCppRamSchemaObjInclude() {
		if( javafxLabelCppRamSchemaObjInclude == null ) {
			javafxLabelCppRamSchemaObjInclude = new CppRamSchemaObjIncludeCFLabel();
		}
		return( javafxLabelCppRamSchemaObjInclude );
	}

	public void setJavaFXLabelCppRamSchemaObjInclude( CppRamSchemaObjIncludeCFLabel value ) {
		javafxLabelCppRamSchemaObjInclude = value;
	}

	public CppRamSchemaObjIncludeEditor getJavaFXEditorCppRamSchemaObjInclude() {
		if( javafxEditorCppRamSchemaObjInclude == null ) {
			javafxEditorCppRamSchemaObjInclude = new CppRamSchemaObjIncludeEditor();
		}
		return( javafxEditorCppRamSchemaObjInclude );
	}

	public void setJavaFXEditorCppRamSchemaObjInclude( CppRamSchemaObjIncludeEditor value ) {
		javafxEditorCppRamSchemaObjInclude = value;
	}

	public CppXMsgSchemaIncludeCFLabel getJavaFXLabelCppXMsgSchemaInclude() {
		if( javafxLabelCppXMsgSchemaInclude == null ) {
			javafxLabelCppXMsgSchemaInclude = new CppXMsgSchemaIncludeCFLabel();
		}
		return( javafxLabelCppXMsgSchemaInclude );
	}

	public void setJavaFXLabelCppXMsgSchemaInclude( CppXMsgSchemaIncludeCFLabel value ) {
		javafxLabelCppXMsgSchemaInclude = value;
	}

	public CppXMsgSchemaIncludeEditor getJavaFXEditorCppXMsgSchemaInclude() {
		if( javafxEditorCppXMsgSchemaInclude == null ) {
			javafxEditorCppXMsgSchemaInclude = new CppXMsgSchemaIncludeEditor();
		}
		return( javafxEditorCppXMsgSchemaInclude );
	}

	public void setJavaFXEditorCppXMsgSchemaInclude( CppXMsgSchemaIncludeEditor value ) {
		javafxEditorCppXMsgSchemaInclude = value;
	}

	public CppXMsgSchemaFormattersCFLabel getJavaFXLabelCppXMsgSchemaFormatters() {
		if( javafxLabelCppXMsgSchemaFormatters == null ) {
			javafxLabelCppXMsgSchemaFormatters = new CppXMsgSchemaFormattersCFLabel();
		}
		return( javafxLabelCppXMsgSchemaFormatters );
	}

	public void setJavaFXLabelCppXMsgSchemaFormatters( CppXMsgSchemaFormattersCFLabel value ) {
		javafxLabelCppXMsgSchemaFormatters = value;
	}

	public CppXMsgSchemaFormattersEditor getJavaFXEditorCppXMsgSchemaFormatters() {
		if( javafxEditorCppXMsgSchemaFormatters == null ) {
			javafxEditorCppXMsgSchemaFormatters = new CppXMsgSchemaFormattersEditor();
		}
		return( javafxEditorCppXMsgSchemaFormatters );
	}

	public void setJavaFXEditorCppXMsgSchemaFormatters( CppXMsgSchemaFormattersEditor value ) {
		javafxEditorCppXMsgSchemaFormatters = value;
	}

	public CppXMsgClientSchemaIncludeCFLabel getJavaFXLabelCppXMsgClientSchemaInclude() {
		if( javafxLabelCppXMsgClientSchemaInclude == null ) {
			javafxLabelCppXMsgClientSchemaInclude = new CppXMsgClientSchemaIncludeCFLabel();
		}
		return( javafxLabelCppXMsgClientSchemaInclude );
	}

	public void setJavaFXLabelCppXMsgClientSchemaInclude( CppXMsgClientSchemaIncludeCFLabel value ) {
		javafxLabelCppXMsgClientSchemaInclude = value;
	}

	public CppXMsgClientSchemaIncludeEditor getJavaFXEditorCppXMsgClientSchemaInclude() {
		if( javafxEditorCppXMsgClientSchemaInclude == null ) {
			javafxEditorCppXMsgClientSchemaInclude = new CppXMsgClientSchemaIncludeEditor();
		}
		return( javafxEditorCppXMsgClientSchemaInclude );
	}

	public void setJavaFXEditorCppXMsgClientSchemaInclude( CppXMsgClientSchemaIncludeEditor value ) {
		javafxEditorCppXMsgClientSchemaInclude = value;
	}

	public CppXMsgClientSchemaBodyCFLabel getJavaFXLabelCppXMsgClientSchemaBody() {
		if( javafxLabelCppXMsgClientSchemaBody == null ) {
			javafxLabelCppXMsgClientSchemaBody = new CppXMsgClientSchemaBodyCFLabel();
		}
		return( javafxLabelCppXMsgClientSchemaBody );
	}

	public void setJavaFXLabelCppXMsgClientSchemaBody( CppXMsgClientSchemaBodyCFLabel value ) {
		javafxLabelCppXMsgClientSchemaBody = value;
	}

	public CppXMsgClientSchemaBodyEditor getJavaFXEditorCppXMsgClientSchemaBody() {
		if( javafxEditorCppXMsgClientSchemaBody == null ) {
			javafxEditorCppXMsgClientSchemaBody = new CppXMsgClientSchemaBodyEditor();
		}
		return( javafxEditorCppXMsgClientSchemaBody );
	}

	public void setJavaFXEditorCppXMsgClientSchemaBody( CppXMsgClientSchemaBodyEditor value ) {
		javafxEditorCppXMsgClientSchemaBody = value;
	}

	public CppXMsgRqstSchemaBodyCFLabel getJavaFXLabelCppXMsgRqstSchemaBody() {
		if( javafxLabelCppXMsgRqstSchemaBody == null ) {
			javafxLabelCppXMsgRqstSchemaBody = new CppXMsgRqstSchemaBodyCFLabel();
		}
		return( javafxLabelCppXMsgRqstSchemaBody );
	}

	public void setJavaFXLabelCppXMsgRqstSchemaBody( CppXMsgRqstSchemaBodyCFLabel value ) {
		javafxLabelCppXMsgRqstSchemaBody = value;
	}

	public CppXMsgRqstSchemaBodyEditor getJavaFXEditorCppXMsgRqstSchemaBody() {
		if( javafxEditorCppXMsgRqstSchemaBody == null ) {
			javafxEditorCppXMsgRqstSchemaBody = new CppXMsgRqstSchemaBodyEditor();
		}
		return( javafxEditorCppXMsgRqstSchemaBody );
	}

	public void setJavaFXEditorCppXMsgRqstSchemaBody( CppXMsgRqstSchemaBodyEditor value ) {
		javafxEditorCppXMsgRqstSchemaBody = value;
	}

	public CppXMsgRqstSchemaIncludeCFLabel getJavaFXLabelCppXMsgRqstSchemaInclude() {
		if( javafxLabelCppXMsgRqstSchemaInclude == null ) {
			javafxLabelCppXMsgRqstSchemaInclude = new CppXMsgRqstSchemaIncludeCFLabel();
		}
		return( javafxLabelCppXMsgRqstSchemaInclude );
	}

	public void setJavaFXLabelCppXMsgRqstSchemaInclude( CppXMsgRqstSchemaIncludeCFLabel value ) {
		javafxLabelCppXMsgRqstSchemaInclude = value;
	}

	public CppXMsgRqstSchemaIncludeEditor getJavaFXEditorCppXMsgRqstSchemaInclude() {
		if( javafxEditorCppXMsgRqstSchemaInclude == null ) {
			javafxEditorCppXMsgRqstSchemaInclude = new CppXMsgRqstSchemaIncludeEditor();
		}
		return( javafxEditorCppXMsgRqstSchemaInclude );
	}

	public void setJavaFXEditorCppXMsgRqstSchemaInclude( CppXMsgRqstSchemaIncludeEditor value ) {
		javafxEditorCppXMsgRqstSchemaInclude = value;
	}

	public CppXMsgRqstSchemaWireParsersCFLabel getJavaFXLabelCppXMsgRqstSchemaWireParsers() {
		if( javafxLabelCppXMsgRqstSchemaWireParsers == null ) {
			javafxLabelCppXMsgRqstSchemaWireParsers = new CppXMsgRqstSchemaWireParsersCFLabel();
		}
		return( javafxLabelCppXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXLabelCppXMsgRqstSchemaWireParsers( CppXMsgRqstSchemaWireParsersCFLabel value ) {
		javafxLabelCppXMsgRqstSchemaWireParsers = value;
	}

	public CppXMsgRqstSchemaWireParsersEditor getJavaFXEditorCppXMsgRqstSchemaWireParsers() {
		if( javafxEditorCppXMsgRqstSchemaWireParsers == null ) {
			javafxEditorCppXMsgRqstSchemaWireParsers = new CppXMsgRqstSchemaWireParsersEditor();
		}
		return( javafxEditorCppXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXEditorCppXMsgRqstSchemaWireParsers( CppXMsgRqstSchemaWireParsersEditor value ) {
		javafxEditorCppXMsgRqstSchemaWireParsers = value;
	}

	public CppXMsgRqstSchemaXsdSpecCFLabel getJavaFXLabelCppXMsgRqstSchemaXsdSpec() {
		if( javafxLabelCppXMsgRqstSchemaXsdSpec == null ) {
			javafxLabelCppXMsgRqstSchemaXsdSpec = new CppXMsgRqstSchemaXsdSpecCFLabel();
		}
		return( javafxLabelCppXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXLabelCppXMsgRqstSchemaXsdSpec( CppXMsgRqstSchemaXsdSpecCFLabel value ) {
		javafxLabelCppXMsgRqstSchemaXsdSpec = value;
	}

	public CppXMsgRqstSchemaXsdSpecEditor getJavaFXEditorCppXMsgRqstSchemaXsdSpec() {
		if( javafxEditorCppXMsgRqstSchemaXsdSpec == null ) {
			javafxEditorCppXMsgRqstSchemaXsdSpec = new CppXMsgRqstSchemaXsdSpecEditor();
		}
		return( javafxEditorCppXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXEditorCppXMsgRqstSchemaXsdSpec( CppXMsgRqstSchemaXsdSpecEditor value ) {
		javafxEditorCppXMsgRqstSchemaXsdSpec = value;
	}

	public CppXMsgRqstSchemaXsdElementListCFLabel getJavaFXLabelCppXMsgRqstSchemaXsdElementList() {
		if( javafxLabelCppXMsgRqstSchemaXsdElementList == null ) {
			javafxLabelCppXMsgRqstSchemaXsdElementList = new CppXMsgRqstSchemaXsdElementListCFLabel();
		}
		return( javafxLabelCppXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXLabelCppXMsgRqstSchemaXsdElementList( CppXMsgRqstSchemaXsdElementListCFLabel value ) {
		javafxLabelCppXMsgRqstSchemaXsdElementList = value;
	}

	public CppXMsgRqstSchemaXsdElementListEditor getJavaFXEditorCppXMsgRqstSchemaXsdElementList() {
		if( javafxEditorCppXMsgRqstSchemaXsdElementList == null ) {
			javafxEditorCppXMsgRqstSchemaXsdElementList = new CppXMsgRqstSchemaXsdElementListEditor();
		}
		return( javafxEditorCppXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXEditorCppXMsgRqstSchemaXsdElementList( CppXMsgRqstSchemaXsdElementListEditor value ) {
		javafxEditorCppXMsgRqstSchemaXsdElementList = value;
	}

	public CppXMsgRspnSchemaBodyCFLabel getJavaFXLabelCppXMsgRspnSchemaBody() {
		if( javafxLabelCppXMsgRspnSchemaBody == null ) {
			javafxLabelCppXMsgRspnSchemaBody = new CppXMsgRspnSchemaBodyCFLabel();
		}
		return( javafxLabelCppXMsgRspnSchemaBody );
	}

	public void setJavaFXLabelCppXMsgRspnSchemaBody( CppXMsgRspnSchemaBodyCFLabel value ) {
		javafxLabelCppXMsgRspnSchemaBody = value;
	}

	public CppXMsgRspnSchemaBodyEditor getJavaFXEditorCppXMsgRspnSchemaBody() {
		if( javafxEditorCppXMsgRspnSchemaBody == null ) {
			javafxEditorCppXMsgRspnSchemaBody = new CppXMsgRspnSchemaBodyEditor();
		}
		return( javafxEditorCppXMsgRspnSchemaBody );
	}

	public void setJavaFXEditorCppXMsgRspnSchemaBody( CppXMsgRspnSchemaBodyEditor value ) {
		javafxEditorCppXMsgRspnSchemaBody = value;
	}

	public CppXMsgRspnSchemaIncludeCFLabel getJavaFXLabelCppXMsgRspnSchemaInclude() {
		if( javafxLabelCppXMsgRspnSchemaInclude == null ) {
			javafxLabelCppXMsgRspnSchemaInclude = new CppXMsgRspnSchemaIncludeCFLabel();
		}
		return( javafxLabelCppXMsgRspnSchemaInclude );
	}

	public void setJavaFXLabelCppXMsgRspnSchemaInclude( CppXMsgRspnSchemaIncludeCFLabel value ) {
		javafxLabelCppXMsgRspnSchemaInclude = value;
	}

	public CppXMsgRspnSchemaIncludeEditor getJavaFXEditorCppXMsgRspnSchemaInclude() {
		if( javafxEditorCppXMsgRspnSchemaInclude == null ) {
			javafxEditorCppXMsgRspnSchemaInclude = new CppXMsgRspnSchemaIncludeEditor();
		}
		return( javafxEditorCppXMsgRspnSchemaInclude );
	}

	public void setJavaFXEditorCppXMsgRspnSchemaInclude( CppXMsgRspnSchemaIncludeEditor value ) {
		javafxEditorCppXMsgRspnSchemaInclude = value;
	}

	public CppXMsgRspnSchemaWireParsersCFLabel getJavaFXLabelCppXMsgRspnSchemaWireParsers() {
		if( javafxLabelCppXMsgRspnSchemaWireParsers == null ) {
			javafxLabelCppXMsgRspnSchemaWireParsers = new CppXMsgRspnSchemaWireParsersCFLabel();
		}
		return( javafxLabelCppXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXLabelCppXMsgRspnSchemaWireParsers( CppXMsgRspnSchemaWireParsersCFLabel value ) {
		javafxLabelCppXMsgRspnSchemaWireParsers = value;
	}

	public CppXMsgRspnSchemaWireParsersEditor getJavaFXEditorCppXMsgRspnSchemaWireParsers() {
		if( javafxEditorCppXMsgRspnSchemaWireParsers == null ) {
			javafxEditorCppXMsgRspnSchemaWireParsers = new CppXMsgRspnSchemaWireParsersEditor();
		}
		return( javafxEditorCppXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXEditorCppXMsgRspnSchemaWireParsers( CppXMsgRspnSchemaWireParsersEditor value ) {
		javafxEditorCppXMsgRspnSchemaWireParsers = value;
	}

	public CppXMsgRspnSchemaXsdElementListCFLabel getJavaFXLabelCppXMsgRspnSchemaXsdElementList() {
		if( javafxLabelCppXMsgRspnSchemaXsdElementList == null ) {
			javafxLabelCppXMsgRspnSchemaXsdElementList = new CppXMsgRspnSchemaXsdElementListCFLabel();
		}
		return( javafxLabelCppXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXLabelCppXMsgRspnSchemaXsdElementList( CppXMsgRspnSchemaXsdElementListCFLabel value ) {
		javafxLabelCppXMsgRspnSchemaXsdElementList = value;
	}

	public CppXMsgRspnSchemaXsdElementListEditor getJavaFXEditorCppXMsgRspnSchemaXsdElementList() {
		if( javafxEditorCppXMsgRspnSchemaXsdElementList == null ) {
			javafxEditorCppXMsgRspnSchemaXsdElementList = new CppXMsgRspnSchemaXsdElementListEditor();
		}
		return( javafxEditorCppXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXEditorCppXMsgRspnSchemaXsdElementList( CppXMsgRspnSchemaXsdElementListEditor value ) {
		javafxEditorCppXMsgRspnSchemaXsdElementList = value;
	}

	public CppXMsgRspnSchemaXsdSpecCFLabel getJavaFXLabelCppXMsgRspnSchemaXsdSpec() {
		if( javafxLabelCppXMsgRspnSchemaXsdSpec == null ) {
			javafxLabelCppXMsgRspnSchemaXsdSpec = new CppXMsgRspnSchemaXsdSpecCFLabel();
		}
		return( javafxLabelCppXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXLabelCppXMsgRspnSchemaXsdSpec( CppXMsgRspnSchemaXsdSpecCFLabel value ) {
		javafxLabelCppXMsgRspnSchemaXsdSpec = value;
	}

	public CppXMsgRspnSchemaXsdSpecEditor getJavaFXEditorCppXMsgRspnSchemaXsdSpec() {
		if( javafxEditorCppXMsgRspnSchemaXsdSpec == null ) {
			javafxEditorCppXMsgRspnSchemaXsdSpec = new CppXMsgRspnSchemaXsdSpecEditor();
		}
		return( javafxEditorCppXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXEditorCppXMsgRspnSchemaXsdSpec( CppXMsgRspnSchemaXsdSpecEditor value ) {
		javafxEditorCppXMsgRspnSchemaXsdSpec = value;
	}

	public HppSchemaObjIncludeCFLabel getJavaFXLabelHppSchemaObjInclude() {
		if( javafxLabelHppSchemaObjInclude == null ) {
			javafxLabelHppSchemaObjInclude = new HppSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppSchemaObjInclude );
	}

	public void setJavaFXLabelHppSchemaObjInclude( HppSchemaObjIncludeCFLabel value ) {
		javafxLabelHppSchemaObjInclude = value;
	}

	public HppSchemaObjIncludeEditor getJavaFXEditorHppSchemaObjInclude() {
		if( javafxEditorHppSchemaObjInclude == null ) {
			javafxEditorHppSchemaObjInclude = new HppSchemaObjIncludeEditor();
		}
		return( javafxEditorHppSchemaObjInclude );
	}

	public void setJavaFXEditorHppSchemaObjInclude( HppSchemaObjIncludeEditor value ) {
		javafxEditorHppSchemaObjInclude = value;
	}

	public HppSchemaObjInterfaceCFLabel getJavaFXLabelHppSchemaObjInterface() {
		if( javafxLabelHppSchemaObjInterface == null ) {
			javafxLabelHppSchemaObjInterface = new HppSchemaObjInterfaceCFLabel();
		}
		return( javafxLabelHppSchemaObjInterface );
	}

	public void setJavaFXLabelHppSchemaObjInterface( HppSchemaObjInterfaceCFLabel value ) {
		javafxLabelHppSchemaObjInterface = value;
	}

	public HppSchemaObjInterfaceEditor getJavaFXEditorHppSchemaObjInterface() {
		if( javafxEditorHppSchemaObjInterface == null ) {
			javafxEditorHppSchemaObjInterface = new HppSchemaObjInterfaceEditor();
		}
		return( javafxEditorHppSchemaObjInterface );
	}

	public void setJavaFXEditorHppSchemaObjInterface( HppSchemaObjInterfaceEditor value ) {
		javafxEditorHppSchemaObjInterface = value;
	}

	public HppSchemaObjMembersCFLabel getJavaFXLabelHppSchemaObjMembers() {
		if( javafxLabelHppSchemaObjMembers == null ) {
			javafxLabelHppSchemaObjMembers = new HppSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppSchemaObjMembers );
	}

	public void setJavaFXLabelHppSchemaObjMembers( HppSchemaObjMembersCFLabel value ) {
		javafxLabelHppSchemaObjMembers = value;
	}

	public HppSchemaObjMembersEditor getJavaFXEditorHppSchemaObjMembers() {
		if( javafxEditorHppSchemaObjMembers == null ) {
			javafxEditorHppSchemaObjMembers = new HppSchemaObjMembersEditor();
		}
		return( javafxEditorHppSchemaObjMembers );
	}

	public void setJavaFXEditorHppSchemaObjMembers( HppSchemaObjMembersEditor value ) {
		javafxEditorHppSchemaObjMembers = value;
	}

	public HppSchemaObjImplementationCFLabel getJavaFXLabelHppSchemaObjImplementation() {
		if( javafxLabelHppSchemaObjImplementation == null ) {
			javafxLabelHppSchemaObjImplementation = new HppSchemaObjImplementationCFLabel();
		}
		return( javafxLabelHppSchemaObjImplementation );
	}

	public void setJavaFXLabelHppSchemaObjImplementation( HppSchemaObjImplementationCFLabel value ) {
		javafxLabelHppSchemaObjImplementation = value;
	}

	public HppSchemaObjImplementationEditor getJavaFXEditorHppSchemaObjImplementation() {
		if( javafxEditorHppSchemaObjImplementation == null ) {
			javafxEditorHppSchemaObjImplementation = new HppSchemaObjImplementationEditor();
		}
		return( javafxEditorHppSchemaObjImplementation );
	}

	public void setJavaFXEditorHppSchemaObjImplementation( HppSchemaObjImplementationEditor value ) {
		javafxEditorHppSchemaObjImplementation = value;
	}

	public HppDb2LUWSchemaObjMembersCFLabel getJavaFXLabelHppDb2LUWSchemaObjMembers() {
		if( javafxLabelHppDb2LUWSchemaObjMembers == null ) {
			javafxLabelHppDb2LUWSchemaObjMembers = new HppDb2LUWSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppDb2LUWSchemaObjMembers );
	}

	public void setJavaFXLabelHppDb2LUWSchemaObjMembers( HppDb2LUWSchemaObjMembersCFLabel value ) {
		javafxLabelHppDb2LUWSchemaObjMembers = value;
	}

	public HppDb2LUWSchemaObjMembersEditor getJavaFXEditorHppDb2LUWSchemaObjMembers() {
		if( javafxEditorHppDb2LUWSchemaObjMembers == null ) {
			javafxEditorHppDb2LUWSchemaObjMembers = new HppDb2LUWSchemaObjMembersEditor();
		}
		return( javafxEditorHppDb2LUWSchemaObjMembers );
	}

	public void setJavaFXEditorHppDb2LUWSchemaObjMembers( HppDb2LUWSchemaObjMembersEditor value ) {
		javafxEditorHppDb2LUWSchemaObjMembers = value;
	}

	public HppDb2LUWSchemaObjImplCFLabel getJavaFXLabelHppDb2LUWSchemaObjImpl() {
		if( javafxLabelHppDb2LUWSchemaObjImpl == null ) {
			javafxLabelHppDb2LUWSchemaObjImpl = new HppDb2LUWSchemaObjImplCFLabel();
		}
		return( javafxLabelHppDb2LUWSchemaObjImpl );
	}

	public void setJavaFXLabelHppDb2LUWSchemaObjImpl( HppDb2LUWSchemaObjImplCFLabel value ) {
		javafxLabelHppDb2LUWSchemaObjImpl = value;
	}

	public HppDb2LUWSchemaObjImplEditor getJavaFXEditorHppDb2LUWSchemaObjImpl() {
		if( javafxEditorHppDb2LUWSchemaObjImpl == null ) {
			javafxEditorHppDb2LUWSchemaObjImpl = new HppDb2LUWSchemaObjImplEditor();
		}
		return( javafxEditorHppDb2LUWSchemaObjImpl );
	}

	public void setJavaFXEditorHppDb2LUWSchemaObjImpl( HppDb2LUWSchemaObjImplEditor value ) {
		javafxEditorHppDb2LUWSchemaObjImpl = value;
	}

	public HppDb2LUWSchemaObjIncludeCFLabel getJavaFXLabelHppDb2LUWSchemaObjInclude() {
		if( javafxLabelHppDb2LUWSchemaObjInclude == null ) {
			javafxLabelHppDb2LUWSchemaObjInclude = new HppDb2LUWSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppDb2LUWSchemaObjInclude );
	}

	public void setJavaFXLabelHppDb2LUWSchemaObjInclude( HppDb2LUWSchemaObjIncludeCFLabel value ) {
		javafxLabelHppDb2LUWSchemaObjInclude = value;
	}

	public HppDb2LUWSchemaObjIncludeEditor getJavaFXEditorHppDb2LUWSchemaObjInclude() {
		if( javafxEditorHppDb2LUWSchemaObjInclude == null ) {
			javafxEditorHppDb2LUWSchemaObjInclude = new HppDb2LUWSchemaObjIncludeEditor();
		}
		return( javafxEditorHppDb2LUWSchemaObjInclude );
	}

	public void setJavaFXEditorHppDb2LUWSchemaObjInclude( HppDb2LUWSchemaObjIncludeEditor value ) {
		javafxEditorHppDb2LUWSchemaObjInclude = value;
	}

	public HppMSSqlSchemaObjMembersCFLabel getJavaFXLabelHppMSSqlSchemaObjMembers() {
		if( javafxLabelHppMSSqlSchemaObjMembers == null ) {
			javafxLabelHppMSSqlSchemaObjMembers = new HppMSSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppMSSqlSchemaObjMembers );
	}

	public void setJavaFXLabelHppMSSqlSchemaObjMembers( HppMSSqlSchemaObjMembersCFLabel value ) {
		javafxLabelHppMSSqlSchemaObjMembers = value;
	}

	public HppMSSqlSchemaObjMembersEditor getJavaFXEditorHppMSSqlSchemaObjMembers() {
		if( javafxEditorHppMSSqlSchemaObjMembers == null ) {
			javafxEditorHppMSSqlSchemaObjMembers = new HppMSSqlSchemaObjMembersEditor();
		}
		return( javafxEditorHppMSSqlSchemaObjMembers );
	}

	public void setJavaFXEditorHppMSSqlSchemaObjMembers( HppMSSqlSchemaObjMembersEditor value ) {
		javafxEditorHppMSSqlSchemaObjMembers = value;
	}

	public HppMSSqlSchemaObjImplCFLabel getJavaFXLabelHppMSSqlSchemaObjImpl() {
		if( javafxLabelHppMSSqlSchemaObjImpl == null ) {
			javafxLabelHppMSSqlSchemaObjImpl = new HppMSSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelHppMSSqlSchemaObjImpl );
	}

	public void setJavaFXLabelHppMSSqlSchemaObjImpl( HppMSSqlSchemaObjImplCFLabel value ) {
		javafxLabelHppMSSqlSchemaObjImpl = value;
	}

	public HppMSSqlSchemaObjImplEditor getJavaFXEditorHppMSSqlSchemaObjImpl() {
		if( javafxEditorHppMSSqlSchemaObjImpl == null ) {
			javafxEditorHppMSSqlSchemaObjImpl = new HppMSSqlSchemaObjImplEditor();
		}
		return( javafxEditorHppMSSqlSchemaObjImpl );
	}

	public void setJavaFXEditorHppMSSqlSchemaObjImpl( HppMSSqlSchemaObjImplEditor value ) {
		javafxEditorHppMSSqlSchemaObjImpl = value;
	}

	public HppMSSqlSchemaObjIncludeCFLabel getJavaFXLabelHppMSSqlSchemaObjInclude() {
		if( javafxLabelHppMSSqlSchemaObjInclude == null ) {
			javafxLabelHppMSSqlSchemaObjInclude = new HppMSSqlSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppMSSqlSchemaObjInclude );
	}

	public void setJavaFXLabelHppMSSqlSchemaObjInclude( HppMSSqlSchemaObjIncludeCFLabel value ) {
		javafxLabelHppMSSqlSchemaObjInclude = value;
	}

	public HppMSSqlSchemaObjIncludeEditor getJavaFXEditorHppMSSqlSchemaObjInclude() {
		if( javafxEditorHppMSSqlSchemaObjInclude == null ) {
			javafxEditorHppMSSqlSchemaObjInclude = new HppMSSqlSchemaObjIncludeEditor();
		}
		return( javafxEditorHppMSSqlSchemaObjInclude );
	}

	public void setJavaFXEditorHppMSSqlSchemaObjInclude( HppMSSqlSchemaObjIncludeEditor value ) {
		javafxEditorHppMSSqlSchemaObjInclude = value;
	}

	public HppMySqlSchemaObjMembersCFLabel getJavaFXLabelHppMySqlSchemaObjMembers() {
		if( javafxLabelHppMySqlSchemaObjMembers == null ) {
			javafxLabelHppMySqlSchemaObjMembers = new HppMySqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppMySqlSchemaObjMembers );
	}

	public void setJavaFXLabelHppMySqlSchemaObjMembers( HppMySqlSchemaObjMembersCFLabel value ) {
		javafxLabelHppMySqlSchemaObjMembers = value;
	}

	public HppMySqlSchemaObjMembersEditor getJavaFXEditorHppMySqlSchemaObjMembers() {
		if( javafxEditorHppMySqlSchemaObjMembers == null ) {
			javafxEditorHppMySqlSchemaObjMembers = new HppMySqlSchemaObjMembersEditor();
		}
		return( javafxEditorHppMySqlSchemaObjMembers );
	}

	public void setJavaFXEditorHppMySqlSchemaObjMembers( HppMySqlSchemaObjMembersEditor value ) {
		javafxEditorHppMySqlSchemaObjMembers = value;
	}

	public HppMySqlSchemaObjImplCFLabel getJavaFXLabelHppMySqlSchemaObjImpl() {
		if( javafxLabelHppMySqlSchemaObjImpl == null ) {
			javafxLabelHppMySqlSchemaObjImpl = new HppMySqlSchemaObjImplCFLabel();
		}
		return( javafxLabelHppMySqlSchemaObjImpl );
	}

	public void setJavaFXLabelHppMySqlSchemaObjImpl( HppMySqlSchemaObjImplCFLabel value ) {
		javafxLabelHppMySqlSchemaObjImpl = value;
	}

	public HppMySqlSchemaObjImplEditor getJavaFXEditorHppMySqlSchemaObjImpl() {
		if( javafxEditorHppMySqlSchemaObjImpl == null ) {
			javafxEditorHppMySqlSchemaObjImpl = new HppMySqlSchemaObjImplEditor();
		}
		return( javafxEditorHppMySqlSchemaObjImpl );
	}

	public void setJavaFXEditorHppMySqlSchemaObjImpl( HppMySqlSchemaObjImplEditor value ) {
		javafxEditorHppMySqlSchemaObjImpl = value;
	}

	public HppMySqlSchemaObjIncludeCFLabel getJavaFXLabelHppMySqlSchemaObjInclude() {
		if( javafxLabelHppMySqlSchemaObjInclude == null ) {
			javafxLabelHppMySqlSchemaObjInclude = new HppMySqlSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppMySqlSchemaObjInclude );
	}

	public void setJavaFXLabelHppMySqlSchemaObjInclude( HppMySqlSchemaObjIncludeCFLabel value ) {
		javafxLabelHppMySqlSchemaObjInclude = value;
	}

	public HppMySqlSchemaObjIncludeEditor getJavaFXEditorHppMySqlSchemaObjInclude() {
		if( javafxEditorHppMySqlSchemaObjInclude == null ) {
			javafxEditorHppMySqlSchemaObjInclude = new HppMySqlSchemaObjIncludeEditor();
		}
		return( javafxEditorHppMySqlSchemaObjInclude );
	}

	public void setJavaFXEditorHppMySqlSchemaObjInclude( HppMySqlSchemaObjIncludeEditor value ) {
		javafxEditorHppMySqlSchemaObjInclude = value;
	}

	public HppOracleSchemaObjMembersCFLabel getJavaFXLabelHppOracleSchemaObjMembers() {
		if( javafxLabelHppOracleSchemaObjMembers == null ) {
			javafxLabelHppOracleSchemaObjMembers = new HppOracleSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppOracleSchemaObjMembers );
	}

	public void setJavaFXLabelHppOracleSchemaObjMembers( HppOracleSchemaObjMembersCFLabel value ) {
		javafxLabelHppOracleSchemaObjMembers = value;
	}

	public HppOracleSchemaObjMembersEditor getJavaFXEditorHppOracleSchemaObjMembers() {
		if( javafxEditorHppOracleSchemaObjMembers == null ) {
			javafxEditorHppOracleSchemaObjMembers = new HppOracleSchemaObjMembersEditor();
		}
		return( javafxEditorHppOracleSchemaObjMembers );
	}

	public void setJavaFXEditorHppOracleSchemaObjMembers( HppOracleSchemaObjMembersEditor value ) {
		javafxEditorHppOracleSchemaObjMembers = value;
	}

	public HppOracleSchemaObjImplCFLabel getJavaFXLabelHppOracleSchemaObjImpl() {
		if( javafxLabelHppOracleSchemaObjImpl == null ) {
			javafxLabelHppOracleSchemaObjImpl = new HppOracleSchemaObjImplCFLabel();
		}
		return( javafxLabelHppOracleSchemaObjImpl );
	}

	public void setJavaFXLabelHppOracleSchemaObjImpl( HppOracleSchemaObjImplCFLabel value ) {
		javafxLabelHppOracleSchemaObjImpl = value;
	}

	public HppOracleSchemaObjImplEditor getJavaFXEditorHppOracleSchemaObjImpl() {
		if( javafxEditorHppOracleSchemaObjImpl == null ) {
			javafxEditorHppOracleSchemaObjImpl = new HppOracleSchemaObjImplEditor();
		}
		return( javafxEditorHppOracleSchemaObjImpl );
	}

	public void setJavaFXEditorHppOracleSchemaObjImpl( HppOracleSchemaObjImplEditor value ) {
		javafxEditorHppOracleSchemaObjImpl = value;
	}

	public HppOracleSchemaObjIncludeCFLabel getJavaFXLabelHppOracleSchemaObjInclude() {
		if( javafxLabelHppOracleSchemaObjInclude == null ) {
			javafxLabelHppOracleSchemaObjInclude = new HppOracleSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppOracleSchemaObjInclude );
	}

	public void setJavaFXLabelHppOracleSchemaObjInclude( HppOracleSchemaObjIncludeCFLabel value ) {
		javafxLabelHppOracleSchemaObjInclude = value;
	}

	public HppOracleSchemaObjIncludeEditor getJavaFXEditorHppOracleSchemaObjInclude() {
		if( javafxEditorHppOracleSchemaObjInclude == null ) {
			javafxEditorHppOracleSchemaObjInclude = new HppOracleSchemaObjIncludeEditor();
		}
		return( javafxEditorHppOracleSchemaObjInclude );
	}

	public void setJavaFXEditorHppOracleSchemaObjInclude( HppOracleSchemaObjIncludeEditor value ) {
		javafxEditorHppOracleSchemaObjInclude = value;
	}

	public HppPgSqlSchemaObjMembersCFLabel getJavaFXLabelHppPgSqlSchemaObjMembers() {
		if( javafxLabelHppPgSqlSchemaObjMembers == null ) {
			javafxLabelHppPgSqlSchemaObjMembers = new HppPgSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppPgSqlSchemaObjMembers );
	}

	public void setJavaFXLabelHppPgSqlSchemaObjMembers( HppPgSqlSchemaObjMembersCFLabel value ) {
		javafxLabelHppPgSqlSchemaObjMembers = value;
	}

	public HppPgSqlSchemaObjMembersEditor getJavaFXEditorHppPgSqlSchemaObjMembers() {
		if( javafxEditorHppPgSqlSchemaObjMembers == null ) {
			javafxEditorHppPgSqlSchemaObjMembers = new HppPgSqlSchemaObjMembersEditor();
		}
		return( javafxEditorHppPgSqlSchemaObjMembers );
	}

	public void setJavaFXEditorHppPgSqlSchemaObjMembers( HppPgSqlSchemaObjMembersEditor value ) {
		javafxEditorHppPgSqlSchemaObjMembers = value;
	}

	public HppPgSqlSchemaObjImplCFLabel getJavaFXLabelHppPgSqlSchemaObjImpl() {
		if( javafxLabelHppPgSqlSchemaObjImpl == null ) {
			javafxLabelHppPgSqlSchemaObjImpl = new HppPgSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelHppPgSqlSchemaObjImpl );
	}

	public void setJavaFXLabelHppPgSqlSchemaObjImpl( HppPgSqlSchemaObjImplCFLabel value ) {
		javafxLabelHppPgSqlSchemaObjImpl = value;
	}

	public HppPgSqlSchemaObjImplEditor getJavaFXEditorHppPgSqlSchemaObjImpl() {
		if( javafxEditorHppPgSqlSchemaObjImpl == null ) {
			javafxEditorHppPgSqlSchemaObjImpl = new HppPgSqlSchemaObjImplEditor();
		}
		return( javafxEditorHppPgSqlSchemaObjImpl );
	}

	public void setJavaFXEditorHppPgSqlSchemaObjImpl( HppPgSqlSchemaObjImplEditor value ) {
		javafxEditorHppPgSqlSchemaObjImpl = value;
	}

	public HppPgSqlSchemaObjIncludeCFLabel getJavaFXLabelHppPgSqlSchemaObjInclude() {
		if( javafxLabelHppPgSqlSchemaObjInclude == null ) {
			javafxLabelHppPgSqlSchemaObjInclude = new HppPgSqlSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppPgSqlSchemaObjInclude );
	}

	public void setJavaFXLabelHppPgSqlSchemaObjInclude( HppPgSqlSchemaObjIncludeCFLabel value ) {
		javafxLabelHppPgSqlSchemaObjInclude = value;
	}

	public HppPgSqlSchemaObjIncludeEditor getJavaFXEditorHppPgSqlSchemaObjInclude() {
		if( javafxEditorHppPgSqlSchemaObjInclude == null ) {
			javafxEditorHppPgSqlSchemaObjInclude = new HppPgSqlSchemaObjIncludeEditor();
		}
		return( javafxEditorHppPgSqlSchemaObjInclude );
	}

	public void setJavaFXEditorHppPgSqlSchemaObjInclude( HppPgSqlSchemaObjIncludeEditor value ) {
		javafxEditorHppPgSqlSchemaObjInclude = value;
	}

	public HppRamSchemaObjMembersCFLabel getJavaFXLabelHppRamSchemaObjMembers() {
		if( javafxLabelHppRamSchemaObjMembers == null ) {
			javafxLabelHppRamSchemaObjMembers = new HppRamSchemaObjMembersCFLabel();
		}
		return( javafxLabelHppRamSchemaObjMembers );
	}

	public void setJavaFXLabelHppRamSchemaObjMembers( HppRamSchemaObjMembersCFLabel value ) {
		javafxLabelHppRamSchemaObjMembers = value;
	}

	public HppRamSchemaObjMembersEditor getJavaFXEditorHppRamSchemaObjMembers() {
		if( javafxEditorHppRamSchemaObjMembers == null ) {
			javafxEditorHppRamSchemaObjMembers = new HppRamSchemaObjMembersEditor();
		}
		return( javafxEditorHppRamSchemaObjMembers );
	}

	public void setJavaFXEditorHppRamSchemaObjMembers( HppRamSchemaObjMembersEditor value ) {
		javafxEditorHppRamSchemaObjMembers = value;
	}

	public HppRamSchemaObjImplCFLabel getJavaFXLabelHppRamSchemaObjImpl() {
		if( javafxLabelHppRamSchemaObjImpl == null ) {
			javafxLabelHppRamSchemaObjImpl = new HppRamSchemaObjImplCFLabel();
		}
		return( javafxLabelHppRamSchemaObjImpl );
	}

	public void setJavaFXLabelHppRamSchemaObjImpl( HppRamSchemaObjImplCFLabel value ) {
		javafxLabelHppRamSchemaObjImpl = value;
	}

	public HppRamSchemaObjImplEditor getJavaFXEditorHppRamSchemaObjImpl() {
		if( javafxEditorHppRamSchemaObjImpl == null ) {
			javafxEditorHppRamSchemaObjImpl = new HppRamSchemaObjImplEditor();
		}
		return( javafxEditorHppRamSchemaObjImpl );
	}

	public void setJavaFXEditorHppRamSchemaObjImpl( HppRamSchemaObjImplEditor value ) {
		javafxEditorHppRamSchemaObjImpl = value;
	}

	public HppRamSchemaObjIncludeCFLabel getJavaFXLabelHppRamSchemaObjInclude() {
		if( javafxLabelHppRamSchemaObjInclude == null ) {
			javafxLabelHppRamSchemaObjInclude = new HppRamSchemaObjIncludeCFLabel();
		}
		return( javafxLabelHppRamSchemaObjInclude );
	}

	public void setJavaFXLabelHppRamSchemaObjInclude( HppRamSchemaObjIncludeCFLabel value ) {
		javafxLabelHppRamSchemaObjInclude = value;
	}

	public HppRamSchemaObjIncludeEditor getJavaFXEditorHppRamSchemaObjInclude() {
		if( javafxEditorHppRamSchemaObjInclude == null ) {
			javafxEditorHppRamSchemaObjInclude = new HppRamSchemaObjIncludeEditor();
		}
		return( javafxEditorHppRamSchemaObjInclude );
	}

	public void setJavaFXEditorHppRamSchemaObjInclude( HppRamSchemaObjIncludeEditor value ) {
		javafxEditorHppRamSchemaObjInclude = value;
	}

	public HppXMsgSchemaIncludeCFLabel getJavaFXLabelHppXMsgSchemaInclude() {
		if( javafxLabelHppXMsgSchemaInclude == null ) {
			javafxLabelHppXMsgSchemaInclude = new HppXMsgSchemaIncludeCFLabel();
		}
		return( javafxLabelHppXMsgSchemaInclude );
	}

	public void setJavaFXLabelHppXMsgSchemaInclude( HppXMsgSchemaIncludeCFLabel value ) {
		javafxLabelHppXMsgSchemaInclude = value;
	}

	public HppXMsgSchemaIncludeEditor getJavaFXEditorHppXMsgSchemaInclude() {
		if( javafxEditorHppXMsgSchemaInclude == null ) {
			javafxEditorHppXMsgSchemaInclude = new HppXMsgSchemaIncludeEditor();
		}
		return( javafxEditorHppXMsgSchemaInclude );
	}

	public void setJavaFXEditorHppXMsgSchemaInclude( HppXMsgSchemaIncludeEditor value ) {
		javafxEditorHppXMsgSchemaInclude = value;
	}

	public HppXMsgSchemaFormattersCFLabel getJavaFXLabelHppXMsgSchemaFormatters() {
		if( javafxLabelHppXMsgSchemaFormatters == null ) {
			javafxLabelHppXMsgSchemaFormatters = new HppXMsgSchemaFormattersCFLabel();
		}
		return( javafxLabelHppXMsgSchemaFormatters );
	}

	public void setJavaFXLabelHppXMsgSchemaFormatters( HppXMsgSchemaFormattersCFLabel value ) {
		javafxLabelHppXMsgSchemaFormatters = value;
	}

	public HppXMsgSchemaFormattersEditor getJavaFXEditorHppXMsgSchemaFormatters() {
		if( javafxEditorHppXMsgSchemaFormatters == null ) {
			javafxEditorHppXMsgSchemaFormatters = new HppXMsgSchemaFormattersEditor();
		}
		return( javafxEditorHppXMsgSchemaFormatters );
	}

	public void setJavaFXEditorHppXMsgSchemaFormatters( HppXMsgSchemaFormattersEditor value ) {
		javafxEditorHppXMsgSchemaFormatters = value;
	}

	public HppXMsgClientSchemaIncludeCFLabel getJavaFXLabelHppXMsgClientSchemaInclude() {
		if( javafxLabelHppXMsgClientSchemaInclude == null ) {
			javafxLabelHppXMsgClientSchemaInclude = new HppXMsgClientSchemaIncludeCFLabel();
		}
		return( javafxLabelHppXMsgClientSchemaInclude );
	}

	public void setJavaFXLabelHppXMsgClientSchemaInclude( HppXMsgClientSchemaIncludeCFLabel value ) {
		javafxLabelHppXMsgClientSchemaInclude = value;
	}

	public HppXMsgClientSchemaIncludeEditor getJavaFXEditorHppXMsgClientSchemaInclude() {
		if( javafxEditorHppXMsgClientSchemaInclude == null ) {
			javafxEditorHppXMsgClientSchemaInclude = new HppXMsgClientSchemaIncludeEditor();
		}
		return( javafxEditorHppXMsgClientSchemaInclude );
	}

	public void setJavaFXEditorHppXMsgClientSchemaInclude( HppXMsgClientSchemaIncludeEditor value ) {
		javafxEditorHppXMsgClientSchemaInclude = value;
	}

	public HppXMsgClientSchemaBodyCFLabel getJavaFXLabelHppXMsgClientSchemaBody() {
		if( javafxLabelHppXMsgClientSchemaBody == null ) {
			javafxLabelHppXMsgClientSchemaBody = new HppXMsgClientSchemaBodyCFLabel();
		}
		return( javafxLabelHppXMsgClientSchemaBody );
	}

	public void setJavaFXLabelHppXMsgClientSchemaBody( HppXMsgClientSchemaBodyCFLabel value ) {
		javafxLabelHppXMsgClientSchemaBody = value;
	}

	public HppXMsgClientSchemaBodyEditor getJavaFXEditorHppXMsgClientSchemaBody() {
		if( javafxEditorHppXMsgClientSchemaBody == null ) {
			javafxEditorHppXMsgClientSchemaBody = new HppXMsgClientSchemaBodyEditor();
		}
		return( javafxEditorHppXMsgClientSchemaBody );
	}

	public void setJavaFXEditorHppXMsgClientSchemaBody( HppXMsgClientSchemaBodyEditor value ) {
		javafxEditorHppXMsgClientSchemaBody = value;
	}

	public HppXMsgRqstSchemaBodyCFLabel getJavaFXLabelHppXMsgRqstSchemaBody() {
		if( javafxLabelHppXMsgRqstSchemaBody == null ) {
			javafxLabelHppXMsgRqstSchemaBody = new HppXMsgRqstSchemaBodyCFLabel();
		}
		return( javafxLabelHppXMsgRqstSchemaBody );
	}

	public void setJavaFXLabelHppXMsgRqstSchemaBody( HppXMsgRqstSchemaBodyCFLabel value ) {
		javafxLabelHppXMsgRqstSchemaBody = value;
	}

	public HppXMsgRqstSchemaBodyEditor getJavaFXEditorHppXMsgRqstSchemaBody() {
		if( javafxEditorHppXMsgRqstSchemaBody == null ) {
			javafxEditorHppXMsgRqstSchemaBody = new HppXMsgRqstSchemaBodyEditor();
		}
		return( javafxEditorHppXMsgRqstSchemaBody );
	}

	public void setJavaFXEditorHppXMsgRqstSchemaBody( HppXMsgRqstSchemaBodyEditor value ) {
		javafxEditorHppXMsgRqstSchemaBody = value;
	}

	public HppXMsgRqstSchemaIncludeCFLabel getJavaFXLabelHppXMsgRqstSchemaInclude() {
		if( javafxLabelHppXMsgRqstSchemaInclude == null ) {
			javafxLabelHppXMsgRqstSchemaInclude = new HppXMsgRqstSchemaIncludeCFLabel();
		}
		return( javafxLabelHppXMsgRqstSchemaInclude );
	}

	public void setJavaFXLabelHppXMsgRqstSchemaInclude( HppXMsgRqstSchemaIncludeCFLabel value ) {
		javafxLabelHppXMsgRqstSchemaInclude = value;
	}

	public HppXMsgRqstSchemaIncludeEditor getJavaFXEditorHppXMsgRqstSchemaInclude() {
		if( javafxEditorHppXMsgRqstSchemaInclude == null ) {
			javafxEditorHppXMsgRqstSchemaInclude = new HppXMsgRqstSchemaIncludeEditor();
		}
		return( javafxEditorHppXMsgRqstSchemaInclude );
	}

	public void setJavaFXEditorHppXMsgRqstSchemaInclude( HppXMsgRqstSchemaIncludeEditor value ) {
		javafxEditorHppXMsgRqstSchemaInclude = value;
	}

	public HppXMsgRqstSchemaWireParsersCFLabel getJavaFXLabelHppXMsgRqstSchemaWireParsers() {
		if( javafxLabelHppXMsgRqstSchemaWireParsers == null ) {
			javafxLabelHppXMsgRqstSchemaWireParsers = new HppXMsgRqstSchemaWireParsersCFLabel();
		}
		return( javafxLabelHppXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXLabelHppXMsgRqstSchemaWireParsers( HppXMsgRqstSchemaWireParsersCFLabel value ) {
		javafxLabelHppXMsgRqstSchemaWireParsers = value;
	}

	public HppXMsgRqstSchemaWireParsersEditor getJavaFXEditorHppXMsgRqstSchemaWireParsers() {
		if( javafxEditorHppXMsgRqstSchemaWireParsers == null ) {
			javafxEditorHppXMsgRqstSchemaWireParsers = new HppXMsgRqstSchemaWireParsersEditor();
		}
		return( javafxEditorHppXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXEditorHppXMsgRqstSchemaWireParsers( HppXMsgRqstSchemaWireParsersEditor value ) {
		javafxEditorHppXMsgRqstSchemaWireParsers = value;
	}

	public HppXMsgRqstSchemaXsdSpecCFLabel getJavaFXLabelHppXMsgRqstSchemaXsdSpec() {
		if( javafxLabelHppXMsgRqstSchemaXsdSpec == null ) {
			javafxLabelHppXMsgRqstSchemaXsdSpec = new HppXMsgRqstSchemaXsdSpecCFLabel();
		}
		return( javafxLabelHppXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXLabelHppXMsgRqstSchemaXsdSpec( HppXMsgRqstSchemaXsdSpecCFLabel value ) {
		javafxLabelHppXMsgRqstSchemaXsdSpec = value;
	}

	public HppXMsgRqstSchemaXsdSpecEditor getJavaFXEditorHppXMsgRqstSchemaXsdSpec() {
		if( javafxEditorHppXMsgRqstSchemaXsdSpec == null ) {
			javafxEditorHppXMsgRqstSchemaXsdSpec = new HppXMsgRqstSchemaXsdSpecEditor();
		}
		return( javafxEditorHppXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXEditorHppXMsgRqstSchemaXsdSpec( HppXMsgRqstSchemaXsdSpecEditor value ) {
		javafxEditorHppXMsgRqstSchemaXsdSpec = value;
	}

	public HppXMsgRqstSchemaXsdElementListCFLabel getJavaFXLabelHppXMsgRqstSchemaXsdElementList() {
		if( javafxLabelHppXMsgRqstSchemaXsdElementList == null ) {
			javafxLabelHppXMsgRqstSchemaXsdElementList = new HppXMsgRqstSchemaXsdElementListCFLabel();
		}
		return( javafxLabelHppXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXLabelHppXMsgRqstSchemaXsdElementList( HppXMsgRqstSchemaXsdElementListCFLabel value ) {
		javafxLabelHppXMsgRqstSchemaXsdElementList = value;
	}

	public HppXMsgRqstSchemaXsdElementListEditor getJavaFXEditorHppXMsgRqstSchemaXsdElementList() {
		if( javafxEditorHppXMsgRqstSchemaXsdElementList == null ) {
			javafxEditorHppXMsgRqstSchemaXsdElementList = new HppXMsgRqstSchemaXsdElementListEditor();
		}
		return( javafxEditorHppXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXEditorHppXMsgRqstSchemaXsdElementList( HppXMsgRqstSchemaXsdElementListEditor value ) {
		javafxEditorHppXMsgRqstSchemaXsdElementList = value;
	}

	public HppXMsgRspnSchemaBodyCFLabel getJavaFXLabelHppXMsgRspnSchemaBody() {
		if( javafxLabelHppXMsgRspnSchemaBody == null ) {
			javafxLabelHppXMsgRspnSchemaBody = new HppXMsgRspnSchemaBodyCFLabel();
		}
		return( javafxLabelHppXMsgRspnSchemaBody );
	}

	public void setJavaFXLabelHppXMsgRspnSchemaBody( HppXMsgRspnSchemaBodyCFLabel value ) {
		javafxLabelHppXMsgRspnSchemaBody = value;
	}

	public HppXMsgRspnSchemaBodyEditor getJavaFXEditorHppXMsgRspnSchemaBody() {
		if( javafxEditorHppXMsgRspnSchemaBody == null ) {
			javafxEditorHppXMsgRspnSchemaBody = new HppXMsgRspnSchemaBodyEditor();
		}
		return( javafxEditorHppXMsgRspnSchemaBody );
	}

	public void setJavaFXEditorHppXMsgRspnSchemaBody( HppXMsgRspnSchemaBodyEditor value ) {
		javafxEditorHppXMsgRspnSchemaBody = value;
	}

	public HppXMsgRspnSchemaIncludeCFLabel getJavaFXLabelHppXMsgRspnSchemaInclude() {
		if( javafxLabelHppXMsgRspnSchemaInclude == null ) {
			javafxLabelHppXMsgRspnSchemaInclude = new HppXMsgRspnSchemaIncludeCFLabel();
		}
		return( javafxLabelHppXMsgRspnSchemaInclude );
	}

	public void setJavaFXLabelHppXMsgRspnSchemaInclude( HppXMsgRspnSchemaIncludeCFLabel value ) {
		javafxLabelHppXMsgRspnSchemaInclude = value;
	}

	public HppXMsgRspnSchemaIncludeEditor getJavaFXEditorHppXMsgRspnSchemaInclude() {
		if( javafxEditorHppXMsgRspnSchemaInclude == null ) {
			javafxEditorHppXMsgRspnSchemaInclude = new HppXMsgRspnSchemaIncludeEditor();
		}
		return( javafxEditorHppXMsgRspnSchemaInclude );
	}

	public void setJavaFXEditorHppXMsgRspnSchemaInclude( HppXMsgRspnSchemaIncludeEditor value ) {
		javafxEditorHppXMsgRspnSchemaInclude = value;
	}

	public HppXMsgRspnSchemaWireParsersCFLabel getJavaFXLabelHppXMsgRspnSchemaWireParsers() {
		if( javafxLabelHppXMsgRspnSchemaWireParsers == null ) {
			javafxLabelHppXMsgRspnSchemaWireParsers = new HppXMsgRspnSchemaWireParsersCFLabel();
		}
		return( javafxLabelHppXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXLabelHppXMsgRspnSchemaWireParsers( HppXMsgRspnSchemaWireParsersCFLabel value ) {
		javafxLabelHppXMsgRspnSchemaWireParsers = value;
	}

	public HppXMsgRspnSchemaWireParsersEditor getJavaFXEditorHppXMsgRspnSchemaWireParsers() {
		if( javafxEditorHppXMsgRspnSchemaWireParsers == null ) {
			javafxEditorHppXMsgRspnSchemaWireParsers = new HppXMsgRspnSchemaWireParsersEditor();
		}
		return( javafxEditorHppXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXEditorHppXMsgRspnSchemaWireParsers( HppXMsgRspnSchemaWireParsersEditor value ) {
		javafxEditorHppXMsgRspnSchemaWireParsers = value;
	}

	public HppXMsgRspnSchemaXsdElementListCFLabel getJavaFXLabelHppXMsgRspnSchemaXsdElementList() {
		if( javafxLabelHppXMsgRspnSchemaXsdElementList == null ) {
			javafxLabelHppXMsgRspnSchemaXsdElementList = new HppXMsgRspnSchemaXsdElementListCFLabel();
		}
		return( javafxLabelHppXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXLabelHppXMsgRspnSchemaXsdElementList( HppXMsgRspnSchemaXsdElementListCFLabel value ) {
		javafxLabelHppXMsgRspnSchemaXsdElementList = value;
	}

	public HppXMsgRspnSchemaXsdElementListEditor getJavaFXEditorHppXMsgRspnSchemaXsdElementList() {
		if( javafxEditorHppXMsgRspnSchemaXsdElementList == null ) {
			javafxEditorHppXMsgRspnSchemaXsdElementList = new HppXMsgRspnSchemaXsdElementListEditor();
		}
		return( javafxEditorHppXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXEditorHppXMsgRspnSchemaXsdElementList( HppXMsgRspnSchemaXsdElementListEditor value ) {
		javafxEditorHppXMsgRspnSchemaXsdElementList = value;
	}

	public HppXMsgRspnSchemaXsdSpecCFLabel getJavaFXLabelHppXMsgRspnSchemaXsdSpec() {
		if( javafxLabelHppXMsgRspnSchemaXsdSpec == null ) {
			javafxLabelHppXMsgRspnSchemaXsdSpec = new HppXMsgRspnSchemaXsdSpecCFLabel();
		}
		return( javafxLabelHppXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXLabelHppXMsgRspnSchemaXsdSpec( HppXMsgRspnSchemaXsdSpecCFLabel value ) {
		javafxLabelHppXMsgRspnSchemaXsdSpec = value;
	}

	public HppXMsgRspnSchemaXsdSpecEditor getJavaFXEditorHppXMsgRspnSchemaXsdSpec() {
		if( javafxEditorHppXMsgRspnSchemaXsdSpec == null ) {
			javafxEditorHppXMsgRspnSchemaXsdSpec = new HppXMsgRspnSchemaXsdSpecEditor();
		}
		return( javafxEditorHppXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXEditorHppXMsgRspnSchemaXsdSpec( HppXMsgRspnSchemaXsdSpecEditor value ) {
		javafxEditorHppXMsgRspnSchemaXsdSpec = value;
	}

	public CsSchemaObjUsingCFLabel getJavaFXLabelCsSchemaObjUsing() {
		if( javafxLabelCsSchemaObjUsing == null ) {
			javafxLabelCsSchemaObjUsing = new CsSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsSchemaObjUsing );
	}

	public void setJavaFXLabelCsSchemaObjUsing( CsSchemaObjUsingCFLabel value ) {
		javafxLabelCsSchemaObjUsing = value;
	}

	public CsSchemaObjUsingEditor getJavaFXEditorCsSchemaObjUsing() {
		if( javafxEditorCsSchemaObjUsing == null ) {
			javafxEditorCsSchemaObjUsing = new CsSchemaObjUsingEditor();
		}
		return( javafxEditorCsSchemaObjUsing );
	}

	public void setJavaFXEditorCsSchemaObjUsing( CsSchemaObjUsingEditor value ) {
		javafxEditorCsSchemaObjUsing = value;
	}

	public CsSchemaObjInterfaceCFLabel getJavaFXLabelCsSchemaObjInterface() {
		if( javafxLabelCsSchemaObjInterface == null ) {
			javafxLabelCsSchemaObjInterface = new CsSchemaObjInterfaceCFLabel();
		}
		return( javafxLabelCsSchemaObjInterface );
	}

	public void setJavaFXLabelCsSchemaObjInterface( CsSchemaObjInterfaceCFLabel value ) {
		javafxLabelCsSchemaObjInterface = value;
	}

	public CsSchemaObjInterfaceEditor getJavaFXEditorCsSchemaObjInterface() {
		if( javafxEditorCsSchemaObjInterface == null ) {
			javafxEditorCsSchemaObjInterface = new CsSchemaObjInterfaceEditor();
		}
		return( javafxEditorCsSchemaObjInterface );
	}

	public void setJavaFXEditorCsSchemaObjInterface( CsSchemaObjInterfaceEditor value ) {
		javafxEditorCsSchemaObjInterface = value;
	}

	public CsSchemaObjMembersCFLabel getJavaFXLabelCsSchemaObjMembers() {
		if( javafxLabelCsSchemaObjMembers == null ) {
			javafxLabelCsSchemaObjMembers = new CsSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsSchemaObjMembers );
	}

	public void setJavaFXLabelCsSchemaObjMembers( CsSchemaObjMembersCFLabel value ) {
		javafxLabelCsSchemaObjMembers = value;
	}

	public CsSchemaObjMembersEditor getJavaFXEditorCsSchemaObjMembers() {
		if( javafxEditorCsSchemaObjMembers == null ) {
			javafxEditorCsSchemaObjMembers = new CsSchemaObjMembersEditor();
		}
		return( javafxEditorCsSchemaObjMembers );
	}

	public void setJavaFXEditorCsSchemaObjMembers( CsSchemaObjMembersEditor value ) {
		javafxEditorCsSchemaObjMembers = value;
	}

	public CsSchemaObjImplementationCFLabel getJavaFXLabelCsSchemaObjImplementation() {
		if( javafxLabelCsSchemaObjImplementation == null ) {
			javafxLabelCsSchemaObjImplementation = new CsSchemaObjImplementationCFLabel();
		}
		return( javafxLabelCsSchemaObjImplementation );
	}

	public void setJavaFXLabelCsSchemaObjImplementation( CsSchemaObjImplementationCFLabel value ) {
		javafxLabelCsSchemaObjImplementation = value;
	}

	public CsSchemaObjImplementationEditor getJavaFXEditorCsSchemaObjImplementation() {
		if( javafxEditorCsSchemaObjImplementation == null ) {
			javafxEditorCsSchemaObjImplementation = new CsSchemaObjImplementationEditor();
		}
		return( javafxEditorCsSchemaObjImplementation );
	}

	public void setJavaFXEditorCsSchemaObjImplementation( CsSchemaObjImplementationEditor value ) {
		javafxEditorCsSchemaObjImplementation = value;
	}

	public CsDb2LUWSchemaObjMembersCFLabel getJavaFXLabelCsDb2LUWSchemaObjMembers() {
		if( javafxLabelCsDb2LUWSchemaObjMembers == null ) {
			javafxLabelCsDb2LUWSchemaObjMembers = new CsDb2LUWSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsDb2LUWSchemaObjMembers );
	}

	public void setJavaFXLabelCsDb2LUWSchemaObjMembers( CsDb2LUWSchemaObjMembersCFLabel value ) {
		javafxLabelCsDb2LUWSchemaObjMembers = value;
	}

	public CsDb2LUWSchemaObjMembersEditor getJavaFXEditorCsDb2LUWSchemaObjMembers() {
		if( javafxEditorCsDb2LUWSchemaObjMembers == null ) {
			javafxEditorCsDb2LUWSchemaObjMembers = new CsDb2LUWSchemaObjMembersEditor();
		}
		return( javafxEditorCsDb2LUWSchemaObjMembers );
	}

	public void setJavaFXEditorCsDb2LUWSchemaObjMembers( CsDb2LUWSchemaObjMembersEditor value ) {
		javafxEditorCsDb2LUWSchemaObjMembers = value;
	}

	public CsDb2LUWSchemaObjImplCFLabel getJavaFXLabelCsDb2LUWSchemaObjImpl() {
		if( javafxLabelCsDb2LUWSchemaObjImpl == null ) {
			javafxLabelCsDb2LUWSchemaObjImpl = new CsDb2LUWSchemaObjImplCFLabel();
		}
		return( javafxLabelCsDb2LUWSchemaObjImpl );
	}

	public void setJavaFXLabelCsDb2LUWSchemaObjImpl( CsDb2LUWSchemaObjImplCFLabel value ) {
		javafxLabelCsDb2LUWSchemaObjImpl = value;
	}

	public CsDb2LUWSchemaObjImplEditor getJavaFXEditorCsDb2LUWSchemaObjImpl() {
		if( javafxEditorCsDb2LUWSchemaObjImpl == null ) {
			javafxEditorCsDb2LUWSchemaObjImpl = new CsDb2LUWSchemaObjImplEditor();
		}
		return( javafxEditorCsDb2LUWSchemaObjImpl );
	}

	public void setJavaFXEditorCsDb2LUWSchemaObjImpl( CsDb2LUWSchemaObjImplEditor value ) {
		javafxEditorCsDb2LUWSchemaObjImpl = value;
	}

	public CsDb2LUWSchemaObjUsingCFLabel getJavaFXLabelCsDb2LUWSchemaObjUsing() {
		if( javafxLabelCsDb2LUWSchemaObjUsing == null ) {
			javafxLabelCsDb2LUWSchemaObjUsing = new CsDb2LUWSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsDb2LUWSchemaObjUsing );
	}

	public void setJavaFXLabelCsDb2LUWSchemaObjUsing( CsDb2LUWSchemaObjUsingCFLabel value ) {
		javafxLabelCsDb2LUWSchemaObjUsing = value;
	}

	public CsDb2LUWSchemaObjUsingEditor getJavaFXEditorCsDb2LUWSchemaObjUsing() {
		if( javafxEditorCsDb2LUWSchemaObjUsing == null ) {
			javafxEditorCsDb2LUWSchemaObjUsing = new CsDb2LUWSchemaObjUsingEditor();
		}
		return( javafxEditorCsDb2LUWSchemaObjUsing );
	}

	public void setJavaFXEditorCsDb2LUWSchemaObjUsing( CsDb2LUWSchemaObjUsingEditor value ) {
		javafxEditorCsDb2LUWSchemaObjUsing = value;
	}

	public CsMSSqlSchemaObjMembersCFLabel getJavaFXLabelCsMSSqlSchemaObjMembers() {
		if( javafxLabelCsMSSqlSchemaObjMembers == null ) {
			javafxLabelCsMSSqlSchemaObjMembers = new CsMSSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsMSSqlSchemaObjMembers );
	}

	public void setJavaFXLabelCsMSSqlSchemaObjMembers( CsMSSqlSchemaObjMembersCFLabel value ) {
		javafxLabelCsMSSqlSchemaObjMembers = value;
	}

	public CsMSSqlSchemaObjMembersEditor getJavaFXEditorCsMSSqlSchemaObjMembers() {
		if( javafxEditorCsMSSqlSchemaObjMembers == null ) {
			javafxEditorCsMSSqlSchemaObjMembers = new CsMSSqlSchemaObjMembersEditor();
		}
		return( javafxEditorCsMSSqlSchemaObjMembers );
	}

	public void setJavaFXEditorCsMSSqlSchemaObjMembers( CsMSSqlSchemaObjMembersEditor value ) {
		javafxEditorCsMSSqlSchemaObjMembers = value;
	}

	public CsMSSqlSchemaObjImplCFLabel getJavaFXLabelCsMSSqlSchemaObjImpl() {
		if( javafxLabelCsMSSqlSchemaObjImpl == null ) {
			javafxLabelCsMSSqlSchemaObjImpl = new CsMSSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelCsMSSqlSchemaObjImpl );
	}

	public void setJavaFXLabelCsMSSqlSchemaObjImpl( CsMSSqlSchemaObjImplCFLabel value ) {
		javafxLabelCsMSSqlSchemaObjImpl = value;
	}

	public CsMSSqlSchemaObjImplEditor getJavaFXEditorCsMSSqlSchemaObjImpl() {
		if( javafxEditorCsMSSqlSchemaObjImpl == null ) {
			javafxEditorCsMSSqlSchemaObjImpl = new CsMSSqlSchemaObjImplEditor();
		}
		return( javafxEditorCsMSSqlSchemaObjImpl );
	}

	public void setJavaFXEditorCsMSSqlSchemaObjImpl( CsMSSqlSchemaObjImplEditor value ) {
		javafxEditorCsMSSqlSchemaObjImpl = value;
	}

	public CsMSSqlSchemaObjUsingCFLabel getJavaFXLabelCsMSSqlSchemaObjUsing() {
		if( javafxLabelCsMSSqlSchemaObjUsing == null ) {
			javafxLabelCsMSSqlSchemaObjUsing = new CsMSSqlSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsMSSqlSchemaObjUsing );
	}

	public void setJavaFXLabelCsMSSqlSchemaObjUsing( CsMSSqlSchemaObjUsingCFLabel value ) {
		javafxLabelCsMSSqlSchemaObjUsing = value;
	}

	public CsMSSqlSchemaObjUsingEditor getJavaFXEditorCsMSSqlSchemaObjUsing() {
		if( javafxEditorCsMSSqlSchemaObjUsing == null ) {
			javafxEditorCsMSSqlSchemaObjUsing = new CsMSSqlSchemaObjUsingEditor();
		}
		return( javafxEditorCsMSSqlSchemaObjUsing );
	}

	public void setJavaFXEditorCsMSSqlSchemaObjUsing( CsMSSqlSchemaObjUsingEditor value ) {
		javafxEditorCsMSSqlSchemaObjUsing = value;
	}

	public CsMySqlSchemaObjMembersCFLabel getJavaFXLabelCsMySqlSchemaObjMembers() {
		if( javafxLabelCsMySqlSchemaObjMembers == null ) {
			javafxLabelCsMySqlSchemaObjMembers = new CsMySqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsMySqlSchemaObjMembers );
	}

	public void setJavaFXLabelCsMySqlSchemaObjMembers( CsMySqlSchemaObjMembersCFLabel value ) {
		javafxLabelCsMySqlSchemaObjMembers = value;
	}

	public CsMySqlSchemaObjMembersEditor getJavaFXEditorCsMySqlSchemaObjMembers() {
		if( javafxEditorCsMySqlSchemaObjMembers == null ) {
			javafxEditorCsMySqlSchemaObjMembers = new CsMySqlSchemaObjMembersEditor();
		}
		return( javafxEditorCsMySqlSchemaObjMembers );
	}

	public void setJavaFXEditorCsMySqlSchemaObjMembers( CsMySqlSchemaObjMembersEditor value ) {
		javafxEditorCsMySqlSchemaObjMembers = value;
	}

	public CsMySqlSchemaObjImplCFLabel getJavaFXLabelCsMySqlSchemaObjImpl() {
		if( javafxLabelCsMySqlSchemaObjImpl == null ) {
			javafxLabelCsMySqlSchemaObjImpl = new CsMySqlSchemaObjImplCFLabel();
		}
		return( javafxLabelCsMySqlSchemaObjImpl );
	}

	public void setJavaFXLabelCsMySqlSchemaObjImpl( CsMySqlSchemaObjImplCFLabel value ) {
		javafxLabelCsMySqlSchemaObjImpl = value;
	}

	public CsMySqlSchemaObjImplEditor getJavaFXEditorCsMySqlSchemaObjImpl() {
		if( javafxEditorCsMySqlSchemaObjImpl == null ) {
			javafxEditorCsMySqlSchemaObjImpl = new CsMySqlSchemaObjImplEditor();
		}
		return( javafxEditorCsMySqlSchemaObjImpl );
	}

	public void setJavaFXEditorCsMySqlSchemaObjImpl( CsMySqlSchemaObjImplEditor value ) {
		javafxEditorCsMySqlSchemaObjImpl = value;
	}

	public CsMySqlSchemaObjUsingCFLabel getJavaFXLabelCsMySqlSchemaObjUsing() {
		if( javafxLabelCsMySqlSchemaObjUsing == null ) {
			javafxLabelCsMySqlSchemaObjUsing = new CsMySqlSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsMySqlSchemaObjUsing );
	}

	public void setJavaFXLabelCsMySqlSchemaObjUsing( CsMySqlSchemaObjUsingCFLabel value ) {
		javafxLabelCsMySqlSchemaObjUsing = value;
	}

	public CsMySqlSchemaObjUsingEditor getJavaFXEditorCsMySqlSchemaObjUsing() {
		if( javafxEditorCsMySqlSchemaObjUsing == null ) {
			javafxEditorCsMySqlSchemaObjUsing = new CsMySqlSchemaObjUsingEditor();
		}
		return( javafxEditorCsMySqlSchemaObjUsing );
	}

	public void setJavaFXEditorCsMySqlSchemaObjUsing( CsMySqlSchemaObjUsingEditor value ) {
		javafxEditorCsMySqlSchemaObjUsing = value;
	}

	public CsOracleSchemaObjMembersCFLabel getJavaFXLabelCsOracleSchemaObjMembers() {
		if( javafxLabelCsOracleSchemaObjMembers == null ) {
			javafxLabelCsOracleSchemaObjMembers = new CsOracleSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsOracleSchemaObjMembers );
	}

	public void setJavaFXLabelCsOracleSchemaObjMembers( CsOracleSchemaObjMembersCFLabel value ) {
		javafxLabelCsOracleSchemaObjMembers = value;
	}

	public CsOracleSchemaObjMembersEditor getJavaFXEditorCsOracleSchemaObjMembers() {
		if( javafxEditorCsOracleSchemaObjMembers == null ) {
			javafxEditorCsOracleSchemaObjMembers = new CsOracleSchemaObjMembersEditor();
		}
		return( javafxEditorCsOracleSchemaObjMembers );
	}

	public void setJavaFXEditorCsOracleSchemaObjMembers( CsOracleSchemaObjMembersEditor value ) {
		javafxEditorCsOracleSchemaObjMembers = value;
	}

	public CsOracleSchemaObjImplCFLabel getJavaFXLabelCsOracleSchemaObjImpl() {
		if( javafxLabelCsOracleSchemaObjImpl == null ) {
			javafxLabelCsOracleSchemaObjImpl = new CsOracleSchemaObjImplCFLabel();
		}
		return( javafxLabelCsOracleSchemaObjImpl );
	}

	public void setJavaFXLabelCsOracleSchemaObjImpl( CsOracleSchemaObjImplCFLabel value ) {
		javafxLabelCsOracleSchemaObjImpl = value;
	}

	public CsOracleSchemaObjImplEditor getJavaFXEditorCsOracleSchemaObjImpl() {
		if( javafxEditorCsOracleSchemaObjImpl == null ) {
			javafxEditorCsOracleSchemaObjImpl = new CsOracleSchemaObjImplEditor();
		}
		return( javafxEditorCsOracleSchemaObjImpl );
	}

	public void setJavaFXEditorCsOracleSchemaObjImpl( CsOracleSchemaObjImplEditor value ) {
		javafxEditorCsOracleSchemaObjImpl = value;
	}

	public CsOracleSchemaObjUsingCFLabel getJavaFXLabelCsOracleSchemaObjUsing() {
		if( javafxLabelCsOracleSchemaObjUsing == null ) {
			javafxLabelCsOracleSchemaObjUsing = new CsOracleSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsOracleSchemaObjUsing );
	}

	public void setJavaFXLabelCsOracleSchemaObjUsing( CsOracleSchemaObjUsingCFLabel value ) {
		javafxLabelCsOracleSchemaObjUsing = value;
	}

	public CsOracleSchemaObjUsingEditor getJavaFXEditorCsOracleSchemaObjUsing() {
		if( javafxEditorCsOracleSchemaObjUsing == null ) {
			javafxEditorCsOracleSchemaObjUsing = new CsOracleSchemaObjUsingEditor();
		}
		return( javafxEditorCsOracleSchemaObjUsing );
	}

	public void setJavaFXEditorCsOracleSchemaObjUsing( CsOracleSchemaObjUsingEditor value ) {
		javafxEditorCsOracleSchemaObjUsing = value;
	}

	public CsPgSqlSchemaObjMembersCFLabel getJavaFXLabelCsPgSqlSchemaObjMembers() {
		if( javafxLabelCsPgSqlSchemaObjMembers == null ) {
			javafxLabelCsPgSqlSchemaObjMembers = new CsPgSqlSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsPgSqlSchemaObjMembers );
	}

	public void setJavaFXLabelCsPgSqlSchemaObjMembers( CsPgSqlSchemaObjMembersCFLabel value ) {
		javafxLabelCsPgSqlSchemaObjMembers = value;
	}

	public CsPgSqlSchemaObjMembersEditor getJavaFXEditorCsPgSqlSchemaObjMembers() {
		if( javafxEditorCsPgSqlSchemaObjMembers == null ) {
			javafxEditorCsPgSqlSchemaObjMembers = new CsPgSqlSchemaObjMembersEditor();
		}
		return( javafxEditorCsPgSqlSchemaObjMembers );
	}

	public void setJavaFXEditorCsPgSqlSchemaObjMembers( CsPgSqlSchemaObjMembersEditor value ) {
		javafxEditorCsPgSqlSchemaObjMembers = value;
	}

	public CsPgSqlSchemaObjImplCFLabel getJavaFXLabelCsPgSqlSchemaObjImpl() {
		if( javafxLabelCsPgSqlSchemaObjImpl == null ) {
			javafxLabelCsPgSqlSchemaObjImpl = new CsPgSqlSchemaObjImplCFLabel();
		}
		return( javafxLabelCsPgSqlSchemaObjImpl );
	}

	public void setJavaFXLabelCsPgSqlSchemaObjImpl( CsPgSqlSchemaObjImplCFLabel value ) {
		javafxLabelCsPgSqlSchemaObjImpl = value;
	}

	public CsPgSqlSchemaObjImplEditor getJavaFXEditorCsPgSqlSchemaObjImpl() {
		if( javafxEditorCsPgSqlSchemaObjImpl == null ) {
			javafxEditorCsPgSqlSchemaObjImpl = new CsPgSqlSchemaObjImplEditor();
		}
		return( javafxEditorCsPgSqlSchemaObjImpl );
	}

	public void setJavaFXEditorCsPgSqlSchemaObjImpl( CsPgSqlSchemaObjImplEditor value ) {
		javafxEditorCsPgSqlSchemaObjImpl = value;
	}

	public CsPgSqlSchemaObjUsingCFLabel getJavaFXLabelCsPgSqlSchemaObjUsing() {
		if( javafxLabelCsPgSqlSchemaObjUsing == null ) {
			javafxLabelCsPgSqlSchemaObjUsing = new CsPgSqlSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsPgSqlSchemaObjUsing );
	}

	public void setJavaFXLabelCsPgSqlSchemaObjUsing( CsPgSqlSchemaObjUsingCFLabel value ) {
		javafxLabelCsPgSqlSchemaObjUsing = value;
	}

	public CsPgSqlSchemaObjUsingEditor getJavaFXEditorCsPgSqlSchemaObjUsing() {
		if( javafxEditorCsPgSqlSchemaObjUsing == null ) {
			javafxEditorCsPgSqlSchemaObjUsing = new CsPgSqlSchemaObjUsingEditor();
		}
		return( javafxEditorCsPgSqlSchemaObjUsing );
	}

	public void setJavaFXEditorCsPgSqlSchemaObjUsing( CsPgSqlSchemaObjUsingEditor value ) {
		javafxEditorCsPgSqlSchemaObjUsing = value;
	}

	public CsRamSchemaObjMembersCFLabel getJavaFXLabelCsRamSchemaObjMembers() {
		if( javafxLabelCsRamSchemaObjMembers == null ) {
			javafxLabelCsRamSchemaObjMembers = new CsRamSchemaObjMembersCFLabel();
		}
		return( javafxLabelCsRamSchemaObjMembers );
	}

	public void setJavaFXLabelCsRamSchemaObjMembers( CsRamSchemaObjMembersCFLabel value ) {
		javafxLabelCsRamSchemaObjMembers = value;
	}

	public CsRamSchemaObjMembersEditor getJavaFXEditorCsRamSchemaObjMembers() {
		if( javafxEditorCsRamSchemaObjMembers == null ) {
			javafxEditorCsRamSchemaObjMembers = new CsRamSchemaObjMembersEditor();
		}
		return( javafxEditorCsRamSchemaObjMembers );
	}

	public void setJavaFXEditorCsRamSchemaObjMembers( CsRamSchemaObjMembersEditor value ) {
		javafxEditorCsRamSchemaObjMembers = value;
	}

	public CsRamSchemaObjImplCFLabel getJavaFXLabelCsRamSchemaObjImpl() {
		if( javafxLabelCsRamSchemaObjImpl == null ) {
			javafxLabelCsRamSchemaObjImpl = new CsRamSchemaObjImplCFLabel();
		}
		return( javafxLabelCsRamSchemaObjImpl );
	}

	public void setJavaFXLabelCsRamSchemaObjImpl( CsRamSchemaObjImplCFLabel value ) {
		javafxLabelCsRamSchemaObjImpl = value;
	}

	public CsRamSchemaObjImplEditor getJavaFXEditorCsRamSchemaObjImpl() {
		if( javafxEditorCsRamSchemaObjImpl == null ) {
			javafxEditorCsRamSchemaObjImpl = new CsRamSchemaObjImplEditor();
		}
		return( javafxEditorCsRamSchemaObjImpl );
	}

	public void setJavaFXEditorCsRamSchemaObjImpl( CsRamSchemaObjImplEditor value ) {
		javafxEditorCsRamSchemaObjImpl = value;
	}

	public CsRamSchemaObjUsingCFLabel getJavaFXLabelCsRamSchemaObjUsing() {
		if( javafxLabelCsRamSchemaObjUsing == null ) {
			javafxLabelCsRamSchemaObjUsing = new CsRamSchemaObjUsingCFLabel();
		}
		return( javafxLabelCsRamSchemaObjUsing );
	}

	public void setJavaFXLabelCsRamSchemaObjUsing( CsRamSchemaObjUsingCFLabel value ) {
		javafxLabelCsRamSchemaObjUsing = value;
	}

	public CsRamSchemaObjUsingEditor getJavaFXEditorCsRamSchemaObjUsing() {
		if( javafxEditorCsRamSchemaObjUsing == null ) {
			javafxEditorCsRamSchemaObjUsing = new CsRamSchemaObjUsingEditor();
		}
		return( javafxEditorCsRamSchemaObjUsing );
	}

	public void setJavaFXEditorCsRamSchemaObjUsing( CsRamSchemaObjUsingEditor value ) {
		javafxEditorCsRamSchemaObjUsing = value;
	}

	public CsXMsgSchemaUsingCFLabel getJavaFXLabelCsXMsgSchemaUsing() {
		if( javafxLabelCsXMsgSchemaUsing == null ) {
			javafxLabelCsXMsgSchemaUsing = new CsXMsgSchemaUsingCFLabel();
		}
		return( javafxLabelCsXMsgSchemaUsing );
	}

	public void setJavaFXLabelCsXMsgSchemaUsing( CsXMsgSchemaUsingCFLabel value ) {
		javafxLabelCsXMsgSchemaUsing = value;
	}

	public CsXMsgSchemaUsingEditor getJavaFXEditorCsXMsgSchemaUsing() {
		if( javafxEditorCsXMsgSchemaUsing == null ) {
			javafxEditorCsXMsgSchemaUsing = new CsXMsgSchemaUsingEditor();
		}
		return( javafxEditorCsXMsgSchemaUsing );
	}

	public void setJavaFXEditorCsXMsgSchemaUsing( CsXMsgSchemaUsingEditor value ) {
		javafxEditorCsXMsgSchemaUsing = value;
	}

	public CsXMsgSchemaFormattersCFLabel getJavaFXLabelCsXMsgSchemaFormatters() {
		if( javafxLabelCsXMsgSchemaFormatters == null ) {
			javafxLabelCsXMsgSchemaFormatters = new CsXMsgSchemaFormattersCFLabel();
		}
		return( javafxLabelCsXMsgSchemaFormatters );
	}

	public void setJavaFXLabelCsXMsgSchemaFormatters( CsXMsgSchemaFormattersCFLabel value ) {
		javafxLabelCsXMsgSchemaFormatters = value;
	}

	public CsXMsgSchemaFormattersEditor getJavaFXEditorCsXMsgSchemaFormatters() {
		if( javafxEditorCsXMsgSchemaFormatters == null ) {
			javafxEditorCsXMsgSchemaFormatters = new CsXMsgSchemaFormattersEditor();
		}
		return( javafxEditorCsXMsgSchemaFormatters );
	}

	public void setJavaFXEditorCsXMsgSchemaFormatters( CsXMsgSchemaFormattersEditor value ) {
		javafxEditorCsXMsgSchemaFormatters = value;
	}

	public CsXMsgClientSchemaUsingCFLabel getJavaFXLabelCsXMsgClientSchemaUsing() {
		if( javafxLabelCsXMsgClientSchemaUsing == null ) {
			javafxLabelCsXMsgClientSchemaUsing = new CsXMsgClientSchemaUsingCFLabel();
		}
		return( javafxLabelCsXMsgClientSchemaUsing );
	}

	public void setJavaFXLabelCsXMsgClientSchemaUsing( CsXMsgClientSchemaUsingCFLabel value ) {
		javafxLabelCsXMsgClientSchemaUsing = value;
	}

	public CsXMsgClientSchemaUsingEditor getJavaFXEditorCsXMsgClientSchemaUsing() {
		if( javafxEditorCsXMsgClientSchemaUsing == null ) {
			javafxEditorCsXMsgClientSchemaUsing = new CsXMsgClientSchemaUsingEditor();
		}
		return( javafxEditorCsXMsgClientSchemaUsing );
	}

	public void setJavaFXEditorCsXMsgClientSchemaUsing( CsXMsgClientSchemaUsingEditor value ) {
		javafxEditorCsXMsgClientSchemaUsing = value;
	}

	public CsXMsgClientSchemaBodyCFLabel getJavaFXLabelCsXMsgClientSchemaBody() {
		if( javafxLabelCsXMsgClientSchemaBody == null ) {
			javafxLabelCsXMsgClientSchemaBody = new CsXMsgClientSchemaBodyCFLabel();
		}
		return( javafxLabelCsXMsgClientSchemaBody );
	}

	public void setJavaFXLabelCsXMsgClientSchemaBody( CsXMsgClientSchemaBodyCFLabel value ) {
		javafxLabelCsXMsgClientSchemaBody = value;
	}

	public CsXMsgClientSchemaBodyEditor getJavaFXEditorCsXMsgClientSchemaBody() {
		if( javafxEditorCsXMsgClientSchemaBody == null ) {
			javafxEditorCsXMsgClientSchemaBody = new CsXMsgClientSchemaBodyEditor();
		}
		return( javafxEditorCsXMsgClientSchemaBody );
	}

	public void setJavaFXEditorCsXMsgClientSchemaBody( CsXMsgClientSchemaBodyEditor value ) {
		javafxEditorCsXMsgClientSchemaBody = value;
	}

	public CsXMsgRqstSchemaBodyCFLabel getJavaFXLabelCsXMsgRqstSchemaBody() {
		if( javafxLabelCsXMsgRqstSchemaBody == null ) {
			javafxLabelCsXMsgRqstSchemaBody = new CsXMsgRqstSchemaBodyCFLabel();
		}
		return( javafxLabelCsXMsgRqstSchemaBody );
	}

	public void setJavaFXLabelCsXMsgRqstSchemaBody( CsXMsgRqstSchemaBodyCFLabel value ) {
		javafxLabelCsXMsgRqstSchemaBody = value;
	}

	public CsXMsgRqstSchemaBodyEditor getJavaFXEditorCsXMsgRqstSchemaBody() {
		if( javafxEditorCsXMsgRqstSchemaBody == null ) {
			javafxEditorCsXMsgRqstSchemaBody = new CsXMsgRqstSchemaBodyEditor();
		}
		return( javafxEditorCsXMsgRqstSchemaBody );
	}

	public void setJavaFXEditorCsXMsgRqstSchemaBody( CsXMsgRqstSchemaBodyEditor value ) {
		javafxEditorCsXMsgRqstSchemaBody = value;
	}

	public CsXMsgRqstSchemaUsingCFLabel getJavaFXLabelCsXMsgRqstSchemaUsing() {
		if( javafxLabelCsXMsgRqstSchemaUsing == null ) {
			javafxLabelCsXMsgRqstSchemaUsing = new CsXMsgRqstSchemaUsingCFLabel();
		}
		return( javafxLabelCsXMsgRqstSchemaUsing );
	}

	public void setJavaFXLabelCsXMsgRqstSchemaUsing( CsXMsgRqstSchemaUsingCFLabel value ) {
		javafxLabelCsXMsgRqstSchemaUsing = value;
	}

	public CsXMsgRqstSchemaUsingEditor getJavaFXEditorCsXMsgRqstSchemaUsing() {
		if( javafxEditorCsXMsgRqstSchemaUsing == null ) {
			javafxEditorCsXMsgRqstSchemaUsing = new CsXMsgRqstSchemaUsingEditor();
		}
		return( javafxEditorCsXMsgRqstSchemaUsing );
	}

	public void setJavaFXEditorCsXMsgRqstSchemaUsing( CsXMsgRqstSchemaUsingEditor value ) {
		javafxEditorCsXMsgRqstSchemaUsing = value;
	}

	public CsXMsgRqstSchemaWireParsersCFLabel getJavaFXLabelCsXMsgRqstSchemaWireParsers() {
		if( javafxLabelCsXMsgRqstSchemaWireParsers == null ) {
			javafxLabelCsXMsgRqstSchemaWireParsers = new CsXMsgRqstSchemaWireParsersCFLabel();
		}
		return( javafxLabelCsXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXLabelCsXMsgRqstSchemaWireParsers( CsXMsgRqstSchemaWireParsersCFLabel value ) {
		javafxLabelCsXMsgRqstSchemaWireParsers = value;
	}

	public CsXMsgRqstSchemaWireParsersEditor getJavaFXEditorCsXMsgRqstSchemaWireParsers() {
		if( javafxEditorCsXMsgRqstSchemaWireParsers == null ) {
			javafxEditorCsXMsgRqstSchemaWireParsers = new CsXMsgRqstSchemaWireParsersEditor();
		}
		return( javafxEditorCsXMsgRqstSchemaWireParsers );
	}

	public void setJavaFXEditorCsXMsgRqstSchemaWireParsers( CsXMsgRqstSchemaWireParsersEditor value ) {
		javafxEditorCsXMsgRqstSchemaWireParsers = value;
	}

	public CsXMsgRqstSchemaXsdSpecCFLabel getJavaFXLabelCsXMsgRqstSchemaXsdSpec() {
		if( javafxLabelCsXMsgRqstSchemaXsdSpec == null ) {
			javafxLabelCsXMsgRqstSchemaXsdSpec = new CsXMsgRqstSchemaXsdSpecCFLabel();
		}
		return( javafxLabelCsXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXLabelCsXMsgRqstSchemaXsdSpec( CsXMsgRqstSchemaXsdSpecCFLabel value ) {
		javafxLabelCsXMsgRqstSchemaXsdSpec = value;
	}

	public CsXMsgRqstSchemaXsdSpecEditor getJavaFXEditorCsXMsgRqstSchemaXsdSpec() {
		if( javafxEditorCsXMsgRqstSchemaXsdSpec == null ) {
			javafxEditorCsXMsgRqstSchemaXsdSpec = new CsXMsgRqstSchemaXsdSpecEditor();
		}
		return( javafxEditorCsXMsgRqstSchemaXsdSpec );
	}

	public void setJavaFXEditorCsXMsgRqstSchemaXsdSpec( CsXMsgRqstSchemaXsdSpecEditor value ) {
		javafxEditorCsXMsgRqstSchemaXsdSpec = value;
	}

	public CsXMsgRqstSchemaXsdElementListCFLabel getJavaFXLabelCsXMsgRqstSchemaXsdElementList() {
		if( javafxLabelCsXMsgRqstSchemaXsdElementList == null ) {
			javafxLabelCsXMsgRqstSchemaXsdElementList = new CsXMsgRqstSchemaXsdElementListCFLabel();
		}
		return( javafxLabelCsXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXLabelCsXMsgRqstSchemaXsdElementList( CsXMsgRqstSchemaXsdElementListCFLabel value ) {
		javafxLabelCsXMsgRqstSchemaXsdElementList = value;
	}

	public CsXMsgRqstSchemaXsdElementListEditor getJavaFXEditorCsXMsgRqstSchemaXsdElementList() {
		if( javafxEditorCsXMsgRqstSchemaXsdElementList == null ) {
			javafxEditorCsXMsgRqstSchemaXsdElementList = new CsXMsgRqstSchemaXsdElementListEditor();
		}
		return( javafxEditorCsXMsgRqstSchemaXsdElementList );
	}

	public void setJavaFXEditorCsXMsgRqstSchemaXsdElementList( CsXMsgRqstSchemaXsdElementListEditor value ) {
		javafxEditorCsXMsgRqstSchemaXsdElementList = value;
	}

	public CsXMsgRspnSchemaBodyCFLabel getJavaFXLabelCsXMsgRspnSchemaBody() {
		if( javafxLabelCsXMsgRspnSchemaBody == null ) {
			javafxLabelCsXMsgRspnSchemaBody = new CsXMsgRspnSchemaBodyCFLabel();
		}
		return( javafxLabelCsXMsgRspnSchemaBody );
	}

	public void setJavaFXLabelCsXMsgRspnSchemaBody( CsXMsgRspnSchemaBodyCFLabel value ) {
		javafxLabelCsXMsgRspnSchemaBody = value;
	}

	public CsXMsgRspnSchemaBodyEditor getJavaFXEditorCsXMsgRspnSchemaBody() {
		if( javafxEditorCsXMsgRspnSchemaBody == null ) {
			javafxEditorCsXMsgRspnSchemaBody = new CsXMsgRspnSchemaBodyEditor();
		}
		return( javafxEditorCsXMsgRspnSchemaBody );
	}

	public void setJavaFXEditorCsXMsgRspnSchemaBody( CsXMsgRspnSchemaBodyEditor value ) {
		javafxEditorCsXMsgRspnSchemaBody = value;
	}

	public CsXMsgRspnSchemaUsingCFLabel getJavaFXLabelCsXMsgRspnSchemaUsing() {
		if( javafxLabelCsXMsgRspnSchemaUsing == null ) {
			javafxLabelCsXMsgRspnSchemaUsing = new CsXMsgRspnSchemaUsingCFLabel();
		}
		return( javafxLabelCsXMsgRspnSchemaUsing );
	}

	public void setJavaFXLabelCsXMsgRspnSchemaUsing( CsXMsgRspnSchemaUsingCFLabel value ) {
		javafxLabelCsXMsgRspnSchemaUsing = value;
	}

	public CsXMsgRspnSchemaUsingEditor getJavaFXEditorCsXMsgRspnSchemaUsing() {
		if( javafxEditorCsXMsgRspnSchemaUsing == null ) {
			javafxEditorCsXMsgRspnSchemaUsing = new CsXMsgRspnSchemaUsingEditor();
		}
		return( javafxEditorCsXMsgRspnSchemaUsing );
	}

	public void setJavaFXEditorCsXMsgRspnSchemaUsing( CsXMsgRspnSchemaUsingEditor value ) {
		javafxEditorCsXMsgRspnSchemaUsing = value;
	}

	public CsXMsgRspnSchemaWireParsersCFLabel getJavaFXLabelCsXMsgRspnSchemaWireParsers() {
		if( javafxLabelCsXMsgRspnSchemaWireParsers == null ) {
			javafxLabelCsXMsgRspnSchemaWireParsers = new CsXMsgRspnSchemaWireParsersCFLabel();
		}
		return( javafxLabelCsXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXLabelCsXMsgRspnSchemaWireParsers( CsXMsgRspnSchemaWireParsersCFLabel value ) {
		javafxLabelCsXMsgRspnSchemaWireParsers = value;
	}

	public CsXMsgRspnSchemaWireParsersEditor getJavaFXEditorCsXMsgRspnSchemaWireParsers() {
		if( javafxEditorCsXMsgRspnSchemaWireParsers == null ) {
			javafxEditorCsXMsgRspnSchemaWireParsers = new CsXMsgRspnSchemaWireParsersEditor();
		}
		return( javafxEditorCsXMsgRspnSchemaWireParsers );
	}

	public void setJavaFXEditorCsXMsgRspnSchemaWireParsers( CsXMsgRspnSchemaWireParsersEditor value ) {
		javafxEditorCsXMsgRspnSchemaWireParsers = value;
	}

	public CsXMsgRspnSchemaXsdElementListCFLabel getJavaFXLabelCsXMsgRspnSchemaXsdElementList() {
		if( javafxLabelCsXMsgRspnSchemaXsdElementList == null ) {
			javafxLabelCsXMsgRspnSchemaXsdElementList = new CsXMsgRspnSchemaXsdElementListCFLabel();
		}
		return( javafxLabelCsXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXLabelCsXMsgRspnSchemaXsdElementList( CsXMsgRspnSchemaXsdElementListCFLabel value ) {
		javafxLabelCsXMsgRspnSchemaXsdElementList = value;
	}

	public CsXMsgRspnSchemaXsdElementListEditor getJavaFXEditorCsXMsgRspnSchemaXsdElementList() {
		if( javafxEditorCsXMsgRspnSchemaXsdElementList == null ) {
			javafxEditorCsXMsgRspnSchemaXsdElementList = new CsXMsgRspnSchemaXsdElementListEditor();
		}
		return( javafxEditorCsXMsgRspnSchemaXsdElementList );
	}

	public void setJavaFXEditorCsXMsgRspnSchemaXsdElementList( CsXMsgRspnSchemaXsdElementListEditor value ) {
		javafxEditorCsXMsgRspnSchemaXsdElementList = value;
	}

	public CsXMsgRspnSchemaXsdSpecCFLabel getJavaFXLabelCsXMsgRspnSchemaXsdSpec() {
		if( javafxLabelCsXMsgRspnSchemaXsdSpec == null ) {
			javafxLabelCsXMsgRspnSchemaXsdSpec = new CsXMsgRspnSchemaXsdSpecCFLabel();
		}
		return( javafxLabelCsXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXLabelCsXMsgRspnSchemaXsdSpec( CsXMsgRspnSchemaXsdSpecCFLabel value ) {
		javafxLabelCsXMsgRspnSchemaXsdSpec = value;
	}

	public CsXMsgRspnSchemaXsdSpecEditor getJavaFXEditorCsXMsgRspnSchemaXsdSpec() {
		if( javafxEditorCsXMsgRspnSchemaXsdSpec == null ) {
			javafxEditorCsXMsgRspnSchemaXsdSpec = new CsXMsgRspnSchemaXsdSpecEditor();
		}
		return( javafxEditorCsXMsgRspnSchemaXsdSpec );
	}

	public void setJavaFXEditorCsXMsgRspnSchemaXsdSpec( CsXMsgRspnSchemaXsdSpecEditor value ) {
		javafxEditorCsXMsgRspnSchemaXsdSpec = value;
	}

	public void populateFields()
	{
		ICFBamSchemaDefObj popObj = getEffJavaFXFocus();
		if( getPaneMode() == CFPane.PaneMode.Unknown ) {
			popObj = null;
		}
		if( popObj == null ) {
			getJavaFXEditorId().setInt64Value( null );
		}
		else {
			getJavaFXEditorId().setInt64Value( popObj.getRequiredId() );
		}

		if( popObj == null ) {
			getJavaFXEditorName().setStringValue( null );
		}
		else {
			getJavaFXEditorName().setStringValue( popObj.getRequiredName() );
		}

		if( popObj == null ) {
			getJavaFXEditorDbName().setStringValue( null );
		}
		else {
			getJavaFXEditorDbName().setStringValue( popObj.getOptionalDbName() );
		}

		if( popObj == null ) {
			getJavaFXEditorShortName().setStringValue( null );
		}
		else {
			getJavaFXEditorShortName().setStringValue( popObj.getOptionalShortName() );
		}

		if( popObj == null ) {
			getJavaFXEditorLabel().setStringValue( null );
		}
		else {
			getJavaFXEditorLabel().setStringValue( popObj.getOptionalLabel() );
		}

		if( popObj == null ) {
			getJavaFXEditorShortDescription().setStringValue( null );
		}
		else {
			getJavaFXEditorShortDescription().setStringValue( popObj.getOptionalShortDescription() );
		}

		if( popObj == null ) {
			getJavaFXEditorDescription().setStringValue( null );
		}
		else {
			getJavaFXEditorDescription().setStringValue( popObj.getOptionalDescription() );
		}

		if( popObj == null ) {
			getJavaFXEditorPublicLicenseName().setStringValue( null );
		}
		else {
			getJavaFXEditorPublicLicenseName().setStringValue( popObj.getRequiredPublicLicenseName() );
		}

		if( popObj == null ) {
			getJavaFXEditorPublicLicenseText().setTextValue( null );
		}
		else {
			getJavaFXEditorPublicLicenseText().setTextValue( popObj.getRequiredPublicLicenseText() );
		}

		if( popObj == null ) {
			getJavaFXEditorImplementationLicenseName().setStringValue( null );
		}
		else {
			getJavaFXEditorImplementationLicenseName().setStringValue( popObj.getOptionalImplementationLicenseName() );
		}

		if( popObj == null ) {
			getJavaFXEditorImplementationLicenseText().setTextValue( null );
		}
		else {
			getJavaFXEditorImplementationLicenseText().setTextValue( popObj.getOptionalImplementationLicenseText() );
		}

		if( popObj == null ) {
			getJavaFXEditorCopyrightPeriod().setStringValue( null );
		}
		else {
			getJavaFXEditorCopyrightPeriod().setStringValue( popObj.getRequiredCopyrightPeriod() );
		}

		if( popObj == null ) {
			getJavaFXEditorCopyrightHolder().setStringValue( null );
		}
		else {
			getJavaFXEditorCopyrightHolder().setStringValue( popObj.getRequiredCopyrightHolder() );
		}

		if( popObj == null ) {
			getJavaFXEditorAuthorEMail().setStringValue( null );
		}
		else {
			getJavaFXEditorAuthorEMail().setStringValue( popObj.getRequiredAuthorEMail() );
		}

		if( popObj == null ) {
			getJavaFXEditorProjectURL().setStringValue( null );
		}
		else {
			getJavaFXEditorProjectURL().setStringValue( popObj.getRequiredProjectURL() );
		}

		if( popObj == null ) {
			getJavaFXEditorPublishURI().setStringValue( null );
		}
		else {
			getJavaFXEditorPublishURI().setStringValue( popObj.getRequiredPublishURI() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJSchemaObjImport().setTextValue( popObj.getOptionalJSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSchemaObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorJSchemaObjInterface().setTextValue( popObj.getOptionalJSchemaObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJSchemaObjMembers().setTextValue( popObj.getOptionalJSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJSchemaObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorJSchemaObjImplementation().setTextValue( popObj.getOptionalJSchemaObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorJDb2LUWSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJDb2LUWSchemaObjMembers().setTextValue( popObj.getOptionalJDb2LUWSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJDb2LUWSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorJDb2LUWSchemaObjImpl().setTextValue( popObj.getOptionalJDb2LUWSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorJDb2LUWSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJDb2LUWSchemaObjImport().setTextValue( popObj.getOptionalJDb2LUWSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMSSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJMSSqlSchemaObjMembers().setTextValue( popObj.getOptionalJMSSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMSSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorJMSSqlSchemaObjImpl().setTextValue( popObj.getOptionalJMSSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMSSqlSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJMSSqlSchemaObjImport().setTextValue( popObj.getOptionalJMSSqlSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMySqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJMySqlSchemaObjMembers().setTextValue( popObj.getOptionalJMySqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMySqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorJMySqlSchemaObjImpl().setTextValue( popObj.getOptionalJMySqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorJMySqlSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJMySqlSchemaObjImport().setTextValue( popObj.getOptionalJMySqlSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJOracleSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJOracleSchemaObjMembers().setTextValue( popObj.getOptionalJOracleSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJOracleSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorJOracleSchemaObjImpl().setTextValue( popObj.getOptionalJOracleSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorJOracleSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJOracleSchemaObjImport().setTextValue( popObj.getOptionalJOracleSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJPgSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJPgSqlSchemaObjMembers().setTextValue( popObj.getOptionalJPgSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJPgSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorJPgSqlSchemaObjImpl().setTextValue( popObj.getOptionalJPgSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorJPgSqlSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJPgSqlSchemaObjImport().setTextValue( popObj.getOptionalJPgSqlSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJRamSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorJRamSchemaObjMembers().setTextValue( popObj.getOptionalJRamSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJRamSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorJRamSchemaObjImpl().setTextValue( popObj.getOptionalJRamSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorJRamSchemaObjImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJRamSchemaObjImport().setTextValue( popObj.getOptionalJRamSchemaObjImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgSchemaImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgSchemaImport().setTextValue( popObj.getOptionalJXMsgSchemaImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgSchemaFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgSchemaFormatters().setTextValue( popObj.getOptionalJXMsgSchemaFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgClientSchemaImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgClientSchemaImport().setTextValue( popObj.getOptionalJXMsgClientSchemaImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgClientSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgClientSchemaBody().setTextValue( popObj.getOptionalJXMsgClientSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstSchemaBody().setTextValue( popObj.getOptionalJXMsgRqstSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstSchemaImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstSchemaImport().setTextValue( popObj.getOptionalJXMsgRqstSchemaImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstSchemaWireParsers().setTextValue( popObj.getOptionalJXMsgRqstSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstSchemaXsdSpec().setTextValue( popObj.getOptionalJXMsgRqstSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRqstSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRqstSchemaXsdElementList().setTextValue( popObj.getOptionalJXMsgRqstSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnSchemaBody().setTextValue( popObj.getOptionalJXMsgRspnSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnSchemaImport().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnSchemaImport().setTextValue( popObj.getOptionalJXMsgRspnSchemaImport() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnSchemaWireParsers().setTextValue( popObj.getOptionalJXMsgRspnSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnSchemaXsdElementList().setTextValue( popObj.getOptionalJXMsgRspnSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorJXMsgRspnSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorJXMsgRspnSchemaXsdSpec().setTextValue( popObj.getOptionalJXMsgRspnSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSchemaObjInclude().setTextValue( popObj.getOptionalCppSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSchemaObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSchemaObjInterface().setTextValue( popObj.getOptionalCppSchemaObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSchemaObjMembers().setTextValue( popObj.getOptionalCppSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppSchemaObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCppSchemaObjImplementation().setTextValue( popObj.getOptionalCppSchemaObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppDb2LUWSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppDb2LUWSchemaObjMembers().setTextValue( popObj.getOptionalCppDb2LUWSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppDb2LUWSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCppDb2LUWSchemaObjImpl().setTextValue( popObj.getOptionalCppDb2LUWSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppDb2LUWSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppDb2LUWSchemaObjInclude().setTextValue( popObj.getOptionalCppDb2LUWSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMSSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMSSqlSchemaObjMembers().setTextValue( popObj.getOptionalCppMSSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMSSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMSSqlSchemaObjImpl().setTextValue( popObj.getOptionalCppMSSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMSSqlSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMSSqlSchemaObjInclude().setTextValue( popObj.getOptionalCppMSSqlSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMySqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMySqlSchemaObjMembers().setTextValue( popObj.getOptionalCppMySqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMySqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMySqlSchemaObjImpl().setTextValue( popObj.getOptionalCppMySqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppMySqlSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppMySqlSchemaObjInclude().setTextValue( popObj.getOptionalCppMySqlSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppOracleSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppOracleSchemaObjMembers().setTextValue( popObj.getOptionalCppOracleSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppOracleSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCppOracleSchemaObjImpl().setTextValue( popObj.getOptionalCppOracleSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppOracleSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppOracleSchemaObjInclude().setTextValue( popObj.getOptionalCppOracleSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppPgSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppPgSqlSchemaObjMembers().setTextValue( popObj.getOptionalCppPgSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppPgSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCppPgSqlSchemaObjImpl().setTextValue( popObj.getOptionalCppPgSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppPgSqlSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppPgSqlSchemaObjInclude().setTextValue( popObj.getOptionalCppPgSqlSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppRamSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppRamSchemaObjMembers().setTextValue( popObj.getOptionalCppRamSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppRamSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCppRamSchemaObjImpl().setTextValue( popObj.getOptionalCppRamSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppRamSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppRamSchemaObjInclude().setTextValue( popObj.getOptionalCppRamSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgSchemaInclude().setTextValue( popObj.getOptionalCppXMsgSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgSchemaFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgSchemaFormatters().setTextValue( popObj.getOptionalCppXMsgSchemaFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgClientSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgClientSchemaInclude().setTextValue( popObj.getOptionalCppXMsgClientSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgClientSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgClientSchemaBody().setTextValue( popObj.getOptionalCppXMsgClientSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstSchemaBody().setTextValue( popObj.getOptionalCppXMsgRqstSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstSchemaInclude().setTextValue( popObj.getOptionalCppXMsgRqstSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstSchemaWireParsers().setTextValue( popObj.getOptionalCppXMsgRqstSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstSchemaXsdSpec().setTextValue( popObj.getOptionalCppXMsgRqstSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRqstSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRqstSchemaXsdElementList().setTextValue( popObj.getOptionalCppXMsgRqstSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnSchemaBody().setTextValue( popObj.getOptionalCppXMsgRspnSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnSchemaInclude().setTextValue( popObj.getOptionalCppXMsgRspnSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnSchemaWireParsers().setTextValue( popObj.getOptionalCppXMsgRspnSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnSchemaXsdElementList().setTextValue( popObj.getOptionalCppXMsgRspnSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorCppXMsgRspnSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorCppXMsgRspnSchemaXsdSpec().setTextValue( popObj.getOptionalCppXMsgRspnSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSchemaObjInclude().setTextValue( popObj.getOptionalHppSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSchemaObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSchemaObjInterface().setTextValue( popObj.getOptionalHppSchemaObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSchemaObjMembers().setTextValue( popObj.getOptionalHppSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppSchemaObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorHppSchemaObjImplementation().setTextValue( popObj.getOptionalHppSchemaObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppDb2LUWSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppDb2LUWSchemaObjMembers().setTextValue( popObj.getOptionalHppDb2LUWSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppDb2LUWSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorHppDb2LUWSchemaObjImpl().setTextValue( popObj.getOptionalHppDb2LUWSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppDb2LUWSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppDb2LUWSchemaObjInclude().setTextValue( popObj.getOptionalHppDb2LUWSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMSSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMSSqlSchemaObjMembers().setTextValue( popObj.getOptionalHppMSSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMSSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMSSqlSchemaObjImpl().setTextValue( popObj.getOptionalHppMSSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMSSqlSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMSSqlSchemaObjInclude().setTextValue( popObj.getOptionalHppMSSqlSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMySqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMySqlSchemaObjMembers().setTextValue( popObj.getOptionalHppMySqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMySqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMySqlSchemaObjImpl().setTextValue( popObj.getOptionalHppMySqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppMySqlSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppMySqlSchemaObjInclude().setTextValue( popObj.getOptionalHppMySqlSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppOracleSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppOracleSchemaObjMembers().setTextValue( popObj.getOptionalHppOracleSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppOracleSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorHppOracleSchemaObjImpl().setTextValue( popObj.getOptionalHppOracleSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppOracleSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppOracleSchemaObjInclude().setTextValue( popObj.getOptionalHppOracleSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppPgSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppPgSqlSchemaObjMembers().setTextValue( popObj.getOptionalHppPgSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppPgSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorHppPgSqlSchemaObjImpl().setTextValue( popObj.getOptionalHppPgSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppPgSqlSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppPgSqlSchemaObjInclude().setTextValue( popObj.getOptionalHppPgSqlSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppRamSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppRamSchemaObjMembers().setTextValue( popObj.getOptionalHppRamSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppRamSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorHppRamSchemaObjImpl().setTextValue( popObj.getOptionalHppRamSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppRamSchemaObjInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppRamSchemaObjInclude().setTextValue( popObj.getOptionalHppRamSchemaObjInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgSchemaInclude().setTextValue( popObj.getOptionalHppXMsgSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgSchemaFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgSchemaFormatters().setTextValue( popObj.getOptionalHppXMsgSchemaFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgClientSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgClientSchemaInclude().setTextValue( popObj.getOptionalHppXMsgClientSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgClientSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgClientSchemaBody().setTextValue( popObj.getOptionalHppXMsgClientSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstSchemaBody().setTextValue( popObj.getOptionalHppXMsgRqstSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstSchemaInclude().setTextValue( popObj.getOptionalHppXMsgRqstSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstSchemaWireParsers().setTextValue( popObj.getOptionalHppXMsgRqstSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstSchemaXsdSpec().setTextValue( popObj.getOptionalHppXMsgRqstSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRqstSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRqstSchemaXsdElementList().setTextValue( popObj.getOptionalHppXMsgRqstSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnSchemaBody().setTextValue( popObj.getOptionalHppXMsgRspnSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnSchemaInclude().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnSchemaInclude().setTextValue( popObj.getOptionalHppXMsgRspnSchemaInclude() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnSchemaWireParsers().setTextValue( popObj.getOptionalHppXMsgRspnSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnSchemaXsdElementList().setTextValue( popObj.getOptionalHppXMsgRspnSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorHppXMsgRspnSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorHppXMsgRspnSchemaXsdSpec().setTextValue( popObj.getOptionalHppXMsgRspnSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSchemaObjUsing().setTextValue( popObj.getOptionalCsSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSchemaObjInterface().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSchemaObjInterface().setTextValue( popObj.getOptionalCsSchemaObjInterface() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSchemaObjMembers().setTextValue( popObj.getOptionalCsSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsSchemaObjImplementation().setTextValue( null );
		}
		else {
			getJavaFXEditorCsSchemaObjImplementation().setTextValue( popObj.getOptionalCsSchemaObjImplementation() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsDb2LUWSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsDb2LUWSchemaObjMembers().setTextValue( popObj.getOptionalCsDb2LUWSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsDb2LUWSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCsDb2LUWSchemaObjImpl().setTextValue( popObj.getOptionalCsDb2LUWSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsDb2LUWSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsDb2LUWSchemaObjUsing().setTextValue( popObj.getOptionalCsDb2LUWSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMSSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMSSqlSchemaObjMembers().setTextValue( popObj.getOptionalCsMSSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMSSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMSSqlSchemaObjImpl().setTextValue( popObj.getOptionalCsMSSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMSSqlSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMSSqlSchemaObjUsing().setTextValue( popObj.getOptionalCsMSSqlSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMySqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMySqlSchemaObjMembers().setTextValue( popObj.getOptionalCsMySqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMySqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMySqlSchemaObjImpl().setTextValue( popObj.getOptionalCsMySqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsMySqlSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsMySqlSchemaObjUsing().setTextValue( popObj.getOptionalCsMySqlSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsOracleSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsOracleSchemaObjMembers().setTextValue( popObj.getOptionalCsOracleSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsOracleSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCsOracleSchemaObjImpl().setTextValue( popObj.getOptionalCsOracleSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsOracleSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsOracleSchemaObjUsing().setTextValue( popObj.getOptionalCsOracleSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsPgSqlSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsPgSqlSchemaObjMembers().setTextValue( popObj.getOptionalCsPgSqlSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsPgSqlSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCsPgSqlSchemaObjImpl().setTextValue( popObj.getOptionalCsPgSqlSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsPgSqlSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsPgSqlSchemaObjUsing().setTextValue( popObj.getOptionalCsPgSqlSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsRamSchemaObjMembers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsRamSchemaObjMembers().setTextValue( popObj.getOptionalCsRamSchemaObjMembers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsRamSchemaObjImpl().setTextValue( null );
		}
		else {
			getJavaFXEditorCsRamSchemaObjImpl().setTextValue( popObj.getOptionalCsRamSchemaObjImpl() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsRamSchemaObjUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsRamSchemaObjUsing().setTextValue( popObj.getOptionalCsRamSchemaObjUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgSchemaUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgSchemaUsing().setTextValue( popObj.getOptionalCsXMsgSchemaUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgSchemaFormatters().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgSchemaFormatters().setTextValue( popObj.getOptionalCsXMsgSchemaFormatters() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgClientSchemaUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgClientSchemaUsing().setTextValue( popObj.getOptionalCsXMsgClientSchemaUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgClientSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgClientSchemaBody().setTextValue( popObj.getOptionalCsXMsgClientSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstSchemaBody().setTextValue( popObj.getOptionalCsXMsgRqstSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstSchemaUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstSchemaUsing().setTextValue( popObj.getOptionalCsXMsgRqstSchemaUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstSchemaWireParsers().setTextValue( popObj.getOptionalCsXMsgRqstSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstSchemaXsdSpec().setTextValue( popObj.getOptionalCsXMsgRqstSchemaXsdSpec() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRqstSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRqstSchemaXsdElementList().setTextValue( popObj.getOptionalCsXMsgRqstSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnSchemaBody().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnSchemaBody().setTextValue( popObj.getOptionalCsXMsgRspnSchemaBody() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnSchemaUsing().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnSchemaUsing().setTextValue( popObj.getOptionalCsXMsgRspnSchemaUsing() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnSchemaWireParsers().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnSchemaWireParsers().setTextValue( popObj.getOptionalCsXMsgRspnSchemaWireParsers() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnSchemaXsdElementList().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnSchemaXsdElementList().setTextValue( popObj.getOptionalCsXMsgRspnSchemaXsdElementList() );
		}

		if( popObj == null ) {
			getJavaFXEditorCsXMsgRspnSchemaXsdSpec().setTextValue( null );
		}
		else {
			getJavaFXEditorCsXMsgRspnSchemaXsdSpec().setTextValue( popObj.getOptionalCsXMsgRspnSchemaXsdSpec() );
		}
	}

	public void postFields()
	{
		final String S_ProcName = "postFields";
		ICFBamSchemaDefObj focus = getJavaFXFocusAsSchemaDef();
		ICFBamSchemaDefEditObj editObj;
		if( focus != null ) {
			editObj = (ICFBamSchemaDefEditObj)(focus.getEdit());
		}
		else {
			editObj = null;
		}
		if( editObj == null ) {
			throw new CFLibUsageException( getClass(),
				S_ProcName,
				"Pane is unfocused or is not editing the focus object" );
		}

		if( getJavaFXEditorName().getStringValue() == null ) {
			editObj.setRequiredName( "" );
		}
		else {
			editObj.setRequiredName( getJavaFXEditorName().getStringValue() );
		}

		if( ( getJavaFXEditorDbName().getStringValue() != null ) && ( getJavaFXEditorDbName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDbName( null );
		}
		else {
			editObj.setOptionalDbName( getJavaFXEditorDbName().getStringValue() );
		}

		if( ( getJavaFXEditorShortName().getStringValue() != null ) && ( getJavaFXEditorShortName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalShortName( null );
		}
		else {
			editObj.setOptionalShortName( getJavaFXEditorShortName().getStringValue() );
		}

		if( ( getJavaFXEditorLabel().getStringValue() != null ) && ( getJavaFXEditorLabel().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalLabel( null );
		}
		else {
			editObj.setOptionalLabel( getJavaFXEditorLabel().getStringValue() );
		}

		if( ( getJavaFXEditorShortDescription().getStringValue() != null ) && ( getJavaFXEditorShortDescription().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalShortDescription( null );
		}
		else {
			editObj.setOptionalShortDescription( getJavaFXEditorShortDescription().getStringValue() );
		}

		if( ( getJavaFXEditorDescription().getStringValue() != null ) && ( getJavaFXEditorDescription().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalDescription( null );
		}
		else {
			editObj.setOptionalDescription( getJavaFXEditorDescription().getStringValue() );
		}

		if( getJavaFXEditorPublicLicenseName().getStringValue() == null ) {
			editObj.setRequiredPublicLicenseName( "" );
		}
		else {
			editObj.setRequiredPublicLicenseName( getJavaFXEditorPublicLicenseName().getStringValue() );
		}

		if( getJavaFXEditorPublicLicenseText().getTextValue() == null ) {
			editObj.setRequiredPublicLicenseText( "" );
		}
		else {
			editObj.setRequiredPublicLicenseText( getJavaFXEditorPublicLicenseText().getTextValue() );
		}

		if( ( getJavaFXEditorImplementationLicenseName().getStringValue() != null ) && ( getJavaFXEditorImplementationLicenseName().getStringValue().length() <= 0 ) ) {
			editObj.setOptionalImplementationLicenseName( null );
		}
		else {
			editObj.setOptionalImplementationLicenseName( getJavaFXEditorImplementationLicenseName().getStringValue() );
		}

		if( ( getJavaFXEditorImplementationLicenseText().getTextValue() != null ) && ( getJavaFXEditorImplementationLicenseText().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalImplementationLicenseText( null );
		}
		else {
			editObj.setOptionalImplementationLicenseText( getJavaFXEditorImplementationLicenseText().getTextValue() );
		}

		if( getJavaFXEditorCopyrightPeriod().getStringValue() == null ) {
			editObj.setRequiredCopyrightPeriod( "" );
		}
		else {
			editObj.setRequiredCopyrightPeriod( getJavaFXEditorCopyrightPeriod().getStringValue() );
		}

		if( getJavaFXEditorCopyrightHolder().getStringValue() == null ) {
			editObj.setRequiredCopyrightHolder( "" );
		}
		else {
			editObj.setRequiredCopyrightHolder( getJavaFXEditorCopyrightHolder().getStringValue() );
		}

		if( getJavaFXEditorAuthorEMail().getStringValue() == null ) {
			editObj.setRequiredAuthorEMail( "" );
		}
		else {
			editObj.setRequiredAuthorEMail( getJavaFXEditorAuthorEMail().getStringValue() );
		}

		if( getJavaFXEditorProjectURL().getStringValue() == null ) {
			editObj.setRequiredProjectURL( "" );
		}
		else {
			editObj.setRequiredProjectURL( getJavaFXEditorProjectURL().getStringValue() );
		}

		if( getJavaFXEditorPublishURI().getStringValue() == null ) {
			editObj.setRequiredPublishURI( "" );
		}
		else {
			editObj.setRequiredPublishURI( getJavaFXEditorPublishURI().getStringValue() );
		}

		if( ( getJavaFXEditorJSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJSchemaObjImport( getJavaFXEditorJSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJSchemaObjInterface().getTextValue() != null ) && ( getJavaFXEditorJSchemaObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSchemaObjInterface( null );
		}
		else {
			editObj.setOptionalJSchemaObjInterface( getJavaFXEditorJSchemaObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorJSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJSchemaObjMembers( getJavaFXEditorJSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJSchemaObjImplementation().getTextValue() != null ) && ( getJavaFXEditorJSchemaObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJSchemaObjImplementation( null );
		}
		else {
			editObj.setOptionalJSchemaObjImplementation( getJavaFXEditorJSchemaObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorJDb2LUWSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJDb2LUWSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJDb2LUWSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJDb2LUWSchemaObjMembers( getJavaFXEditorJDb2LUWSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJDb2LUWSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorJDb2LUWSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJDb2LUWSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalJDb2LUWSchemaObjImpl( getJavaFXEditorJDb2LUWSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorJDb2LUWSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJDb2LUWSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJDb2LUWSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJDb2LUWSchemaObjImport( getJavaFXEditorJDb2LUWSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJMSSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJMSSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMSSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJMSSqlSchemaObjMembers( getJavaFXEditorJMSSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJMSSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorJMSSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMSSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalJMSSqlSchemaObjImpl( getJavaFXEditorJMSSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorJMSSqlSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJMSSqlSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMSSqlSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJMSSqlSchemaObjImport( getJavaFXEditorJMSSqlSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJMySqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJMySqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMySqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJMySqlSchemaObjMembers( getJavaFXEditorJMySqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJMySqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorJMySqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMySqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalJMySqlSchemaObjImpl( getJavaFXEditorJMySqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorJMySqlSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJMySqlSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJMySqlSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJMySqlSchemaObjImport( getJavaFXEditorJMySqlSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJOracleSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJOracleSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJOracleSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJOracleSchemaObjMembers( getJavaFXEditorJOracleSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJOracleSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorJOracleSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJOracleSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalJOracleSchemaObjImpl( getJavaFXEditorJOracleSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorJOracleSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJOracleSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJOracleSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJOracleSchemaObjImport( getJavaFXEditorJOracleSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJPgSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJPgSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJPgSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJPgSqlSchemaObjMembers( getJavaFXEditorJPgSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJPgSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorJPgSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJPgSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalJPgSqlSchemaObjImpl( getJavaFXEditorJPgSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorJPgSqlSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJPgSqlSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJPgSqlSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJPgSqlSchemaObjImport( getJavaFXEditorJPgSqlSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJRamSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorJRamSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJRamSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalJRamSchemaObjMembers( getJavaFXEditorJRamSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorJRamSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorJRamSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJRamSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalJRamSchemaObjImpl( getJavaFXEditorJRamSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorJRamSchemaObjImport().getTextValue() != null ) && ( getJavaFXEditorJRamSchemaObjImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJRamSchemaObjImport( null );
		}
		else {
			editObj.setOptionalJRamSchemaObjImport( getJavaFXEditorJRamSchemaObjImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgSchemaImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgSchemaImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgSchemaImport( null );
		}
		else {
			editObj.setOptionalJXMsgSchemaImport( getJavaFXEditorJXMsgSchemaImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgSchemaFormatters().getTextValue() != null ) && ( getJavaFXEditorJXMsgSchemaFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgSchemaFormatters( null );
		}
		else {
			editObj.setOptionalJXMsgSchemaFormatters( getJavaFXEditorJXMsgSchemaFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgClientSchemaImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgClientSchemaImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgClientSchemaImport( null );
		}
		else {
			editObj.setOptionalJXMsgClientSchemaImport( getJavaFXEditorJXMsgClientSchemaImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgClientSchemaBody().getTextValue() != null ) && ( getJavaFXEditorJXMsgClientSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgClientSchemaBody( null );
		}
		else {
			editObj.setOptionalJXMsgClientSchemaBody( getJavaFXEditorJXMsgClientSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstSchemaBody().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstSchemaBody( null );
		}
		else {
			editObj.setOptionalJXMsgRqstSchemaBody( getJavaFXEditorJXMsgRqstSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstSchemaImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstSchemaImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstSchemaImport( null );
		}
		else {
			editObj.setOptionalJXMsgRqstSchemaImport( getJavaFXEditorJXMsgRqstSchemaImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalJXMsgRqstSchemaWireParsers( getJavaFXEditorJXMsgRqstSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalJXMsgRqstSchemaXsdSpec( getJavaFXEditorJXMsgRqstSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRqstSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorJXMsgRqstSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRqstSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalJXMsgRqstSchemaXsdElementList( getJavaFXEditorJXMsgRqstSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnSchemaBody().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnSchemaBody( null );
		}
		else {
			editObj.setOptionalJXMsgRspnSchemaBody( getJavaFXEditorJXMsgRspnSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnSchemaImport().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnSchemaImport().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnSchemaImport( null );
		}
		else {
			editObj.setOptionalJXMsgRspnSchemaImport( getJavaFXEditorJXMsgRspnSchemaImport().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalJXMsgRspnSchemaWireParsers( getJavaFXEditorJXMsgRspnSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalJXMsgRspnSchemaXsdElementList( getJavaFXEditorJXMsgRspnSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorJXMsgRspnSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorJXMsgRspnSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalJXMsgRspnSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalJXMsgRspnSchemaXsdSpec( getJavaFXEditorJXMsgRspnSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorCppSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppSchemaObjInclude( getJavaFXEditorCppSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppSchemaObjInterface().getTextValue() != null ) && ( getJavaFXEditorCppSchemaObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSchemaObjInterface( null );
		}
		else {
			editObj.setOptionalCppSchemaObjInterface( getJavaFXEditorCppSchemaObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCppSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppSchemaObjMembers( getJavaFXEditorCppSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppSchemaObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCppSchemaObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppSchemaObjImplementation( null );
		}
		else {
			editObj.setOptionalCppSchemaObjImplementation( getJavaFXEditorCppSchemaObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCppDb2LUWSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppDb2LUWSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppDb2LUWSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppDb2LUWSchemaObjMembers( getJavaFXEditorCppDb2LUWSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppDb2LUWSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCppDb2LUWSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppDb2LUWSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCppDb2LUWSchemaObjImpl( getJavaFXEditorCppDb2LUWSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCppDb2LUWSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppDb2LUWSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppDb2LUWSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppDb2LUWSchemaObjInclude( getJavaFXEditorCppDb2LUWSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppMSSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppMSSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMSSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppMSSqlSchemaObjMembers( getJavaFXEditorCppMSSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppMSSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCppMSSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMSSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCppMSSqlSchemaObjImpl( getJavaFXEditorCppMSSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCppMSSqlSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppMSSqlSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMSSqlSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppMSSqlSchemaObjInclude( getJavaFXEditorCppMSSqlSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppMySqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppMySqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMySqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppMySqlSchemaObjMembers( getJavaFXEditorCppMySqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppMySqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCppMySqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMySqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCppMySqlSchemaObjImpl( getJavaFXEditorCppMySqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCppMySqlSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppMySqlSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppMySqlSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppMySqlSchemaObjInclude( getJavaFXEditorCppMySqlSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppOracleSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppOracleSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppOracleSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppOracleSchemaObjMembers( getJavaFXEditorCppOracleSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppOracleSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCppOracleSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppOracleSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCppOracleSchemaObjImpl( getJavaFXEditorCppOracleSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCppOracleSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppOracleSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppOracleSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppOracleSchemaObjInclude( getJavaFXEditorCppOracleSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppPgSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppPgSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppPgSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppPgSqlSchemaObjMembers( getJavaFXEditorCppPgSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppPgSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCppPgSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppPgSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCppPgSqlSchemaObjImpl( getJavaFXEditorCppPgSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCppPgSqlSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppPgSqlSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppPgSqlSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppPgSqlSchemaObjInclude( getJavaFXEditorCppPgSqlSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppRamSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCppRamSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppRamSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCppRamSchemaObjMembers( getJavaFXEditorCppRamSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCppRamSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCppRamSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppRamSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCppRamSchemaObjImpl( getJavaFXEditorCppRamSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCppRamSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorCppRamSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppRamSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalCppRamSchemaObjInclude( getJavaFXEditorCppRamSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgSchemaInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgSchemaInclude( getJavaFXEditorCppXMsgSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgSchemaFormatters().getTextValue() != null ) && ( getJavaFXEditorCppXMsgSchemaFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgSchemaFormatters( null );
		}
		else {
			editObj.setOptionalCppXMsgSchemaFormatters( getJavaFXEditorCppXMsgSchemaFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgClientSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgClientSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgClientSchemaInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgClientSchemaInclude( getJavaFXEditorCppXMsgClientSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgClientSchemaBody().getTextValue() != null ) && ( getJavaFXEditorCppXMsgClientSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgClientSchemaBody( null );
		}
		else {
			editObj.setOptionalCppXMsgClientSchemaBody( getJavaFXEditorCppXMsgClientSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstSchemaBody().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstSchemaBody( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstSchemaBody( getJavaFXEditorCppXMsgRqstSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstSchemaInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstSchemaInclude( getJavaFXEditorCppXMsgRqstSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstSchemaWireParsers( getJavaFXEditorCppXMsgRqstSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstSchemaXsdSpec( getJavaFXEditorCppXMsgRqstSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRqstSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRqstSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRqstSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalCppXMsgRqstSchemaXsdElementList( getJavaFXEditorCppXMsgRqstSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnSchemaBody().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnSchemaBody( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnSchemaBody( getJavaFXEditorCppXMsgRspnSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnSchemaInclude( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnSchemaInclude( getJavaFXEditorCppXMsgRspnSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnSchemaWireParsers( getJavaFXEditorCppXMsgRspnSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnSchemaXsdElementList( getJavaFXEditorCppXMsgRspnSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorCppXMsgRspnSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorCppXMsgRspnSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCppXMsgRspnSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalCppXMsgRspnSchemaXsdSpec( getJavaFXEditorCppXMsgRspnSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorHppSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppSchemaObjInclude( getJavaFXEditorHppSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppSchemaObjInterface().getTextValue() != null ) && ( getJavaFXEditorHppSchemaObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSchemaObjInterface( null );
		}
		else {
			editObj.setOptionalHppSchemaObjInterface( getJavaFXEditorHppSchemaObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorHppSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppSchemaObjMembers( getJavaFXEditorHppSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppSchemaObjImplementation().getTextValue() != null ) && ( getJavaFXEditorHppSchemaObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppSchemaObjImplementation( null );
		}
		else {
			editObj.setOptionalHppSchemaObjImplementation( getJavaFXEditorHppSchemaObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorHppDb2LUWSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppDb2LUWSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppDb2LUWSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppDb2LUWSchemaObjMembers( getJavaFXEditorHppDb2LUWSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppDb2LUWSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorHppDb2LUWSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppDb2LUWSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalHppDb2LUWSchemaObjImpl( getJavaFXEditorHppDb2LUWSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorHppDb2LUWSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppDb2LUWSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppDb2LUWSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppDb2LUWSchemaObjInclude( getJavaFXEditorHppDb2LUWSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppMSSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppMSSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMSSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppMSSqlSchemaObjMembers( getJavaFXEditorHppMSSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppMSSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorHppMSSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMSSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalHppMSSqlSchemaObjImpl( getJavaFXEditorHppMSSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorHppMSSqlSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppMSSqlSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMSSqlSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppMSSqlSchemaObjInclude( getJavaFXEditorHppMSSqlSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppMySqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppMySqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMySqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppMySqlSchemaObjMembers( getJavaFXEditorHppMySqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppMySqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorHppMySqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMySqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalHppMySqlSchemaObjImpl( getJavaFXEditorHppMySqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorHppMySqlSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppMySqlSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppMySqlSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppMySqlSchemaObjInclude( getJavaFXEditorHppMySqlSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppOracleSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppOracleSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppOracleSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppOracleSchemaObjMembers( getJavaFXEditorHppOracleSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppOracleSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorHppOracleSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppOracleSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalHppOracleSchemaObjImpl( getJavaFXEditorHppOracleSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorHppOracleSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppOracleSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppOracleSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppOracleSchemaObjInclude( getJavaFXEditorHppOracleSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppPgSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppPgSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppPgSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppPgSqlSchemaObjMembers( getJavaFXEditorHppPgSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppPgSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorHppPgSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppPgSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalHppPgSqlSchemaObjImpl( getJavaFXEditorHppPgSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorHppPgSqlSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppPgSqlSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppPgSqlSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppPgSqlSchemaObjInclude( getJavaFXEditorHppPgSqlSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppRamSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorHppRamSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppRamSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalHppRamSchemaObjMembers( getJavaFXEditorHppRamSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorHppRamSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorHppRamSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppRamSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalHppRamSchemaObjImpl( getJavaFXEditorHppRamSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorHppRamSchemaObjInclude().getTextValue() != null ) && ( getJavaFXEditorHppRamSchemaObjInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppRamSchemaObjInclude( null );
		}
		else {
			editObj.setOptionalHppRamSchemaObjInclude( getJavaFXEditorHppRamSchemaObjInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgSchemaInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgSchemaInclude( getJavaFXEditorHppXMsgSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgSchemaFormatters().getTextValue() != null ) && ( getJavaFXEditorHppXMsgSchemaFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgSchemaFormatters( null );
		}
		else {
			editObj.setOptionalHppXMsgSchemaFormatters( getJavaFXEditorHppXMsgSchemaFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgClientSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgClientSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgClientSchemaInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgClientSchemaInclude( getJavaFXEditorHppXMsgClientSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgClientSchemaBody().getTextValue() != null ) && ( getJavaFXEditorHppXMsgClientSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgClientSchemaBody( null );
		}
		else {
			editObj.setOptionalHppXMsgClientSchemaBody( getJavaFXEditorHppXMsgClientSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstSchemaBody().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstSchemaBody( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstSchemaBody( getJavaFXEditorHppXMsgRqstSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstSchemaInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstSchemaInclude( getJavaFXEditorHppXMsgRqstSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstSchemaWireParsers( getJavaFXEditorHppXMsgRqstSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstSchemaXsdSpec( getJavaFXEditorHppXMsgRqstSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRqstSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRqstSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRqstSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalHppXMsgRqstSchemaXsdElementList( getJavaFXEditorHppXMsgRqstSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnSchemaBody().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnSchemaBody( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnSchemaBody( getJavaFXEditorHppXMsgRspnSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnSchemaInclude().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnSchemaInclude().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnSchemaInclude( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnSchemaInclude( getJavaFXEditorHppXMsgRspnSchemaInclude().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnSchemaWireParsers( getJavaFXEditorHppXMsgRspnSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnSchemaXsdElementList( getJavaFXEditorHppXMsgRspnSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorHppXMsgRspnSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorHppXMsgRspnSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalHppXMsgRspnSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalHppXMsgRspnSchemaXsdSpec( getJavaFXEditorHppXMsgRspnSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorCsSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsSchemaObjUsing( getJavaFXEditorCsSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsSchemaObjInterface().getTextValue() != null ) && ( getJavaFXEditorCsSchemaObjInterface().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSchemaObjInterface( null );
		}
		else {
			editObj.setOptionalCsSchemaObjInterface( getJavaFXEditorCsSchemaObjInterface().getTextValue() );
		}

		if( ( getJavaFXEditorCsSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsSchemaObjMembers( getJavaFXEditorCsSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsSchemaObjImplementation().getTextValue() != null ) && ( getJavaFXEditorCsSchemaObjImplementation().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsSchemaObjImplementation( null );
		}
		else {
			editObj.setOptionalCsSchemaObjImplementation( getJavaFXEditorCsSchemaObjImplementation().getTextValue() );
		}

		if( ( getJavaFXEditorCsDb2LUWSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsDb2LUWSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsDb2LUWSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsDb2LUWSchemaObjMembers( getJavaFXEditorCsDb2LUWSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsDb2LUWSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCsDb2LUWSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsDb2LUWSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCsDb2LUWSchemaObjImpl( getJavaFXEditorCsDb2LUWSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCsDb2LUWSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsDb2LUWSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsDb2LUWSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsDb2LUWSchemaObjUsing( getJavaFXEditorCsDb2LUWSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsMSSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsMSSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMSSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsMSSqlSchemaObjMembers( getJavaFXEditorCsMSSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsMSSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCsMSSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMSSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCsMSSqlSchemaObjImpl( getJavaFXEditorCsMSSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCsMSSqlSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsMSSqlSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMSSqlSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsMSSqlSchemaObjUsing( getJavaFXEditorCsMSSqlSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsMySqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsMySqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMySqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsMySqlSchemaObjMembers( getJavaFXEditorCsMySqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsMySqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCsMySqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMySqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCsMySqlSchemaObjImpl( getJavaFXEditorCsMySqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCsMySqlSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsMySqlSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsMySqlSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsMySqlSchemaObjUsing( getJavaFXEditorCsMySqlSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsOracleSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsOracleSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsOracleSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsOracleSchemaObjMembers( getJavaFXEditorCsOracleSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsOracleSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCsOracleSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsOracleSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCsOracleSchemaObjImpl( getJavaFXEditorCsOracleSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCsOracleSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsOracleSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsOracleSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsOracleSchemaObjUsing( getJavaFXEditorCsOracleSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsPgSqlSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsPgSqlSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsPgSqlSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsPgSqlSchemaObjMembers( getJavaFXEditorCsPgSqlSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsPgSqlSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCsPgSqlSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsPgSqlSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCsPgSqlSchemaObjImpl( getJavaFXEditorCsPgSqlSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCsPgSqlSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsPgSqlSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsPgSqlSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsPgSqlSchemaObjUsing( getJavaFXEditorCsPgSqlSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsRamSchemaObjMembers().getTextValue() != null ) && ( getJavaFXEditorCsRamSchemaObjMembers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsRamSchemaObjMembers( null );
		}
		else {
			editObj.setOptionalCsRamSchemaObjMembers( getJavaFXEditorCsRamSchemaObjMembers().getTextValue() );
		}

		if( ( getJavaFXEditorCsRamSchemaObjImpl().getTextValue() != null ) && ( getJavaFXEditorCsRamSchemaObjImpl().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsRamSchemaObjImpl( null );
		}
		else {
			editObj.setOptionalCsRamSchemaObjImpl( getJavaFXEditorCsRamSchemaObjImpl().getTextValue() );
		}

		if( ( getJavaFXEditorCsRamSchemaObjUsing().getTextValue() != null ) && ( getJavaFXEditorCsRamSchemaObjUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsRamSchemaObjUsing( null );
		}
		else {
			editObj.setOptionalCsRamSchemaObjUsing( getJavaFXEditorCsRamSchemaObjUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgSchemaUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgSchemaUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgSchemaUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgSchemaUsing( getJavaFXEditorCsXMsgSchemaUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgSchemaFormatters().getTextValue() != null ) && ( getJavaFXEditorCsXMsgSchemaFormatters().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgSchemaFormatters( null );
		}
		else {
			editObj.setOptionalCsXMsgSchemaFormatters( getJavaFXEditorCsXMsgSchemaFormatters().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgClientSchemaUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgClientSchemaUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgClientSchemaUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgClientSchemaUsing( getJavaFXEditorCsXMsgClientSchemaUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgClientSchemaBody().getTextValue() != null ) && ( getJavaFXEditorCsXMsgClientSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgClientSchemaBody( null );
		}
		else {
			editObj.setOptionalCsXMsgClientSchemaBody( getJavaFXEditorCsXMsgClientSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstSchemaBody().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstSchemaBody( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstSchemaBody( getJavaFXEditorCsXMsgRqstSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstSchemaUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstSchemaUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstSchemaUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstSchemaUsing( getJavaFXEditorCsXMsgRqstSchemaUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstSchemaWireParsers( getJavaFXEditorCsXMsgRqstSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstSchemaXsdSpec( getJavaFXEditorCsXMsgRqstSchemaXsdSpec().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRqstSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRqstSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRqstSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalCsXMsgRqstSchemaXsdElementList( getJavaFXEditorCsXMsgRqstSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnSchemaBody().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnSchemaBody().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnSchemaBody( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnSchemaBody( getJavaFXEditorCsXMsgRspnSchemaBody().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnSchemaUsing().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnSchemaUsing().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnSchemaUsing( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnSchemaUsing( getJavaFXEditorCsXMsgRspnSchemaUsing().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnSchemaWireParsers().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnSchemaWireParsers().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnSchemaWireParsers( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnSchemaWireParsers( getJavaFXEditorCsXMsgRspnSchemaWireParsers().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnSchemaXsdElementList().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnSchemaXsdElementList().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnSchemaXsdElementList( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnSchemaXsdElementList( getJavaFXEditorCsXMsgRspnSchemaXsdElementList().getTextValue() );
		}

		if( ( getJavaFXEditorCsXMsgRspnSchemaXsdSpec().getTextValue() != null ) && ( getJavaFXEditorCsXMsgRspnSchemaXsdSpec().getTextValue().length() <= 0 ) ) {
			editObj.setOptionalCsXMsgRspnSchemaXsdSpec( null );
		}
		else {
			editObj.setOptionalCsXMsgRspnSchemaXsdSpec( getJavaFXEditorCsXMsgRspnSchemaXsdSpec().getTextValue() );
		}
	}

	public void setPaneMode( CFPane.PaneMode value ) {
		final String S_ProcName = "setPaneMode";
		CFPane.PaneMode oldValue = getPaneMode();
		if( oldValue == value ) {
			return;
		}
		ICFBamSchemaDefObj focus = getJavaFXFocusAsSchemaDef();
		if( ( value != CFPane.PaneMode.Unknown ) && ( value != CFPane.PaneMode.View ) ) {
			if( focus == null ) {
				throw new CFLibNullArgumentException( getClass(),
					S_ProcName,
					0,
					"javaFXFocus" );
			}
		}
		ICFBamSchemaDefEditObj editObj;
		if( focus != null ) {
			editObj  = (ICFBamSchemaDefEditObj)focus.getEdit();
		}
		else {
			editObj = null;
		}
		switch( value ) {
			case Unknown:
				switch( oldValue ) {
					case Unknown:
						break;
					default:
						if( editObj != null ) {
							editObj.endEdit();
							editObj = null;
						}
						break;
				}
				break;
			case Add:
				switch( oldValue ) {
					case Unknown:
					case Add:
					case View:
						if( editObj == null ) {
							if( focus != null ) {
								if( ! focus.getIsNew() ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Transitioning to PaneMode Add requires Focus.getIsNew() to be true" );
								}
								editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Expected beginEdit() to return a new edition of the focus object" );
								}
							}
							else {
								throw new CFLibNullArgumentException( getClass(),
									S_ProcName,
									0,
									"focus" );
							}
						}
						break;
					case Edit:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode Edit to Add" );
					case Update:
						if( ( editObj == null ) || ( ! editObj.getIsNew() ) ) {
							throw new CFLibUsageException( getClass(),
								S_ProcName,
								"Cannot transition PaneMode Update to Add" );
						}
						break;
					case Delete:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode Delete to Add" );
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode default to Add" );
				}
				break;
			case View:
				switch( oldValue ) {
					case Unknown:
						break;
					case View:
						break;
					case Edit:
						break;
					case Update:
						break;
					case Delete:
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode " + oldValue + " to View" );
				}
				if( editObj != null ) {
					editObj.endEdit();
					editObj = null;
				}
				break;
			case Edit:
				switch( oldValue ) {
					case Unknown:
						if( editObj == null ) {
							editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case View:
						if( editObj == null ) {
							editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case Edit:
						if( editObj == null ) {
							editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					case Update:
						if( editObj == null ) {
							throw new CFLibUsageException( getClass(),
								S_ProcName,
								"Cannot transition PaneMode " + oldValue + " to Edit" ); 
						}
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode " + oldValue + " to Edit" ); 
				}
				break;
			case Update:
				if( ( oldValue != CFPane.PaneMode.Edit ) && ( oldValue != CFPane.PaneMode.Add ) ) {
					throw new CFLibUsageException( getClass(),
						S_ProcName,
						"Cannot transition from mode " + oldValue + " to Update" );
				}
				super.setPaneMode( value );
				if( editObj != null ) {
					postFields();
					if( editObj.getIsNew() ) {
						focus = (ICFBamSchemaDefObj)editObj.create();
						setJavaFXFocus( focus );
					}
					else {
						editObj.update();
					}
					editObj = null;
				}
				setPaneMode( CFPane.PaneMode.View );
				break;
			case Delete:
				switch( oldValue ) {
					case View:
						if( focus != null ) {
							if( editObj == null ) {
								editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Expected beginEdit() to return a new edition of the focus object" );
								}
							}
						}
						break;
					case Edit:
						if( focus != null ) {
							if( editObj == null ) {
								editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
								if( editObj == null ) {
									throw new CFLibUsageException( getClass(),
										S_ProcName,
										"Expected beginEdit() to return a new edition of the focus object" );
								}
							}
						}
						break;
					case Update:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode Update to Delete" ); 
					case Delete:
						if( editObj == null ) {
							editObj = (ICFBamSchemaDefEditObj)focus.beginEdit();
							if( editObj == null ) {
								throw new CFLibUsageException( getClass(),
									S_ProcName,
									"Expected beginEdit() to return a new edition of the focus object" );
							}
						}
						break;
					default:
						throw new CFLibUsageException( getClass(),
							S_ProcName,
							"Cannot transition PaneMode " + oldValue + " to Delete" ); 
				}
				editObj.deleteInstance();
				editObj = null;
				setJavaFXFocus( null );
				setPaneMode( CFPane.PaneMode.Unknown );
				break;
			default:
				switch( oldValue ) {
					case Unknown:
						break;
					default:
						if( editObj != null ) {
							editObj.endEdit();
							editObj = null;
						}
						break;
				}
				break;
		}
		super.setPaneMode( value );
		populateFields();
		adjustComponentEnableStates();
	}

	public void adjustComponentEnableStates() {
		CFPane.PaneMode mode = getPaneMode();
		boolean isEditing;
		switch( mode ) {
			case Unknown:
			case View:
			case Delete:
				isEditing = false;
				break;
			case Add:
			case Edit:
			case Update:
				isEditing = true;
				break;
			default:
				isEditing = false;
				break;
		}
		if( isEditing ) {
			ICFBamSchemaDefObj focus = getJavaFXFocusAsSchemaDef();
			if( focus == null ) {
				isEditing = false;
			}
			else if( null == focus.getEdit() ) {
				isEditing = false;
			}
		}
		if( javafxEditorId != null ) {
			javafxEditorId.setDisable( true );
		}
		if( javafxEditorName != null ) {
			javafxEditorName.setDisable( ! isEditing );
		}
		if( javafxEditorDbName != null ) {
			javafxEditorDbName.setDisable( ! isEditing );
		}
		if( javafxEditorShortName != null ) {
			javafxEditorShortName.setDisable( ! isEditing );
		}
		if( javafxEditorLabel != null ) {
			javafxEditorLabel.setDisable( ! isEditing );
		}
		if( javafxEditorShortDescription != null ) {
			javafxEditorShortDescription.setDisable( ! isEditing );
		}
		if( javafxEditorDescription != null ) {
			javafxEditorDescription.setDisable( ! isEditing );
		}
		if( javafxEditorPublicLicenseName != null ) {
			javafxEditorPublicLicenseName.setDisable( ! isEditing );
		}
		if( javafxEditorPublicLicenseText != null ) {
			javafxEditorPublicLicenseText.setDisable( ! isEditing );
		}
		if( javafxEditorImplementationLicenseName != null ) {
			javafxEditorImplementationLicenseName.setDisable( ! isEditing );
		}
		if( javafxEditorImplementationLicenseText != null ) {
			javafxEditorImplementationLicenseText.setDisable( ! isEditing );
		}
		if( javafxEditorCopyrightPeriod != null ) {
			javafxEditorCopyrightPeriod.setDisable( ! isEditing );
		}
		if( javafxEditorCopyrightHolder != null ) {
			javafxEditorCopyrightHolder.setDisable( ! isEditing );
		}
		if( javafxEditorAuthorEMail != null ) {
			javafxEditorAuthorEMail.setDisable( ! isEditing );
		}
		if( javafxEditorProjectURL != null ) {
			javafxEditorProjectURL.setDisable( ! isEditing );
		}
		if( javafxEditorPublishURI != null ) {
			javafxEditorPublishURI.setDisable( ! isEditing );
		}
		if( javafxEditorJSchemaObjImport != null ) {
			javafxEditorJSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJSchemaObjInterface != null ) {
			javafxEditorJSchemaObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorJSchemaObjMembers != null ) {
			javafxEditorJSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJSchemaObjImplementation != null ) {
			javafxEditorJSchemaObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorJDb2LUWSchemaObjMembers != null ) {
			javafxEditorJDb2LUWSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJDb2LUWSchemaObjImpl != null ) {
			javafxEditorJDb2LUWSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorJDb2LUWSchemaObjImport != null ) {
			javafxEditorJDb2LUWSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJMSSqlSchemaObjMembers != null ) {
			javafxEditorJMSSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJMSSqlSchemaObjImpl != null ) {
			javafxEditorJMSSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorJMSSqlSchemaObjImport != null ) {
			javafxEditorJMSSqlSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJMySqlSchemaObjMembers != null ) {
			javafxEditorJMySqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJMySqlSchemaObjImpl != null ) {
			javafxEditorJMySqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorJMySqlSchemaObjImport != null ) {
			javafxEditorJMySqlSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJOracleSchemaObjMembers != null ) {
			javafxEditorJOracleSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJOracleSchemaObjImpl != null ) {
			javafxEditorJOracleSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorJOracleSchemaObjImport != null ) {
			javafxEditorJOracleSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJPgSqlSchemaObjMembers != null ) {
			javafxEditorJPgSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJPgSqlSchemaObjImpl != null ) {
			javafxEditorJPgSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorJPgSqlSchemaObjImport != null ) {
			javafxEditorJPgSqlSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJRamSchemaObjMembers != null ) {
			javafxEditorJRamSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorJRamSchemaObjImpl != null ) {
			javafxEditorJRamSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorJRamSchemaObjImport != null ) {
			javafxEditorJRamSchemaObjImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgSchemaImport != null ) {
			javafxEditorJXMsgSchemaImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgSchemaFormatters != null ) {
			javafxEditorJXMsgSchemaFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgClientSchemaImport != null ) {
			javafxEditorJXMsgClientSchemaImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgClientSchemaBody != null ) {
			javafxEditorJXMsgClientSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstSchemaBody != null ) {
			javafxEditorJXMsgRqstSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstSchemaImport != null ) {
			javafxEditorJXMsgRqstSchemaImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstSchemaWireParsers != null ) {
			javafxEditorJXMsgRqstSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstSchemaXsdSpec != null ) {
			javafxEditorJXMsgRqstSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRqstSchemaXsdElementList != null ) {
			javafxEditorJXMsgRqstSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnSchemaBody != null ) {
			javafxEditorJXMsgRspnSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnSchemaImport != null ) {
			javafxEditorJXMsgRspnSchemaImport.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnSchemaWireParsers != null ) {
			javafxEditorJXMsgRspnSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnSchemaXsdElementList != null ) {
			javafxEditorJXMsgRspnSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorJXMsgRspnSchemaXsdSpec != null ) {
			javafxEditorJXMsgRspnSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorCppSchemaObjInclude != null ) {
			javafxEditorCppSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppSchemaObjInterface != null ) {
			javafxEditorCppSchemaObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCppSchemaObjMembers != null ) {
			javafxEditorCppSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppSchemaObjImplementation != null ) {
			javafxEditorCppSchemaObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCppDb2LUWSchemaObjMembers != null ) {
			javafxEditorCppDb2LUWSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppDb2LUWSchemaObjImpl != null ) {
			javafxEditorCppDb2LUWSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCppDb2LUWSchemaObjInclude != null ) {
			javafxEditorCppDb2LUWSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppMSSqlSchemaObjMembers != null ) {
			javafxEditorCppMSSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppMSSqlSchemaObjImpl != null ) {
			javafxEditorCppMSSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCppMSSqlSchemaObjInclude != null ) {
			javafxEditorCppMSSqlSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppMySqlSchemaObjMembers != null ) {
			javafxEditorCppMySqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppMySqlSchemaObjImpl != null ) {
			javafxEditorCppMySqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCppMySqlSchemaObjInclude != null ) {
			javafxEditorCppMySqlSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppOracleSchemaObjMembers != null ) {
			javafxEditorCppOracleSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppOracleSchemaObjImpl != null ) {
			javafxEditorCppOracleSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCppOracleSchemaObjInclude != null ) {
			javafxEditorCppOracleSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppPgSqlSchemaObjMembers != null ) {
			javafxEditorCppPgSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppPgSqlSchemaObjImpl != null ) {
			javafxEditorCppPgSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCppPgSqlSchemaObjInclude != null ) {
			javafxEditorCppPgSqlSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppRamSchemaObjMembers != null ) {
			javafxEditorCppRamSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCppRamSchemaObjImpl != null ) {
			javafxEditorCppRamSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCppRamSchemaObjInclude != null ) {
			javafxEditorCppRamSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgSchemaInclude != null ) {
			javafxEditorCppXMsgSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgSchemaFormatters != null ) {
			javafxEditorCppXMsgSchemaFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgClientSchemaInclude != null ) {
			javafxEditorCppXMsgClientSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgClientSchemaBody != null ) {
			javafxEditorCppXMsgClientSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstSchemaBody != null ) {
			javafxEditorCppXMsgRqstSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstSchemaInclude != null ) {
			javafxEditorCppXMsgRqstSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstSchemaWireParsers != null ) {
			javafxEditorCppXMsgRqstSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstSchemaXsdSpec != null ) {
			javafxEditorCppXMsgRqstSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRqstSchemaXsdElementList != null ) {
			javafxEditorCppXMsgRqstSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnSchemaBody != null ) {
			javafxEditorCppXMsgRspnSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnSchemaInclude != null ) {
			javafxEditorCppXMsgRspnSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnSchemaWireParsers != null ) {
			javafxEditorCppXMsgRspnSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnSchemaXsdElementList != null ) {
			javafxEditorCppXMsgRspnSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorCppXMsgRspnSchemaXsdSpec != null ) {
			javafxEditorCppXMsgRspnSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorHppSchemaObjInclude != null ) {
			javafxEditorHppSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppSchemaObjInterface != null ) {
			javafxEditorHppSchemaObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorHppSchemaObjMembers != null ) {
			javafxEditorHppSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppSchemaObjImplementation != null ) {
			javafxEditorHppSchemaObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorHppDb2LUWSchemaObjMembers != null ) {
			javafxEditorHppDb2LUWSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppDb2LUWSchemaObjImpl != null ) {
			javafxEditorHppDb2LUWSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorHppDb2LUWSchemaObjInclude != null ) {
			javafxEditorHppDb2LUWSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppMSSqlSchemaObjMembers != null ) {
			javafxEditorHppMSSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppMSSqlSchemaObjImpl != null ) {
			javafxEditorHppMSSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorHppMSSqlSchemaObjInclude != null ) {
			javafxEditorHppMSSqlSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppMySqlSchemaObjMembers != null ) {
			javafxEditorHppMySqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppMySqlSchemaObjImpl != null ) {
			javafxEditorHppMySqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorHppMySqlSchemaObjInclude != null ) {
			javafxEditorHppMySqlSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppOracleSchemaObjMembers != null ) {
			javafxEditorHppOracleSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppOracleSchemaObjImpl != null ) {
			javafxEditorHppOracleSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorHppOracleSchemaObjInclude != null ) {
			javafxEditorHppOracleSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppPgSqlSchemaObjMembers != null ) {
			javafxEditorHppPgSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppPgSqlSchemaObjImpl != null ) {
			javafxEditorHppPgSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorHppPgSqlSchemaObjInclude != null ) {
			javafxEditorHppPgSqlSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppRamSchemaObjMembers != null ) {
			javafxEditorHppRamSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorHppRamSchemaObjImpl != null ) {
			javafxEditorHppRamSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorHppRamSchemaObjInclude != null ) {
			javafxEditorHppRamSchemaObjInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgSchemaInclude != null ) {
			javafxEditorHppXMsgSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgSchemaFormatters != null ) {
			javafxEditorHppXMsgSchemaFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgClientSchemaInclude != null ) {
			javafxEditorHppXMsgClientSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgClientSchemaBody != null ) {
			javafxEditorHppXMsgClientSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstSchemaBody != null ) {
			javafxEditorHppXMsgRqstSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstSchemaInclude != null ) {
			javafxEditorHppXMsgRqstSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstSchemaWireParsers != null ) {
			javafxEditorHppXMsgRqstSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstSchemaXsdSpec != null ) {
			javafxEditorHppXMsgRqstSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRqstSchemaXsdElementList != null ) {
			javafxEditorHppXMsgRqstSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnSchemaBody != null ) {
			javafxEditorHppXMsgRspnSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnSchemaInclude != null ) {
			javafxEditorHppXMsgRspnSchemaInclude.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnSchemaWireParsers != null ) {
			javafxEditorHppXMsgRspnSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnSchemaXsdElementList != null ) {
			javafxEditorHppXMsgRspnSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorHppXMsgRspnSchemaXsdSpec != null ) {
			javafxEditorHppXMsgRspnSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorCsSchemaObjUsing != null ) {
			javafxEditorCsSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsSchemaObjInterface != null ) {
			javafxEditorCsSchemaObjInterface.setDisable( ! isEditing );
		}
		if( javafxEditorCsSchemaObjMembers != null ) {
			javafxEditorCsSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsSchemaObjImplementation != null ) {
			javafxEditorCsSchemaObjImplementation.setDisable( ! isEditing );
		}
		if( javafxEditorCsDb2LUWSchemaObjMembers != null ) {
			javafxEditorCsDb2LUWSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsDb2LUWSchemaObjImpl != null ) {
			javafxEditorCsDb2LUWSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCsDb2LUWSchemaObjUsing != null ) {
			javafxEditorCsDb2LUWSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsMSSqlSchemaObjMembers != null ) {
			javafxEditorCsMSSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsMSSqlSchemaObjImpl != null ) {
			javafxEditorCsMSSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCsMSSqlSchemaObjUsing != null ) {
			javafxEditorCsMSSqlSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsMySqlSchemaObjMembers != null ) {
			javafxEditorCsMySqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsMySqlSchemaObjImpl != null ) {
			javafxEditorCsMySqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCsMySqlSchemaObjUsing != null ) {
			javafxEditorCsMySqlSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsOracleSchemaObjMembers != null ) {
			javafxEditorCsOracleSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsOracleSchemaObjImpl != null ) {
			javafxEditorCsOracleSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCsOracleSchemaObjUsing != null ) {
			javafxEditorCsOracleSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsPgSqlSchemaObjMembers != null ) {
			javafxEditorCsPgSqlSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsPgSqlSchemaObjImpl != null ) {
			javafxEditorCsPgSqlSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCsPgSqlSchemaObjUsing != null ) {
			javafxEditorCsPgSqlSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsRamSchemaObjMembers != null ) {
			javafxEditorCsRamSchemaObjMembers.setDisable( ! isEditing );
		}
		if( javafxEditorCsRamSchemaObjImpl != null ) {
			javafxEditorCsRamSchemaObjImpl.setDisable( ! isEditing );
		}
		if( javafxEditorCsRamSchemaObjUsing != null ) {
			javafxEditorCsRamSchemaObjUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgSchemaUsing != null ) {
			javafxEditorCsXMsgSchemaUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgSchemaFormatters != null ) {
			javafxEditorCsXMsgSchemaFormatters.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgClientSchemaUsing != null ) {
			javafxEditorCsXMsgClientSchemaUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgClientSchemaBody != null ) {
			javafxEditorCsXMsgClientSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstSchemaBody != null ) {
			javafxEditorCsXMsgRqstSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstSchemaUsing != null ) {
			javafxEditorCsXMsgRqstSchemaUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstSchemaWireParsers != null ) {
			javafxEditorCsXMsgRqstSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstSchemaXsdSpec != null ) {
			javafxEditorCsXMsgRqstSchemaXsdSpec.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRqstSchemaXsdElementList != null ) {
			javafxEditorCsXMsgRqstSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnSchemaBody != null ) {
			javafxEditorCsXMsgRspnSchemaBody.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnSchemaUsing != null ) {
			javafxEditorCsXMsgRspnSchemaUsing.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnSchemaWireParsers != null ) {
			javafxEditorCsXMsgRspnSchemaWireParsers.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnSchemaXsdElementList != null ) {
			javafxEditorCsXMsgRspnSchemaXsdElementList.setDisable( ! isEditing );
		}
		if( javafxEditorCsXMsgRspnSchemaXsdSpec != null ) {
			javafxEditorCsXMsgRspnSchemaXsdSpec.setDisable( ! isEditing );
		}
	}
}
