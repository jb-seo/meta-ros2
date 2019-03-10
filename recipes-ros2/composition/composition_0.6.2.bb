# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples for composing multiple nodes in a single process."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-cpp class-loader example-interfaces rclcpp rcutils rosidl-cmake rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/${PN}/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d262c6edd1a0c4c6167e2790bdf76c8"
SRC_URI[sha256sum] = "c85ad022454c92e1dd338ca1a30bf24033a260aa49eb582b4b022d35becba0e9"
S = "${WORKDIR}/demos-release-release-crystal-${PN}-0.6.2-0"

inherit catkin
