// Description: Java 11 JavaFX Display Element Factory for SchemaDef.

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
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXSchemaDefFactory JavaFX Display Element Factory
 *	for SchemaDef.
 */
public class CFBamJavaFXSchemaDefFactory
implements ICFBamJavaFXSchemaDefFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXSchemaDefFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamSchemaDefObj argFocus ) {
		CFBamJavaFXSchemaDefAttrPane retnew = new CFBamJavaFXSchemaDefAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFIntMinorVersionObj argContainer,
		ICFBamSchemaDefObj argFocus,
		Collection<ICFBamSchemaDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXSchemaDefListPane retnew = new CFBamJavaFXSchemaDefListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argFocus,
		ICFIntMinorVersionObj argContainer,
		Collection<ICFBamSchemaDefObj> argDataCollection,
		ICFBamJavaFXSchemaDefChosen whenChosen )
	{
		CFBamJavaFXSchemaDefPickerPane retnew = new CFBamJavaFXSchemaDefPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamSchemaDefObj argFocus ) {
		CFBamJavaFXSchemaDefEltTabPane retnew = new CFBamJavaFXSchemaDefEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamSchemaDefObj argFocus ) {
		CFBamJavaFXSchemaDefAddPane retnew = new CFBamJavaFXSchemaDefAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamSchemaDefObj argFocus ) {
		CFBamJavaFXSchemaDefViewEditPane retnew = new CFBamJavaFXSchemaDefViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamSchemaDefObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXSchemaDefAskDeleteForm retnew = new CFBamJavaFXSchemaDefAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamSchemaDefObj argFocus,
		ICFIntMinorVersionObj argContainer,
		Collection<ICFBamSchemaDefObj> argDataCollection,
		ICFBamJavaFXSchemaDefChosen whenChosen )
	{
		CFBamJavaFXSchemaDefPickerForm retnew = new CFBamJavaFXSchemaDefPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamSchemaDefObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXSchemaDefAddForm retnew = new CFBamJavaFXSchemaDefAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamSchemaDefObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXSchemaDefViewEditForm retnew = new CFBamJavaFXSchemaDefViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
