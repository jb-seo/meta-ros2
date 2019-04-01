# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://py-trees.readthedocs.io"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    python3-setuptools \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python3-pydot \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python3-nose \
    python3-nose-yanc \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/crystal/py_trees/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0568a499f3209b5bd4304b87c856b12c"
SRC_URI[sha256sum] = "32a12e0f712c4804635440a02637e4c52886bdcabc5c273e88d68a37cc0b31c3"
S = "${WORKDIR}/py_trees-release-release-crystal-py_trees-1.1.0-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/py-trees/py-trees_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/py-trees/py-trees_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees/py-trees-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}