# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "qt_gui provides the infrastructure for an integrated graphical user interface based on Qt.     It is extensible with Python- and C++-based plugins (implemented in separate packages) which can contribute arbitrary widgets.     It requires either PyQt or PySide bindings."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-index-python python3-catkin-pkg-modules python3-qt5-bindings python-qt-binding qt5-qmake tango-icon-theme"
SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/crystal/qt_gui/1.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b719eabd7ff60f14db927f0f95cc0b1f"
SRC_URI[sha256sum] = "e55f3120d946b1293506485fb15feca7531fa9caa80494ed117381a4d2e29153"
S = "${WORKDIR}/qt_gui_core-release-release-crystal-qt_gui-1.0.4-0"

inherit catkin
