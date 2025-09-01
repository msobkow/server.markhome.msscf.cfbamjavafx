// Description: Java 11 JavaFX Display Element Factory for DoubleType.

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
 *	CFBamJavaFXDoubleTypeFactory JavaFX Display Element Factory
 *	for DoubleType.
 */
public class CFBamJavaFXDoubleTypeFactory
implements ICFBamJavaFXDoubleTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXDoubleTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus ) {
		CFBamJavaFXDoubleTypeAttrPane retnew = new CFBamJavaFXDoubleTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamDoubleTypeObj argFocus,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXDoubleTypeListPane retnew = new CFBamJavaFXDoubleTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDoubleTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
		ICFBamJavaFXDoubleTypeChosen whenChosen )
	{
		CFBamJavaFXDoubleTypePickerPane retnew = new CFBamJavaFXDoubleTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus ) {
		CFBamJavaFXDoubleTypeEltTabPane retnew = new CFBamJavaFXDoubleTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus ) {
		CFBamJavaFXDoubleTypeAddPane retnew = new CFBamJavaFXDoubleTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus ) {
		CFBamJavaFXDoubleTypeViewEditPane retnew = new CFBamJavaFXDoubleTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXDoubleTypeAskDeleteForm retnew = new CFBamJavaFXDoubleTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDoubleTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamDoubleTypeObj> argDataCollection,
		ICFBamJavaFXDoubleTypeChosen whenChosen )
	{
		CFBamJavaFXDoubleTypePickerForm retnew = new CFBamJavaFXDoubleTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXDoubleTypeAddForm retnew = new CFBamJavaFXDoubleTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDoubleTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXDoubleTypeViewEditForm retnew = new CFBamJavaFXDoubleTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
