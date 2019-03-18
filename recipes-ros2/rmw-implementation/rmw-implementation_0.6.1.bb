# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The decision which ROS middleware implementation should be used for C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " poco poco-vendor rcutils rmw rmw-connext-cpp rmw-fastrtps-cpp rmw-implementation-cmake rmw-opensplice-cpp"
SRC_URI = "https://github.com/ros2-gbp/rmw_implementation-release/archive/release/crystal/rmw_implementation/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9ff0cee82260542dc10b1295c2bd6abf"
SRC_URI[sha256sum] = "fd0cc3de840262b7d7a09f6593a8eb49dd1f2cbde4a0047e77b925a4b009ab91"
S = "${WORKDIR}/rmw_implementation-release-release-crystal-rmw_implementation-0.6.1-0"

inherit ament
