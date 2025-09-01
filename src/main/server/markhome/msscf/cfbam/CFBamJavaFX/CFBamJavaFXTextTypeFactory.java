// Description: Java 11 JavaFX Display Element Factory for TextType.

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
 *	CFBamJavaFXTextTypeFactory JavaFX Display Element Factory
 *	for TextType.
 */
public class CFBamJavaFXTextTypeFactory
implements ICFBamJavaFXTextTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXTextTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTextTypeObj argFocus ) {
		CFBamJavaFXTextTypeAttrPane retnew = new CFBamJavaFXTextTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamTextTypeObj argFocus,
		Collection<ICFBamTextTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXTextTypeListPane retnew = new CFBamJavaFXTextTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTextTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTextTypeObj> argDataCollection,
		ICFBamJavaFXTextTypeChosen whenChosen )
	{
		CFBamJavaFXTextTypePickerPane retnew = new CFBamJavaFXTextTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamTextTypeObj argFocus ) {
		CFBamJavaFXTextTypeEltTabPane retnew = new CFBamJavaFXTextTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamTextTypeObj argFocus ) {
		CFBamJavaFXTextTypeAddPane retnew = new CFBamJavaFXTextTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamTextTypeObj argFocus ) {
		CFBamJavaFXTextTypeViewEditPane retnew = new CFBamJavaFXTextTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTextTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXTextTypeAskDeleteForm retnew = new CFBamJavaFXTextTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTextTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamTextTypeObj> argDataCollection,
		ICFBamJavaFXTextTypeChosen whenChosen )
	{
		CFBamJavaFXTextTypePickerForm retnew = new CFBamJavaFXTextTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTextTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXTextTypeAddForm retnew = new CFBamJavaFXTextTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTextTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXTextTypeViewEditForm retnew = new CFBamJavaFXTextTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
