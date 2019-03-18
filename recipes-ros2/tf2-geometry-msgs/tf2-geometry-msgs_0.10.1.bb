# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_geometry_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " geometry-msgs orocos-kdl tf2 tf2-ros"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2_geometry_msgs/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4980645630a50094fb4cf71cfc1a2a07"
SRC_URI[sha256sum] = "7aafc1e2f356900c3a04bafeebdbacb50778dc3ac072aded38af027e0bb031b0"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2_geometry_msgs-0.10.1-0"

inherit ament pythonpath-insane
