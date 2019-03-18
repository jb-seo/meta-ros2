# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Refactored map server for ROS2 Navigation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " bullet launch-ros launch-testing nav-msgs rclcpp sdl sdl-image std-msgs tf2 yaml-cpp-vendor"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_map_server/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7c603e487ae38c21ef5e504282eaa1f5"
SRC_URI[sha256sum] = "93991661aebecd5c9ee07df30936c216b634dd15bb736495a35cf665bcb83a1d"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_map_server-0.1.5-0"

inherit ament
