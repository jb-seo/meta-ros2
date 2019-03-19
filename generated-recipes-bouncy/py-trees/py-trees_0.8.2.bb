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

ROS_BUILD_DEPENDS = "python3-pydot-native python3-setuptools"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = "python3-nose python3-nose-yanc-native"

SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/bouncy/py_trees/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b6e10142e484b76991841e87711a968b"
SRC_URI[sha256sum] = "7a74e506f0962a511ef5f7d8ee989bcb004bef9640f3bfe5eb08bcc29b22882e"
S = "${WORKDIR}/py_trees-release-release-bouncy-py_trees-0.8.2-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/py-trees/py-trees-common.inc
include ${ROS_LAYERDIR}/recipes-ros2/py-trees/py-trees-common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees/py-trees-common-${PV}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/py-trees/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

