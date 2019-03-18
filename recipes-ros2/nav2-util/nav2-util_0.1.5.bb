# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " geometry-msgs nav2-msgs nav-msgs rclcpp sdl sdl-image tf2 tf2-ros"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_util/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a51352d9903325e38f8d91f9cad44b6"
SRC_URI[sha256sum] = "25d4fcda468d89847d08380ceb68339c992985c989567e95e7569e7968f72f94"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_util-0.1.5-0"

inherit ament
