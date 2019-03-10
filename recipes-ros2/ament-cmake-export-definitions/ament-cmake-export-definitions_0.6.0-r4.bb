# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to export definitions to downstream packages in the ament buildsystem."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-core"
SRC_URI = "https://github.com/ros2-gbp/ament_cmake-release/archive/release/crystal/ament_cmake_export_definitions/0.6.0-4.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a769f0321c7e72278672d5c6ef3666c1"
SRC_URI[sha256sum] = "2a14595e14182e5c4cd2d4a024204fa96b438874ecff65b0a45c0ce2974371b8"
S = "${WORKDIR}/ament_cmake-release-release-crystal-ament_cmake_export_definitions-0.6.0-4"

inherit catkin
