# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs nav2-msgs nav2-robot nav2-tasks nav2-util nav-msgs rclcpp visualization-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_navfn_planner/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "635b1ea9af42eae5392fa2bbe75da531"
SRC_URI[sha256sum] = "85fc90aa37b855a3bce332801eb88b26c9a5c9dbfb9ad0621ea1e7fe03b8f07b"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_navfn_planner-0.1.5-0"

inherit catkin
