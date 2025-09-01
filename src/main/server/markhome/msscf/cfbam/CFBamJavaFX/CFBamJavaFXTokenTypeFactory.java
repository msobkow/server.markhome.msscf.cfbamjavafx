// Description: Java 11 JavaFX Display Element Factory for TokenType.

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
 *	CFBamJavaFXTokenTypeFactory JavaFX Display Element Factory
 *	for TokenType.
 */
public class CFBamJavaFXTokenTypeFactory
implements ICFBamJavaFXTokenTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTokenTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTokenTypeObj argFocus ) {
		CFBamJavaFXTokenTypeAttrPane retnew = new CFBamJavaFXTokenTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamTokenTypeObj argFocus,
		Collection<ICFBamTokenTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTokenTypeListPane retnew = new CFBamJavaFXTokenTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTokenTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTokenTypeObj> argDataCollection,
		ICFBamJavaFXTokenTypeChosen whenChosen )
	{
		CFBamJavaFXTokenTypePickerPane retnew = new CFBamJavaFXTokenTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTokenTypeObj argFocus ) {
		CFBamJavaFXTokenTypeEltTabPane retnew = new CFBamJavaFXTokenTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTokenTypeObj argFocus ) {
		CFBamJavaFXTokenTypeAddPane retnew = new CFBamJavaFXTokenTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTokenTypeObj argFocus ) {
		CFBamJavaFXTokenTypeViewEditPane retnew = new CFBamJavaFXTokenTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTokenTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTokenTypeAskDeleteForm retnew = new CFBamJavaFXTokenTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTokenTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTokenTypeObj> argDataCollection,
		ICFBamJavaFXTokenTypeChosen whenChosen )
	{
		CFBamJavaFXTokenTypePickerForm retnew = new CFBamJavaFXTokenTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTokenTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTokenTypeAddForm retnew = new CFBamJavaFXTokenTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTokenTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTokenTypeViewEditForm retnew = new CFBamJavaFXTokenTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
