# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and service definitions common among all ROS actions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces rosidl-default-generators rosidl-default-runtime unique-identifier-msgs"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/crystal/action_msgs/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ac4cc9e747ac5c8d755136df1ecb967b"
SRC_URI[sha256sum] = "bbbb6b47ed7f99ef99270356b61be72023e4a7344b9192686a125ba268d2e1ab"
S = "${WORKDIR}/rcl_interfaces-release-release-crystal-action_msgs-0.6.2-0"

inherit ament pythonpath-insane
