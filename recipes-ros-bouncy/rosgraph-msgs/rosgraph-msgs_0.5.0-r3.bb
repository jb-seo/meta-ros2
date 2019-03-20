# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages relating to the ROS Computation Graph.     These are generally considered to be low-level messages that end users do not interact with."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/bouncy/rosgraph_msgs/0.5.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a7e9c5c633af5a087f4a6f0a43cffa1c"
SRC_URI[sha256sum] = "eeff762153bc52dca209b9ab57d6205798227b12c754193c117e50900351e776"
S = "${WORKDIR}/rcl_interfaces-release-release-bouncy-rosgraph_msgs-0.5.0-3"


inherit ros
inherit ament
inherit pythonpath-insane

