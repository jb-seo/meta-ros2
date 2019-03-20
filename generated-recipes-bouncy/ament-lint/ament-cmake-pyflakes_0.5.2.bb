# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The CMake API for ament_pyflakes to check code using pyflakes."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-core-native \
    ament-cmake-test-native \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-lint-cmake \
"

SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cmake_pyflakes/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "321ee8bdb840025b13ffaf0dc284f620"
SRC_URI[sha256sum] = "c163016f74ff96ef26a846f7df696ff9c2765f09289b1f6f66419fc1d6f77d85"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cmake_pyflakes-0.5.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ament-lint/ament-lint_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/ament-cmake-pyflakes-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ament-lint/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

