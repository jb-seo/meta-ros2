# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python nodes which were previously in the ros2/examples repository but are now just used for demo purposes."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "example-interfaces rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/demo_nodes_py/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "88d0a0d57d3668e162d0033afc976740"
SRC_URI[sha256sum] = "b3d380c8160021409498dab419680c45fc04f6be3885107746bae4ac0aafe601"
S = "${WORKDIR}/demos-release-release-bouncy-demo_nodes_py-0.5.1-1"

inherit catkin
