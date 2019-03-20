# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

RDEPENDS_${PN} = " \
    example-interfaces \
    rclpy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/demo_nodes_py/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "88d0a0d57d3668e162d0033afc976740"
SRC_URI[sha256sum] = "b3d380c8160021409498dab419680c45fc04f6be3885107746bae4ac0aafe601"
S = "${WORKDIR}/demos-release-release-bouncy-demo_nodes_py-0.5.1-1"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/demos/demos_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/demos/demos_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/demo-nodes-py-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/demos/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

